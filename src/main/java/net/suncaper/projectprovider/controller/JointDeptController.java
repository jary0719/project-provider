package net.suncaper.projectprovider.controller;

import net.suncaper.projectprovider.domain.JointDept;
import net.suncaper.projectprovider.service.JointDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/joint-dept")
public class JointDeptController {
    @Autowired
    private JointDeptService jointDeptService;

    @GetMapping("/all")
    public List<JointDept> list() {
        return jointDeptService.list();
    }
}