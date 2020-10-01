package com.jwt.token.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*

Autor: Jose Calderon

*/
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EtResourceNotFoundException extends RuntimeException {
    public EtResourceNotFoundException(String message) {
        super(message);
    }
}
