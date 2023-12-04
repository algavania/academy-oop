/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mamir
 */
public class Submission {

    private Course course;
    private String name;
    private String description;
    private Date createdAt;
    private List<StudentSubmission> studentSubmissions;
    
    public Submission() {
        this.studentSubmissions = new ArrayList();
    }

    public List<StudentSubmission> getStudentSubmissions() {
        return studentSubmissions;
    }

    public void setStudentSubmissions(List<StudentSubmission> studentSubmissions) {
        this.studentSubmissions = studentSubmissions;
    }
    

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
