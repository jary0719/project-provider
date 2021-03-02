package net.suncaper.projectprovider.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import net.suncaper.projectprovider.domain.*;
import net.suncaper.projectprovider.mapper.*;
import net.suncaper.projecttracking.common.PagableResponse;
import net.suncaper.projecttracking.common.PageRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProjectService {
    private final ProjectMapper projectMapper;
    private final ProjectJointCompanyMapper projectJointCompanyMapper;
    private final ProjectLeaderMapper projectLeaderMapper;
    private final ProjectImportanceMapper importanceMapper;
    private final ProjectJointDeptMapper projectJointDeptMapper;

    public Project getProjectDetailById(Integer id) {
        Project project = projectMapper.selectProjectDetailById(id);
        return project;
    }

    @Transactional
    public void saveProject(Project project) {
        projectMapper.insert(project);

        //Save project joint company.
        for (Integer jointCompanyId : project.getJointCompanyIds()) {
            ProjectJointCompanyKey key = new ProjectJointCompanyKey();
            key.setProjectId(project.getId());
            key.setJointCompanyId(jointCompanyId);

            projectJointCompanyMapper.insert(key);
        }

        for (Integer leaderId : project.getLeaderIds()) {
            ProjectLeaderKey key = new ProjectLeaderKey();
            key.setProjectId(project.getId());
            key.setUserId(leaderId);

            projectLeaderMapper.insert(key);
        }

        for (Integer importanceId : project.getImportanceIds()) {
            ProjectImportanceKey key = new ProjectImportanceKey();
            key.setProjectId(project.getId());
            key.setImportanceId(importanceId);

            importanceMapper.insert(key);
        }

        for (Integer deptId : project.getJointDeptIds()) {
            ProjectJointDeptKey key = new ProjectJointDeptKey();
            key.setProjectId(project.getId());
            key.setJointDeptId(deptId);

            projectJointDeptMapper.insert(key);
        }
    }

    @Transactional
    public void removeProject(Integer id) {
        ProjectJointCompanyExample projectJointCompanyExample = new ProjectJointCompanyExample();
        projectJointCompanyExample.createCriteria().andProjectIdEqualTo(id);
        projectJointCompanyMapper.deleteByExample(projectJointCompanyExample);

        //TODO: 删除子表

        //再删主表 pt_project
        projectMapper.deleteByPrimaryKey(id);
    }

    public PagableResponse<List<Project>> search(PageRequest request, String keyword) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        ProjectExample example = new ProjectExample();
        if(StringUtils.isNoneBlank(keyword)) {
            example.createCriteria().andNameLike("%" + keyword +"%");
        }
        List<Project> projectIds = projectMapper.selectByExample(example);
        List<Project> projects = projectMapper.selectProjectDetailsInIds(projectIds.stream().map(x -> x.getId()).collect(Collectors.toList()));

        //这里的total是多表join之后的数据条数，而不是mapper collection 处理后的结果
        return new PagableResponse<>(((Page) projectIds).getTotal(), projects);
    }
}
