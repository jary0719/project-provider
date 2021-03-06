package net.suncaper.projectprovider.mapper;

import java.util.List;
import net.suncaper.projectprovider.domain.JointDept;
import net.suncaper.projectprovider.domain.JointDeptExample;
import org.apache.ibatis.annotations.Param;

public interface JointDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    long countByExample(JointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int deleteByExample(JointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int insert(JointDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int insertSelective(JointDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    List<JointDept> selectByExample(JointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    JointDept selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") JointDept record, @Param("example") JointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByExample(@Param("record") JointDept record, @Param("example") JointDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByPrimaryKeySelective(JointDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    int updateByPrimaryKey(JointDept record);
}