package net.suncaper.projectprovider.domain;

public class ProjectJointCompanyKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project_joint_company.project_id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project_joint_company.joint_company_id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    private Integer jointCompanyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project_joint_company.project_id
     *
     * @return the value of pt_project_joint_company.project_id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project_joint_company.project_id
     *
     * @param projectId the value for pt_project_joint_company.project_id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project_joint_company.joint_company_id
     *
     * @return the value of pt_project_joint_company.joint_company_id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    public Integer getJointCompanyId() {
        return jointCompanyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project_joint_company.joint_company_id
     *
     * @param jointCompanyId the value for pt_project_joint_company.joint_company_id
     *
     * @mbg.generated Tue Dec 24 15:34:38 CST 2019
     */
    public void setJointCompanyId(Integer jointCompanyId) {
        this.jointCompanyId = jointCompanyId;
    }
}