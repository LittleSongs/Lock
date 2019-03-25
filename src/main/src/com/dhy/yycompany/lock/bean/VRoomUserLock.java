package com.dhy.yycompany.lock.bean;

public class VRoomUserLock {
    private Integer rId;

    private Integer uId;

    private Integer lId;

    private String stayTime;

    private String retreatTime;

    private Integer residentNum;

    private Integer lStatus;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getStayTime() {
        return stayTime;
    }

    public void setStayTime(String stayTime) {
        this.stayTime = stayTime == null ? null : stayTime.trim();
    }

    public String getRetreatTime() {
        return retreatTime;
    }

    public void setRetreatTime(String retreatTime) {
        this.retreatTime = retreatTime == null ? null : retreatTime.trim();
    }

    public Integer getResidentNum() {
        return residentNum;
    }

    public void setResidentNum(Integer residentNum) {
        this.residentNum = residentNum;
    }

    public Integer getlStatus() {
        return lStatus;
    }

    public void setlStatus(Integer lStatus) {
        this.lStatus = lStatus;
    }
}