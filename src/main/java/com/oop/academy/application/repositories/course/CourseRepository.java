/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.course;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.Course;
import com.oop.academy.models.CourseContent;
import com.oop.academy.models.Student;
import com.oop.academy.models.StudentSubmission;
import java.util.List;

/**
 *
 * @author asus
 */
public class CourseRepository {
    private final List<Course> courses = DatabaseService.getCourses();
    
    public void addCourse(Course course)
    {
        courses.add(course);
    }
    public void updateCourse(Course course,int indeks)
    {
        courses.set(indeks, course);
    }
    public void deleteCourse(int indeks)
    {
        courses.remove(indeks);
    }
   
   
}
