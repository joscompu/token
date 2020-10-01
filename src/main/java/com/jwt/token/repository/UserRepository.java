package com.jwt.token.repository;

import com.jwt.token.dto.User;
import com.jwt.token.exceptions.EtAuthException;

/*

Autor: Jose Calderon

*/
public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
