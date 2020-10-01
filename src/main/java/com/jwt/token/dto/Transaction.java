package com.jwt.token.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/*

Autor: Jose Calderon

*/
@Builder
@Data
public class Transaction {

    private final Integer transactionId;
    private final Integer categoryId;
    private final Integer userId;
    private final Double amount;
    private final String note;
    private final Long transactionDate;
}
