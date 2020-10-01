package com.jwt.token.dto;

/*

Autor: Jose Calderon

*/

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Builder
@Data
public class Category {

    private final Integer categoryId;
    private final Integer userId;
    private final String title;
    private final String description;
    private final Double totalExpense;
}
