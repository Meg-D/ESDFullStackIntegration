package com.example.fullint.bean;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Courses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer course_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int credits;

    @Column(nullable = false)
    private int term;

    @Column(nullable = false)
    private String specialization; //AI or CS or NW

    public Courses() {
    }

    public Courses(String name, int credits, int term, String specialization) {
       // this.course_id = course_id;
        this.name = name;
        this.credits = credits;
        this.term = term;
        this.specialization = specialization;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
