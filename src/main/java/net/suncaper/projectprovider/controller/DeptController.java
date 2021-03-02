package net.suncaper.projectprovider.controller;

import net.suncaper.projectprovider.domain.ProjectDept;
import net.suncaper.projectprovider.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    private DeptService deptService;

    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }

    @GetMapping("list")
    public List<ProjectDept> listDepts() {
        return  deptService.listDepts();
    }
}
