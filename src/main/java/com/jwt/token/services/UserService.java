package com.jwt.token.services;

import com.jwt.token.dto.User;
import com.jwt.token.exceptions.EtAuthException;

/*

Autor: Jose Calderon

*/
public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
