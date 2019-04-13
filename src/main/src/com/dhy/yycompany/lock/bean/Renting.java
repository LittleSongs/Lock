package com.dhy.yycompany.lock.bean;

public class Renting {
    private Integer id;

    private Integer roomId;

    private String rentTime;

    private String retreatTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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
}