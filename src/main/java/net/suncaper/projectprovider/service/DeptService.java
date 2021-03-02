package net.suncaper.projectprovider.service;

import net.suncaper.projectprovider.domain.ProjectDept;
import net.suncaper.projectprovider.domain.ProjectDeptExample;
import net.suncaper.projectprovider.mapper.ProjectDeptMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    private ProjectDeptMapper projectDeptMapper;

    public DeptService(ProjectDeptMapper projectDeptMapper) {
        this.projectDeptMapper = projectDeptMapper;
    }

    public List<ProjectDept> listDepts() {
      return  projectDeptMapper.selectByExample(new ProjectDeptExample());
    }
}
