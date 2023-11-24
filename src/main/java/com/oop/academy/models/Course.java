/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author asus
 */
public class Course {
    private String name;
    private int price;
    private String image;
    private List<Student> listStudent;
    private Teacher teacher;
    private Category category;
    private List<CourseContent> listCourseContent;
    private List<StudentSubmission> listStudentSubmission;
    private LocalDateTime createdAt;
    
    public Course()
    {
        this.listStudent = new ArrayList<Student>();
        this.listCourseContent = new ArrayList<CourseContent>();
        this.listStudentSubmission = new ArrayList<StudentSubmission>();
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Student> getListStudent() {
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

    public List<StudentSubmission> getListStudentSubmission() {
        return listStudentSubmission;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt()
    {
        this.createdAt = LocalDateTime.now();
    }

   
    
    
}
