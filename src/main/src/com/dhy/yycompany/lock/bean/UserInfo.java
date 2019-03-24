package com.dhy.yycompany.lock.bean;

public class UserInfo {
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
        return "UserInfo{" +
                "uId=" + uId +
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