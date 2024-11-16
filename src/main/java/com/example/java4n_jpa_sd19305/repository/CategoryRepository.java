package com.example.java4n_jpa_sd19305.repository;

import com.example.java4n_jpa_sd19305.entity.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("default");
    private EntityManager em = emf.createEntityManager();

    public Category getCategoryById(long id) {

        return em.find(Category.class, id);
    }

    public ArrayList<Category> getCategories() {

        List<Category> categories =
                em.createQuery("select c from Category c", Category.class)
                        .getResultList();

        return new ArrayList<>(categories);
    }

}
