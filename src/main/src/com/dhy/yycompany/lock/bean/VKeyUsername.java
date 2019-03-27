package com.dhy.yycompany.lock.bean;

public class VKeyUsername {
    private Integer kId;

    private String kUuid;

    private Integer kLockId;

    private Integer kUserId;

    private String kPassword;

    private Integer kAvailableTimes;

    private Integer kIsModify;

    private Integer kDelete;

    private String kFailureTime;

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

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public String getkUuid() {
        return kUuid;
    }

    public void setkUuid(String kUuid) {
        this.kUuid = kUuid == null ? null : kUuid.trim();
    }

    public Integer getkLockId() {
        return kLockId;
    }

    public void setkLockId(Integer kLockId) {
        this.kLockId = kLockId;
    }

    public Integer getkUserId() {
        return kUserId;
    }

    public void setkUserId(Integer kUserId) {
        this.kUserId = kUserId;
    }

    public String getkPassword() {
        return kPassword;
    }

    public void setkPassword(String kPassword) {
        this.kPassword = kPassword == null ? null : kPassword.trim();
    }

    public Integer getkAvailableTimes() {
        return kAvailableTimes;
    }

    public void setkAvailableTimes(Integer kAvailableTimes) {
        this.kAvailableTimes = kAvailableTimes;
    }

    public Integer getkIsModify() {
        return kIsModify;
    }

    public void setkIsModify(Integer kIsModify) {
        this.kIsModify = kIsModify;
    }

    public Integer getkDelete() {
        return kDelete;
    }

    public void setkDelete(Integer kDelete) {
        this.kDelete = kDelete;
    }

    public String getkFailureTime() {
        return kFailureTime;
    }

    public void setkFailureTime(String kFailureTime) {
        this.kFailureTime = kFailureTime == null ? null : kFailureTime.trim();
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
        return "VKeyUsername{" +
                "kId=" + kId +
                ", kUuid='" + kUuid + '\'' +
                ", kLockId=" + kLockId +
                ", kUserId=" + kUserId +
                ", kPassword='" + kPassword + '\'' +
                ", kAvailableTimes=" + kAvailableTimes +
                ", kIsModify=" + kIsModify +
                ", kDelete=" + kDelete +
                ", kFailureTime='" + kFailureTime + '\'' +
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