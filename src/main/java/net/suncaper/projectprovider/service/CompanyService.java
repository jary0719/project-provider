package net.suncaper.projectprovider.service;

import net.suncaper.projectprovider.domain.JointCompany;
import net.suncaper.projectprovider.domain.JointCompanyExample;
import net.suncaper.projectprovider.mapper.JointCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private JointCompanyMapper jointCompanyMapper;


    public CompanyService(JointCompanyMapper jointCompanyMapper) {
        this.jointCompanyMapper = jointCompanyMapper;
    }

    public List<JointCompany> list() {
        return jointCompanyMapper.selectByExample(new JointCompanyExample());
    }
}
