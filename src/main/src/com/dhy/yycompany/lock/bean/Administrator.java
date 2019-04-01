package com.dhy.yycompany.lock.bean;

public class Administrator {
    private Integer adminId;

    private String adminUuid;

    private String adminName;

    private String adminAvator;

    @Override
    public String toString() {
        return "Administrator{" +
                "adminId=" + adminId +
                ", adminUuid='" + adminUuid + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminAvator='" + adminAvator + '\'' +
                ", adminPermission=" + adminPermission +
                ", adminPhone='" + adminPhone + '\'' +
                ", adminAddress='" + adminAddress + '\'' +
                ", adminAccount='" + adminAccount + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminModify=" + adminModify +
                ", adminDelete=" + adminDelete +
                '}';
    }

    private Integer adminPermission;

    private String adminPhone;

    private String adminAddress;

    private String adminAccount;

    private String adminPassword;

    private Integer adminModify;

    private Integer adminDelete;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminUuid() {
        return adminUuid;
    }

    public void setAdminUuid(String adminUuid) {
        this.adminUuid = adminUuid == null ? null : adminUuid.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminAvator() {
        return adminAvator;
    }

    public void setAdminAvator(String adminAvator) {
        this.adminAvator = adminAvator == null ? null : adminAvator.trim();
    }

    public Integer getAdminPermission() {
        return adminPermission;
    }

    public void setAdminPermission(Integer adminPermission) {
        this.adminPermission = adminPermission;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress == null ? null : adminAddress.trim();
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Integer getAdminModify() {
        return adminModify;
    }

    public void setAdminModify(Integer adminModify) {
        this.adminModify = adminModify;
    }

    public Integer getAdminDelete() {
        return adminDelete;
    }

    public void setAdminDelete(Integer adminDelete) {
        this.adminDelete = adminDelete;
    }
}