package net.suncaper.projectprovider.domain;

public class ProjectDept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project_dept.id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project_dept.dept_name
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project_dept.id
     *
     * @return the value of pt_project_dept.id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project_dept.id
     *
     * @param id the value for pt_project_dept.id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project_dept.dept_name
     *
     * @return the value of pt_project_dept.dept_name
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project_dept.dept_name
     *
     * @param deptName the value for pt_project_dept.dept_name
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}