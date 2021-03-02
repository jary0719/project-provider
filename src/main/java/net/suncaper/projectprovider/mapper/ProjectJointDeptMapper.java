package net.suncaper.projectprovider.mapper;

import java.util.List;
import net.suncaper.projectprovider.domain.ProjectJointDeptExample;
import net.suncaper.projectprovider.domain.ProjectJointDeptKey;
import org.apache.ibatis.annotations.Param;

public interface ProjectJointDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    long countByExample(ProjectJointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int deleteByExample(ProjectJointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int deleteByPrimaryKey(ProjectJointDeptKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int insert(ProjectJointDeptKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int insertSelective(ProjectJointDeptKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    List<ProjectJointDeptKey> selectByExample(ProjectJointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProjectJointDeptKey record, @Param("example") ProjectJointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByExample(@Param("record") ProjectJointDeptKey record, @Param("example") ProjectJointDeptExample example);
}