package com.example.java4n_jpa_sd19305.repository;

import com.example.java4n_jpa_sd19305.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("default");
    private EntityManager em =
            emf.createEntityManager();

    public ArrayList<Student> getStudents() {

        List<Student> students = em.createQuery("select s from Student s", Student.class)
                .getResultList();

        return new ArrayList<>(students);
    }

    public void deleteStudent(long id) {

        em.getTransaction().begin();
        em.remove(em.find(Student.class, id));
        em.getTransaction().commit();
    }

    public void addStudent(Student student) {

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }

    public Student getStudentById(long id) {

        return em.find(Student.class, id);
    }

    public void updateStudent(Student student) {

        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
    }
}
