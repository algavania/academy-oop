/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.service;

import com.oop.academy.models.Admin;
import com.oop.academy.models.Category;
import com.oop.academy.models.User;
import com.oop.academy.models.Course;
import com.oop.academy.models.Education;
import com.oop.academy.models.Teacher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MSI
 */
public class DatabaseService {

    public static User currentUser = null;
    private static List<User> users;
    private static List<Teacher> userTeacherRequests;
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
            seederUsers();
            seederCategories();
        }
        return users;
    }

    public static List<Course> getCourses() {
        if (courses == null) {
            courses = new ArrayList();
        }
        return courses;
    }

    private static void seederUsers() {
        users.add(new Teacher("teacher", "Pak Maha",
                "Laki-Laki", new Date(), "teacher@email.com",
                "teacher", "teacherUrl", 1000));
        users.add(new Admin("admin", "Mas Maha",
                "Laki-Laki", new Date(), "admin@email.com",
                "admin", "adminPhoto", 10000));
        users.add(new User("student", "Adik Maha",
                "Laki-Laki", new Date(), "student@email.com",
                "student", "studentUrl", 10000));
    }

    private static void seederCategories() {
        String[] categoryNames = {"Mobile Development",
            "Front End Development", "Back End Development",
            "Agile Development", "Networking", "Database Management",
            "Artificial Intelligence", "Cybersecurity", "Game Development",
            "DevOps"
        };

        for (String categoryName : categoryNames) {
            categories.add(new Category(categoryName));
        }
    }

    private static void seederTeacherRequest() {
        List<Education> educations = new ArrayList();
        educations.add(new Education("SMAN 1 Cibadak", 3, "SMA", 96,
                null));
        userTeacherRequests.add(new Teacher("teacher1", "Pak Amir",
                "Laki-Laki", new Date(), "teacher@email.com",
                "teacher", "teacherUrl", 1000));
        userTeacherRequests.add(new Teacher("teacher2", "Pak Nasir",
                "Laki-Laki", new Date(), "teacher@email.com",
                "teacher", "teacherUrl", 1000));

        userTeacherRequests.get(0).setEducations(educations);
        userTeacherRequests.get(1).setEducations(educations);

    }

    public static List<Teacher> getUserTeacherRequests() {
        if (userTeacherRequests == null) {
            userTeacherRequests = new ArrayList();
//            seederTeacherRequest();
        }

        return userTeacherRequests;
    }

}
