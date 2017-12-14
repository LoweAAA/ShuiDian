package com.shuidian.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    private int id;
    private Integer type;
    private Double number;
    private Double money;
    private String time;
    private Double start;
    private Double end;
    private String isPay;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "number", nullable = true, precision = 0)
    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    @Basic
    @Column(name = "money", nullable = true, precision = 0)
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
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
    @Column(name = "start", nullable = true, precision = 0)
    public Double getStart() {
        return start;
    }

    public void setStart(Double start) {
        this.start = start;
    }

    @Basic
    @Column(name = "end", nullable = true, precision = 0)
    public Double getEnd() {
        return end;
    }

    public void setEnd(Double end) {
        this.end = end;
    }

    @Basic
    @Column(name = "isPay", nullable = true, length = 255)
    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (id != account.id) return false;
        if (type != null ? !type.equals(account.type) : account.type != null) return false;
        if (number != null ? !number.equals(account.number) : account.number != null) return false;
        if (money != null ? !money.equals(account.money) : account.money != null) return false;
        if (time != null ? !time.equals(account.time) : account.time != null) return false;
        if (start != null ? !start.equals(account.start) : account.start != null) return false;
        if (end != null ? !end.equals(account.end) : account.end != null) return false;
        if (isPay != null ? !isPay.equals(account.isPay) : account.isPay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (isPay != null ? isPay.hashCode() : 0);
        return result;
    }
}
