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

        Product productA = new Product(1, "Product A");
        Product productB = new Product(2, "Product B");

        em.getTransaction().begin();

        em.persist(productA);
        em.persist(productB);

        productB.setName("BB");

        em.getTransaction().commit();




        em.createQuery("select p from Product p", Product.class)
                .getResultList()
                .forEach(System.out::println);

        em.createNativeQuery("select * from products10", Product.class)
                .getResultList()
                .forEach(System.out::println);
    }
}
