package net.suncaper.projectprovider.mapper;

import net.suncaper.projectprovider.domain.Project;
import net.suncaper.projecttracking.common.PageRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapperExt {
    Project selectProjectDetailById(@Param("id") Integer id);

    List<Project> selectProjectDetailsInIds(List<Integer> ids);
}
