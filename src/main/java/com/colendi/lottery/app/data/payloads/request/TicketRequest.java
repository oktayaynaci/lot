package com.colendi.lottery.app.data.payloads.request;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class TicketRequest {

    @NotBlank
    private int userId;
    private UUID ticketId;
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }
}
