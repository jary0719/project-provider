package net.suncaper.projectprovider.controller;

import net.suncaper.projectprovider.domain.JointCompany;
import net.suncaper.projectprovider.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class JointCompanyController {
    private CompanyService companyService;

    public JointCompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/list")
    public List<JointCompany> list() {
        return companyService.list();
    }
}
