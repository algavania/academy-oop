/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy;

import com.oop.academy.application.repositories.authentication.AuthRepository;
import com.oop.academy.application.repositories.category.CategoryRepository;
import com.oop.academy.application.repositories.teacher.registration.TeacherRegistRepository;
import com.oop.academy.application.repositories.teacher.submit.SubmitTeacherRepository;
import com.oop.academy.application.repositories.user.UserRepository;
import com.oop.academy.application.repositories.user.topup.TopUpRepository;

/**
 *
 * @author MSI
 */
public class InjectionContainer {

    public static CategoryRepository categoryRepository;
    public static AuthRepository authRepository;
    public static UserRepository userRepository;
    public static TeacherRegistRepository teacherRegistRepository;
    public static SubmitTeacherRepository submitTeacherRepository;
    public static TopUpRepository topUpRepository;

    public void init() {
        categoryRepository = new CategoryRepository();
        authRepository = new AuthRepository();
        userRepository = new UserRepository();
        teacherRegistRepository = new TeacherRegistRepository();
        submitTeacherRepository = new SubmitTeacherRepository();
        topUpRepository = new TopUpRepository();
    }
}
