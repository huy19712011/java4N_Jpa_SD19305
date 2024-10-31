package com.example.java4n_jpa_sd19305;

import com.example.java4n_jpa_sd19305.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf=
                Persistence.createEntityManagerFactory("default");

        EntityManager em = emf.createEntityManager();

        em.createQuery("select p from Product p", Product.class)
                .getResultList()
                .forEach(System.out::println);
    }
}