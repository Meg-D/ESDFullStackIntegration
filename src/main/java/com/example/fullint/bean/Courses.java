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

    @Column
    private String professor;

    @Column(nullable = false)
    private int credits;

    @Column(nullable = false)
    private int term;

    @Column(nullable = false)
    private String specialization; //AI or CS or NW

    @Column
    private Integer max_students;

    public Courses() {
    }

    public Courses(String name, String professor, int credits, int term, String specialization, Integer max_students) {
        this.name = name;
        this.professor = professor;
        this.credits = credits;
        this.term = term;
        this.specialization = specialization;
        this.max_students = max_students;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Integer getMax_students() {
        return max_students;
    }

    public void setMax_students(Integer max_students) {
        this.max_students = max_students;
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
