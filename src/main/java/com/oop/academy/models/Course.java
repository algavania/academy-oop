/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author asus
 */
public class Course {
    private String name;
    private int price;
    private List<User> listStudent;
    private Teacher teacher;
    private Category category;
    private List<CourseContent> listCourseContent;
    private List<Submission> listSubmission;
    private LocalDateTime createdAt;
    
    public Course()
    {
        this.listStudent = new ArrayList<>();
        this.listCourseContent = new ArrayList<>();
        this.listSubmission = new ArrayList<>();
    }
    
    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }
    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<User> getListStudent() {
        return listStudent;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<CourseContent> getListCourseContent() {
        return listCourseContent;
    }

    public List<Submission> getListSubmission() {
        return listSubmission;
    }

    public void setListSubmission(List<Submission> listSubmission) {
        this.listSubmission = listSubmission;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt()
    {
        this.createdAt = LocalDateTime.now();
    }

   
    
    
}
