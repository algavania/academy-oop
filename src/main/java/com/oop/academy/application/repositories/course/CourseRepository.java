/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.course;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.Course;
import com.oop.academy.models.User;
import java.util.List;

/**
 *
 * @author asus
 */
public class CourseRepository implements BaseCourseRepository {

    private final List<Course> courses = DatabaseService.getCourses();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void updateCourse(Course course, Course newCourse) throws Exception {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i) == course) {
                courses.set(i, newCourse);
                return;
            }
        }
        throw new Exception("Course tidak ditemukan");
    }

    @Override
    public void deleteCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public void enroll(Course course) throws Exception {
        User user = DatabaseService.currentUser;
        if (user.getBalance() < course.getPrice()) {
            throw new Exception("Saldo kamu gak cukup");
        }
        user.setBalance(user.getBalance() - course.getPrice());
        course.getTeacher().setBalance(course.getTeacher().getBalance() + course.getPrice());
        course.getListStudent().add(user);
    }
}
