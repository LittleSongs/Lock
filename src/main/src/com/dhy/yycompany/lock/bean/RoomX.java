package com.dhy.yycompany.lock.bean;

public class RoomX {
    private Integer rId;

    private String rUuid;

    private Integer rApartmentId;

    private Integer rFloor;

    private String rNum;

    private Integer rPrice;

    private Integer rResidentNum;

    private Integer rLockId;

    private Integer rDelete;

    private Integer rModify;

    private String rentTime;

    private String retreatTime;

    private String rApartmentName;//公寓楼名

    private int onOff;//门锁开关

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrUuid() {
        return rUuid;
    }

    public void setrUuid(String rUuid) {
        this.rUuid = rUuid == null ? null : rUuid.trim();
    }

    public Integer getrApartmentId() {
        return rApartmentId;
    }

    public void setrApartmentId(Integer rApartmentId) {
        this.rApartmentId = rApartmentId;
    }

    public Integer getrFloor() {
        return rFloor;
    }

    public void setrFloor(Integer rFloor) {
        this.rFloor = rFloor;
    }

    public String getrNum() {
        return rNum;
    }

    public void setrNum(String rNum) {
        this.rNum = rNum == null ? null : rNum.trim();
    }

    public Integer getrPrice() {
        return rPrice;
    }

    public void setrPrice(Integer rPrice) {
        this.rPrice = rPrice;
    }

    public Integer getrResidentNum() {
        return rResidentNum;
    }

    public void setrResidentNum(Integer rResidentNum) {
        this.rResidentNum = rResidentNum;
    }

    public Integer getrLockId() {
        return rLockId;
    }

    public void setrLockId(Integer rLockId) {
        this.rLockId = rLockId;
    }

    public Integer getrDelete() {
        return rDelete;
    }

    public void setrDelete(Integer rDelete) {
        this.rDelete = rDelete;
    }

    public Integer getrModify() {
        return rModify;
    }

    public void setrModify(Integer rModify) {
        this.rModify = rModify;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime == null ? null : rentTime.trim();
    }

    public String getRetreatTime() {
        return retreatTime;
    }

    public void setRetreatTime(String retreatTime) {
        this.retreatTime = retreatTime == null ? null : retreatTime.trim();
    }

    public String getrApartmentName() {
        return rApartmentName;
    }

    public void setrApartmentName(String rApartmentName) {
        this.rApartmentName = rApartmentName;
    }

    public int getOnOff() {
        return onOff;
    }

    public void setOnOff(int onOff) {
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return "RoomX{" +
                "rId=" + rId +
                ", rUuid='" + rUuid + '\'' +
                ", rApartmentId=" + rApartmentId +
                ", rFloor=" + rFloor +
                ", rNum='" + rNum + '\'' +
                ", rPrice=" + rPrice +
                ", rResidentNum=" + rResidentNum +
                ", rLockId=" + rLockId +
                ", rDelete=" + rDelete +
                ", rModify=" + rModify +
                ", rentTime='" + rentTime + '\'' +
                ", retreatTime='" + retreatTime + '\'' +
                ", rApartmentName='" + rApartmentName + '\'' +
                ", onOff=" + onOff +
                '}';
    }
}