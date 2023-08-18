package com.colendi.lottery.app.data.payloads.request;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.UUID;

public class TicketRequest {

    @NotBlank
    private int userId;
    private UUID ticketId;
    private String lotteryName;
    private Integer price;
    public int getUserId() {return userId;}
    private LocalDate lotteryStartDate;
    private LocalDate lotteryEndDate;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public String getLotteryName() {return lotteryName;}

    public void setLotteryName(String lotteryName){this.lotteryName=lotteryName;}

    public int getPrice() {return price;}

    public void setPrice(int price) {
        this.price = price;
    }

   public LocalDate getLotteryStartDate() {
        return lotteryStartDate;
    }

    public void setLotteryStartDate(LocalDate lotteryStartDate) {
        this.lotteryStartDate = lotteryStartDate;
    }

    public LocalDate getLotteryEndDate() {
        return lotteryEndDate;
    }

    public void setLotteryEndDate(LocalDate lotteryEndDate) {this.lotteryEndDate = lotteryEndDate;}

}
