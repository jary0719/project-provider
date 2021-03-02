package net.suncaper.projectprovider.domain;

import java.util.List;

public class ProjectExt {
    private List<Integer> jointCompanyIds;
    private List<Integer> leaderIds;
    private List<Integer> importanceIds;
    private List<Integer> jointDeptIds;

    private List<JointCompany> jointCompanies;
    private ProjectDept projectDept;

    public List<Integer> getJointCompanyIds() {
        return jointCompanyIds;
    }

    public void setJointCompanyIds(List<Integer> jointCompanyIds) {
        this.jointCompanyIds = jointCompanyIds;
    }

    public List<Integer> getLeaderIds() {
        return leaderIds;
    }

    public void setLeaderIds(List<Integer> leaderIds) {
        this.leaderIds = leaderIds;
    }

    public List<Integer> getImportanceIds() {
        return importanceIds;
    }

    public void setImportanceIds(List<Integer> importanceIds) {
        this.importanceIds = importanceIds;
    }

    public List<Integer> getJointDeptIds() {
        return jointDeptIds;
    }

    public void setJointDeptIds(List<Integer> jointDeptIds) {
        this.jointDeptIds = jointDeptIds;
    }

    public List<JointCompany> getJointCompanies() {
        return jointCompanies;
    }

    public void setJointCompanies(List<JointCompany> jointCompanies) {
        this.jointCompanies = jointCompanies;
    }

    public ProjectDept getProjectDept() {
        return projectDept;
    }

    public void setProjectDept(ProjectDept projectDept) {
        this.projectDept = projectDept;
    }
}
