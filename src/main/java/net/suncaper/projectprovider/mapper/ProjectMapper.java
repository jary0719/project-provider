package net.suncaper.projectprovider.mapper;

import java.util.List;
import net.suncaper.projectprovider.domain.Project;
import net.suncaper.projectprovider.domain.ProjectExample;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper extends ProjectMapperExt {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    long countByExample(ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int deleteByExample(ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int insert(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int insertSelective(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    List<Project> selectByExample(ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    Project selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByPrimaryKeySelective(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByPrimaryKey(Project record);
}