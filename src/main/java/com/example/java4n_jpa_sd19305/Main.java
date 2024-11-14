package com.example.java4n_jpa_sd19305;

import com.example.java4n_jpa_sd19305.entity.Course;
import com.example.java4n_jpa_sd19305.entity.Product;
import com.example.java4n_jpa_sd19305.entity.Review;
import com.example.java4n_jpa_sd19305.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf=
                Persistence.createEntityManagerFactory("default");

        EntityManager em = emf.createEntityManager();

        //Product productA = new Product(1, "Product A");
        //Product productB = new Product(2, "Product B");

        //em.getTransaction().begin();
        //
        //em.persist(productA);
        //em.persist(productB);
        //
        //productB.setName("BB");
        //
        //em.getTransaction().commit();




        //em.createQuery("select p from Product p", Product.class)
        //        .getResultList()
        //        .forEach(System.out::println);
        //
        //em.createNativeQuery("select * from products10", Product.class)
        //        .getResultList()
        //        .forEach(System.out::println);


        // 1-n
        //Review review = new Review();
        //review.setRating("5");
        //review.setDescription("Oki");
        //
        //Course course = new Course();
        //course.setName("Java");
        //
        //course.addReview(review);
        //
        //em.getTransaction().begin();
        //em.persist(course);
        //em.getTransaction().commit();

        Student student = new Student();
        student.setId(1001L);
        student.setName("student 1");;
        student.setEmail("email 1");
        student.setPhone("phone 1");

        Course course = new Course();
        course.setId(101L);
        course.setName("course 1");

        em.getTransaction().begin();
        em.persist(student);
        em.persist(course);

        student.addCourse(course);
        course.addStudent(student);
        em.getTransaction().commit();
    }
}
