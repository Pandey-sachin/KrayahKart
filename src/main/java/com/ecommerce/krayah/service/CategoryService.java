package com.ecommerce.krayah.service;

import com.ecommerce.krayah.model.Category;
import com.ecommerce.krayah.payload.CategoryDTO;
import com.ecommerce.krayah.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
