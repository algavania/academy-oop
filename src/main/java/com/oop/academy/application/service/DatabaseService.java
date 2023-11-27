/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.service;

import com.oop.academy.models.Category;
import com.oop.academy.models.User;
import com.oop.academy.models.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class DatabaseService {
    private int currentUser;
    private static List<User> users;
    private static List<Category> categories;
    private static List<Course> courses;

    public static List<Category> getCategories() {
        if (categories == null) {
            categories = new ArrayList();
        }
        return categories;
    }
    
    public static List<User> getUsers() {
        if (users == null) {
            users = new ArrayList();
        }
        return users;
    }

    public int getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(int currentUser) {
        this.currentUser = currentUser;
    }
    
    public static List<Course> getCourses() {
        if (courses == null) {
            courses = new ArrayList();
        }
        return courses;
    }
    
    
}
