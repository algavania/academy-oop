/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.presentation;

import com.oop.academy.application.repositories.authentication.AuthRepository;
import com.oop.academy.application.repositories.category.CategoryRepository;

/**
 *
 * @author mfazi
 */
public class InjectionContainer {

    public static CategoryRepository categoryRepository;
    public static AuthRepository authRepository;

    public void init() {
        categoryRepository = new CategoryRepository();
        authRepository = new AuthRepository();
    }
}
