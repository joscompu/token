package com.jwt.token.services;

import com.jwt.token.dto.Category;
import com.jwt.token.exceptions.EtBadRequestException;
import com.jwt.token.exceptions.EtResourceNotFoundException;

import java.util.List;

/*

Autor: Jose Calderon

*/
public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
