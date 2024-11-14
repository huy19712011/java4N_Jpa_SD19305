package com.example.java4n_jpa_sd19305.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {

    @Id
    private long id;
    private String rating;
    private String description;

    @ManyToOne
    //@JoinColumn(name = "custom_name", referencedColumnName = "id") // Optional!!!
    private Course course;

    public Review() {
    }

    public long getId() {
        return id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
