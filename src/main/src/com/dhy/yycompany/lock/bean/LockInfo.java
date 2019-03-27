package com.dhy.yycompany.lock.bean;

public class LockInfo {
    private Integer lId;

    private String lUuid;

    private Integer lStatus;

    private String lSupplier;

    private String lSoftVer;

    private String lHardVer;

    private String lProductionDate;

    private String lIntroduction;

    private Integer lDelete;

    private Integer lModify;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlUuid() {
        return lUuid;
    }

    public void setlUuid(String lUuid) {
        this.lUuid = lUuid == null ? null : lUuid.trim();
    }

    public Integer getlStatus() {
        return lStatus;
    }

    public void setlStatus(Integer lStatus) {
        this.lStatus = lStatus;
    }

    public String getlSupplier() {
        return lSupplier;
    }

    public void setlSupplier(String lSupplier) {
        this.lSupplier = lSupplier == null ? null : lSupplier.trim();
    }

    public String getlSoftVer() {
        return lSoftVer;
    }

    public void setlSoftVer(String lSoftVer) {
        this.lSoftVer = lSoftVer == null ? null : lSoftVer.trim();
    }

    public String getlHardVer() {
        return lHardVer;
    }

    public void setlHardVer(String lHardVer) {
        this.lHardVer = lHardVer == null ? null : lHardVer.trim();
    }

    public String getlProductionDate() {
        return lProductionDate;
    }

    public void setlProductionDate(String lProductionDate) {
        this.lProductionDate = lProductionDate == null ? null : lProductionDate.trim();
    }

    public String getlIntroduction() {
        return lIntroduction;
    }

    public void setlIntroduction(String lIntroduction) {
        this.lIntroduction = lIntroduction == null ? null : lIntroduction.trim();
    }

    public Integer getlDelete() {
        return lDelete;
    }

    public void setlDelete(Integer lDelete) {
        this.lDelete = lDelete;
    }

    public Integer getlModify() {
        return lModify;
    }

    public void setlModify(Integer lModify) {
        this.lModify = lModify;
    }

    @Override
    public String toString() {
        return "LockInfo{" +
                "lId=" + lId +
                ", lUuid='" + lUuid + '\'' +
                ", lStatus=" + lStatus +
                ", lSupplier='" + lSupplier + '\'' +
                ", lSoftVer='" + lSoftVer + '\'' +
                ", lHardVer='" + lHardVer + '\'' +
                ", lProductionDate='" + lProductionDate + '\'' +
                ", lIntroduction='" + lIntroduction + '\'' +
                ", lDelete=" + lDelete +
                ", lModify=" + lModify +
                '}';
    }
}