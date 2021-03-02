package net.suncaper.projectprovider.service;

import net.suncaper.projectprovider.domain.JointDept;
import net.suncaper.projectprovider.domain.JointDeptExample;
import net.suncaper.projectprovider.mapper.JointDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JointDeptService {
    @Autowired
    private JointDeptMapper jointDeptMapper;

    public List<JointDept> list() {
        return jointDeptMapper.selectByExample(new JointDeptExample());
    }
}
