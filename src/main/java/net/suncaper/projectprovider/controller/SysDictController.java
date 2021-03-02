package net.suncaper.projectprovider.controller;

import net.suncaper.projectprovider.domain.SysDict;
import net.suncaper.projectprovider.service.SysDictService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sys-dict")
public class SysDictController {
    private SysDictService sysDictService;

    public SysDictController(SysDictService sysDictService) {
        this.sysDictService = sysDictService;
    }

    @GetMapping("map")
    public Map<String, List<SysDict>> getSysDictsMap() {
        return sysDictService.getSysDictsMap();
    }
}
