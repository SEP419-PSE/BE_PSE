package com.pse.tixclick.payload.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicketDTO {
    int ticketId;
    String ticketName;
    int quantity;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime createdDate;

    double price;

    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate endDate;

    int minQuantity;
    int maxQuantity;
    boolean status;

    int accountId;
    int eventActivityId;
}
