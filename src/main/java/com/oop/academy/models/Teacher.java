/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mamir
 */
public class Teacher extends Student {
    private List<Education> educations;
    private String coverLetter;
    private String personalWebsiteUrl;
    private List<Course> courses;

    public Teacher(String username, String name, String gender, Date birthdate, 
            String email, String password, String photoUrl, int balance) {
        super(username, name, gender, birthdate, email, password,
                photoUrl, balance);
    }
    
    public Teacher(User user) {
        super(user.getUsername(), user.getName(), 
                user.getGender(), user.getBirthdate(), 
                user.getEmail(), user.getPassword(), 
                user.getPhotoUrl(), user.getBalance());
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public String getPersonalWebsiteUrl() {
        return personalWebsiteUrl;
    }

    public void setPersonalWebsiteUrl(String personalWebsiteUrl) {
        this.personalWebsiteUrl = personalWebsiteUrl;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
}
