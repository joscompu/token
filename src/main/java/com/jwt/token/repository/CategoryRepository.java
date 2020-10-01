package com.jwt.token.repository;

import com.jwt.token.dto.Category;
import com.jwt.token.exceptions.EtBadRequestException;
import com.jwt.token.exceptions.EtResourceNotFoundException;

import java.util.List;

/*

Autor: Jose Calderon

*/
public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
