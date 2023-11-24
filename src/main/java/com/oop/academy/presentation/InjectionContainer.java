/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.presentation;

import com.oop.academy.application.repositories.category.CategoryRepository;
import com.oop.academy.presentation.dashboard.CategoryManagementView;

/**
 *
 * @author mfazi
 */

public class InjectionContainer {
    
    public static MainFrame mainFrame = new MainFrame();
    
    //repositorys
    public static CategoryRepository categoryRepository = new CategoryRepository();
    
    //views
    public static CategoryManagementView categoryManagementView = new CategoryManagementView(mainFrame, categoryRepository);
}
