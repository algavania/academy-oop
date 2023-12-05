/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.academy.application.repositories.course;

import com.oop.academy.models.Course;
import com.oop.academy.models.CourseContent;

/**
 *
 * @author asus
 */
public interface BaseCourseContentRepository {
    public void addCourseContent(Course course,CourseContent materi);
    public void updateCourseContent(Course course, CourseContent materi, CourseContent newMateri) throws Exception;
    public void deleteCourseContent(Course course, CourseContent materi);
}
