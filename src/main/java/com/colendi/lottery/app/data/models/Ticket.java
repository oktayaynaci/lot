package com.colendi.lottery.app.data.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name= "lotteryName")
    private String lotteryName;

    @Column(name="price")
    private Integer price;

    @Column(name = "lotteryStartDate")
    private LocalDate lotteryStartDate;

    @Column(name = "lotteryEndDate")
    private LocalDate lotteryEndDate;

    public Ticket() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public Integer getPrice() {return price;}

    public void setPrice(Integer price) {this.price = price;}

    public LocalDate getLotteryStartDate() {
        return lotteryStartDate;
    }

    public void setLotteryStartDate(LocalDate lotteryStartDate) {
        this.lotteryStartDate = lotteryStartDate;
    }

    public LocalDate getLotteryEndDate() {
        return lotteryEndDate;
    }

    public void setLotteryEndDate(LocalDate lotteryEndDate) {
        this.lotteryEndDate = lotteryEndDate;
    }

}














