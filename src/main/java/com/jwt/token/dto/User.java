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
public class User {
    @NonNull private Integer userId;
    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private String email;
    @NonNull private String password;

}
