package com.dhy.yycompany.lock.bean;

public class Apartment {
    private Integer aId;

    private String aUuid;

    private String aName;

    private String aFloorNum;

    private Integer aDelete;

    private Integer aModify;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaUuid() {
        return aUuid;
    }

    public void setaUuid(String aUuid) {
        this.aUuid = aUuid == null ? null : aUuid.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaFloorNum() {
        return aFloorNum;
    }

    public void setaFloorNum(String aFloorNum) {
        this.aFloorNum = aFloorNum == null ? null : aFloorNum.trim();
    }

    public Integer getaDelete() {
        return aDelete;
    }

    public void setaDelete(Integer aDelete) {
        this.aDelete = aDelete;
    }

    public Integer getaModify() {
        return aModify;
    }

    public void setaModify(Integer aModify) {
        this.aModify = aModify;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "aId=" + aId +
                ", aUuid='" + aUuid + '\'' +
                ", aName='" + aName + '\'' +
                ", aFloorNum='" + aFloorNum + '\'' +
                ", aDelete=" + aDelete +
                ", aModify=" + aModify +
                '}';
    }
}