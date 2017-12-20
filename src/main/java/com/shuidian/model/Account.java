package com.shuidian.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    private int id;
    private String time;
    private String roomId;
    private Integer studentId;
    private String name;
    private String waterCost;
    private String eCost;
    private Double waterMoney;
    private Double emoney;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "time", nullable = true, length = 255)
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "roomId", nullable = true, length = 255)
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    @Basic
    @Column(name = "studentId", nullable = true)
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "waterCost", nullable = true, length = 255)
    public String getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(String waterCost) {
        this.waterCost = waterCost;
    }

    @Basic
    @Column(name = "eCost", nullable = true, length = 255)
    public String geteCost() {
        return eCost;
    }

    public void seteCost(String eCost) {
        this.eCost = eCost;
    }

    @Basic
    @Column(name = "waterMoney", nullable = true, precision = 0)
    public Double getWaterMoney() {
        return waterMoney;
    }

    public void setWaterMoney(Double waterMoney) {
        this.waterMoney = waterMoney;
    }

    @Basic
    @Column(name = "emoney", nullable = true, precision = 0)
    public Double getEmoney() {
        return emoney;
    }

    public void setEmoney(Double emoney) {
        this.emoney = emoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (id != account.id) return false;
        if (time != null ? !time.equals(account.time) : account.time != null) return false;
        if (roomId != null ? !roomId.equals(account.roomId) : account.roomId != null) return false;
        if (studentId != null ? !studentId.equals(account.studentId) : account.studentId != null) return false;
        if (name != null ? !name.equals(account.name) : account.name != null) return false;
        if (waterCost != null ? !waterCost.equals(account.waterCost) : account.waterCost != null) return false;
        if (eCost != null ? !eCost.equals(account.eCost) : account.eCost != null) return false;
        if (waterMoney != null ? !waterMoney.equals(account.waterMoney) : account.waterMoney != null) return false;
        if (emoney != null ? !emoney.equals(account.emoney) : account.emoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (roomId != null ? roomId.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (waterCost != null ? waterCost.hashCode() : 0);
        result = 31 * result + (eCost != null ? eCost.hashCode() : 0);
        result = 31 * result + (waterMoney != null ? waterMoney.hashCode() : 0);
        result = 31 * result + (emoney != null ? emoney.hashCode() : 0);
        return result;
    }
}
