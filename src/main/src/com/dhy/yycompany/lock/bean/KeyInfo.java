package com.dhy.yycompany.lock.bean;

public class KeyInfo {
    private Integer kId;

    private String kUuid;

    private Integer kLockId;

    private Integer kUserId;

    private String kPassword;

    private Integer kAvailableTimes;

    private Integer kIsModify;

    private Integer kDelete;

    private String kFailureTime;

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
}