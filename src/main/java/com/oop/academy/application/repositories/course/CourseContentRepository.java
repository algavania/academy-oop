/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.course;

import com.oop.academy.models.Course;
import com.oop.academy.models.CourseContent;

/**
 *
 * @author asus
 */
public class CourseContentRepository implements BaseCourseContentRepository{
    
    @Override
    public void addCourseContent(Course course,CourseContent materi)
    {
        course.getListCourseContent().add(materi);
    }
    @Override
    public void updateCourseContent(Course course, CourseContent materi, CourseContent newMateri) throws Exception {
        if (!course.getListCourseContent().remove(materi)) {
            throw new Exception("Course tidak ditemukan");
        }
        
        course.getListCourseContent().add(newMateri);
    }
    @Override
    public void deleteCourseContent(Course course, CourseContent materi)
    {
        course.getListCourseContent().remove(materi);
    }
}
