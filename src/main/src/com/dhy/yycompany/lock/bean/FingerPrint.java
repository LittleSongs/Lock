package com.dhy.yycompany.lock.bean;

public class FingerPrint {
    private Integer fId;

    private String fUuid;

    private String fName;

    private Integer fLockId;

    private Integer fUserId;

    private String fContentPath;

    private Integer fDelete;

    private Integer fIsModify;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfUuid() {
        return fUuid;
    }

    public void setfUuid(String fUuid) {
        this.fUuid = fUuid == null ? null : fUuid.trim();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public Integer getfLockId() {
        return fLockId;
    }

    public void setfLockId(Integer fLockId) {
        this.fLockId = fLockId;
    }

    public Integer getfUserId() {
        return fUserId;
    }

    public void setfUserId(Integer fUserId) {
        this.fUserId = fUserId;
    }

    public String getfContentPath() {
        return fContentPath;
    }

    public void setfContentPath(String fContentPath) {
        this.fContentPath = fContentPath == null ? null : fContentPath.trim();
    }

    public Integer getfDelete() {
        return fDelete;
    }

    public void setfDelete(Integer fDelete) {
        this.fDelete = fDelete;
    }

    public Integer getfIsModify() {
        return fIsModify;
    }

    public void setfIsModify(Integer fIsModify) {
        this.fIsModify = fIsModify;
    }

    @Override
    public String toString() {
        return "FingerPrint{" +
                "fId=" + fId +
                ", fUuid='" + fUuid + '\'' +
                ", fName='" + fName + '\'' +
                ", fLockId=" + fLockId +
                ", fUserId=" + fUserId +
                ", fContentPath='" + fContentPath + '\'' +
                ", fDelete=" + fDelete +
                ", fIsModify=" + fIsModify +
                '}';
    }
}