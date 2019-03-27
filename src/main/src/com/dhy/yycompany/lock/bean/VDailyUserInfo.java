package com.dhy.yycompany.lock.bean;

public class VDailyUserInfo {
    private Integer dId;

    private String dUuid;

    private Integer dUserId;

    private Integer dLockId;

    private String dTime;

    private Integer uId;

    private String uUuid;

    private Integer uRoomId;

    private String uName;

    private String uSex;

    private String uIdCard;

    private String uPhone;

    private String uStayTime;

    private String uRetreatTime;

    private String uIntroduction;

    private Integer uPrimaryUser;

    private Integer uDelete;

    private Integer uIsModify;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdUuid() {
        return dUuid;
    }

    public void setdUuid(String dUuid) {
        this.dUuid = dUuid == null ? null : dUuid.trim();
    }

    public Integer getdUserId() {
        return dUserId;
    }

    public void setdUserId(Integer dUserId) {
        this.dUserId = dUserId;
    }

    public Integer getdLockId() {
        return dLockId;
    }

    public void setdLockId(Integer dLockId) {
        this.dLockId = dLockId;
    }

    public String getdTime() {
        return dTime;
    }

    public void setdTime(String dTime) {
        this.dTime = dTime == null ? null : dTime.trim();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUuid() {
        return uUuid;
    }

    public void setuUuid(String uUuid) {
        this.uUuid = uUuid == null ? null : uUuid.trim();
    }

    public Integer getuRoomId() {
        return uRoomId;
    }

    public void setuRoomId(Integer uRoomId) {
        this.uRoomId = uRoomId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuIdCard() {
        return uIdCard;
    }

    public void setuIdCard(String uIdCard) {
        this.uIdCard = uIdCard == null ? null : uIdCard.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuStayTime() {
        return uStayTime;
    }

    public void setuStayTime(String uStayTime) {
        this.uStayTime = uStayTime == null ? null : uStayTime.trim();
    }

    public String getuRetreatTime() {
        return uRetreatTime;
    }

    public void setuRetreatTime(String uRetreatTime) {
        this.uRetreatTime = uRetreatTime == null ? null : uRetreatTime.trim();
    }

    public String getuIntroduction() {
        return uIntroduction;
    }

    public void setuIntroduction(String uIntroduction) {
        this.uIntroduction = uIntroduction == null ? null : uIntroduction.trim();
    }

    public Integer getuPrimaryUser() {
        return uPrimaryUser;
    }

    public void setuPrimaryUser(Integer uPrimaryUser) {
        this.uPrimaryUser = uPrimaryUser;
    }

    public Integer getuDelete() {
        return uDelete;
    }

    public void setuDelete(Integer uDelete) {
        this.uDelete = uDelete;
    }

    public Integer getuIsModify() {
        return uIsModify;
    }

    public void setuIsModify(Integer uIsModify) {
        this.uIsModify = uIsModify;
    }

    @Override
    public String toString() {
        return "VDailyUserInfo{" +
                "dId=" + dId +
                ", dUuid='" + dUuid + '\'' +
                ", dUserId=" + dUserId +
                ", dLockId=" + dLockId +
                ", dTime='" + dTime + '\'' +
                ", uId=" + uId +
                ", uUuid='" + uUuid + '\'' +
                ", uRoomId=" + uRoomId +
                ", uName='" + uName + '\'' +
                ", uSex='" + uSex + '\'' +
                ", uIdCard='" + uIdCard + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uStayTime='" + uStayTime + '\'' +
                ", uRetreatTime='" + uRetreatTime + '\'' +
                ", uIntroduction='" + uIntroduction + '\'' +
                ", uPrimaryUser=" + uPrimaryUser +
                ", uDelete=" + uDelete +
                ", uIsModify=" + uIsModify +
                '}';
    }
}