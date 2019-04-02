package com.dhy.yycompany.lock.bean;

public class PhoneUserInfo {
    private Integer pId;

    private String pUuid;

    private Integer pUId;

    private String pUserName;

    private String pAccountNum;

    private String pPassword;

    private Integer pDelete;

    private Integer pModify;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpUuid() {
        return pUuid;
    }

    public void setpUuid(String pUuid) {
        this.pUuid = pUuid == null ? null : pUuid.trim();
    }

    public Integer getpUId() {
        return pUId;
    }

    public void setpUId(Integer pUId) {
        this.pUId = pUId;
    }

    public String getpUserName() {
        return pUserName;
    }

    public void setpUserName(String pUserName) {
        this.pUserName = pUserName == null ? null : pUserName.trim();
    }

    public String getpAccountNum() {
        return pAccountNum;
    }

    public void setpAccountNum(String pAccountNum) {
        this.pAccountNum = pAccountNum == null ? null : pAccountNum.trim();
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword == null ? null : pPassword.trim();
    }

    public Integer getpDelete() {
        return pDelete;
    }

    public void setpDelete(Integer pDelete) {
        this.pDelete = pDelete;
    }

    public Integer getpModify() {
        return pModify;
    }

    public void setpModify(Integer pModify) {
        this.pModify = pModify;
    }
}