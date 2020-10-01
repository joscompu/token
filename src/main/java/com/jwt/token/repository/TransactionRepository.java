package com.jwt.token.repository;

import com.jwt.token.dto.Transaction;
import com.jwt.token.exceptions.EtBadRequestException;
import com.jwt.token.exceptions.EtResourceNotFoundException;

import java.util.List;

/*

Autor: Jose Calderon

*/
public interface TransactionRepository {
    List<Transaction> findAll(Integer userId, Integer categoryId);

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
}
