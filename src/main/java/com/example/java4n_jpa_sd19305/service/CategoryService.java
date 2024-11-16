package com.example.java4n_jpa_sd19305.service;



import com.example.java4n_jpa_sd19305.entity.Category;
import com.example.java4n_jpa_sd19305.repository.CategoryRepository;

import java.util.ArrayList;

public class CategoryService {

    CategoryRepository categoryRepository = new CategoryRepository();

    public ArrayList<Category> getCategories() {

        return categoryRepository.getCategories();
    }

    public Category getCategoryById(Long id) {

        return categoryRepository.getCategoryById(id);
    }
}
