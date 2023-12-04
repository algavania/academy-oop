/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy;

import com.oop.academy.application.repositories.authentication.AuthRepository;
import com.oop.academy.application.repositories.category.CategoryRepository;
import com.oop.academy.application.repositories.course.CourseContentRepository;
import com.oop.academy.application.repositories.course.CourseRepository;
import com.oop.academy.application.repositories.course.SubmissionRepository;
import com.oop.academy.application.repositories.teacher.registration.TeacherRegistRepository;
import com.oop.academy.application.repositories.user.UserRepository;

/**
 *
 * @author MSI
 */
public class InjectionContainer {

    public static CategoryRepository categoryRepository;
    public static AuthRepository authRepository;
    public static UserRepository userRepository;
    public static CourseRepository courseRepository;
    public static CourseContentRepository courseContentRepository;
    public static TeacherRegistRepository teacherRegistRepository;
    public static SubmissionRepository submissionRepository;

    public void init() {
        categoryRepository = new CategoryRepository();
        authRepository = new AuthRepository();
        userRepository = new UserRepository();
        courseRepository = new CourseRepository();
        teacherRegistRepository = new TeacherRegistRepository();
        courseContentRepository = new CourseContentRepository();
        submissionRepository = new SubmissionRepository();
    }
}
