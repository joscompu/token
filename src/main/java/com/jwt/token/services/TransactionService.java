package com.jwt.token.services;

import com.jwt.token.dto.Transaction;
import com.jwt.token.exceptions.EtBadRequestException;
import com.jwt.token.exceptions.EtResourceNotFoundException;

import java.util.List;

/*

Autor: Jose Calderon

*/
public interface TransactionService {

    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

}
