package com.dhy.yycompany.lock.bean;

public class Instruction {
    private Integer iId;

    private String iUuid;

    private Integer iLockId;

    private Integer iUserId;

    private Integer iIsDelete;

    private Integer iIsModify;

    private Integer iIsUser;

    private Integer iIsLock;

    private Integer iIsKey;

    private Integer iIsFinger;

    private String iUserInfo;

    private String iLockInfo;

    private String iKeyInfo;

    private String iFingerInfo;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiUuid() {
        return iUuid;
    }

    public void setiUuid(String iUuid) {
        this.iUuid = iUuid == null ? null : iUuid.trim();
    }

    public Integer getiLockId() {
        return iLockId;
    }

    public void setiLockId(Integer iLockId) {
        this.iLockId = iLockId;
    }

    public Integer getiUserId() {
        return iUserId;
    }

    public void setiUserId(Integer iUserId) {
        this.iUserId = iUserId;
    }

    public Integer getiIsDelete() {
        return iIsDelete;
    }

    public void setiIsDelete(Integer iIsDelete) {
        this.iIsDelete = iIsDelete;
    }

    public Integer getiIsModify() {
        return iIsModify;
    }

    public void setiIsModify(Integer iIsModify) {
        this.iIsModify = iIsModify;
    }

    public Integer getiIsUser() {
        return iIsUser;
    }

    public void setiIsUser(Integer iIsUser) {
        this.iIsUser = iIsUser;
    }

    public Integer getiIsLock() {
        return iIsLock;
    }

    public void setiIsLock(Integer iIsLock) {
        this.iIsLock = iIsLock;
    }

    public Integer getiIsKey() {
        return iIsKey;
    }

    public void setiIsKey(Integer iIsKey) {
        this.iIsKey = iIsKey;
    }

    public Integer getiIsFinger() {
        return iIsFinger;
    }

    public void setiIsFinger(Integer iIsFinger) {
        this.iIsFinger = iIsFinger;
    }

    public String getiUserInfo() {
        return iUserInfo;
    }

    public void setiUserInfo(String iUserInfo) {
        this.iUserInfo = iUserInfo == null ? null : iUserInfo.trim();
    }

    public String getiLockInfo() {
        return iLockInfo;
    }

    public void setiLockInfo(String iLockInfo) {
        this.iLockInfo = iLockInfo == null ? null : iLockInfo.trim();
    }

    public String getiKeyInfo() {
        return iKeyInfo;
    }

    public void setiKeyInfo(String iKeyInfo) {
        this.iKeyInfo = iKeyInfo == null ? null : iKeyInfo.trim();
    }

    public String getiFingerInfo() {
        return iFingerInfo;
    }

    public void setiFingerInfo(String iFingerInfo) {
        this.iFingerInfo = iFingerInfo == null ? null : iFingerInfo.trim();
    }
}