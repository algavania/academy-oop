/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.course;

import com.oop.academy.models.Course;


/**
 *
 * @author asus
 */
public interface BaseCourseRepository {
    public void addCourse(Course course);
    public void updateCourse(Course course,Course newCourse) throws Exception;
    public void deleteCourse(Course course);
    public void enroll(Course course) throws Exception;
}
