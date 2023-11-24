/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mamir
 */
public class Teacher {
    private List<Education> educations;
    private String coverLetter;
    private String personalWebsiteUrl;
    private List<Course> courses;

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
    
    // Educations
    public void addEducation(Education education) {
        if (educations == null) {
            educations = new ArrayList<Education>();
        }
        educations.add(education);
    }
    
    public int getSizeEducation() {
        if (educations == null) {
            return 0;
        } else {
            return educations.size();
        }
    }
    
    public Education getEducation(int indeks) {
        return educations.get(indeks);
    }

    public void deleteEducation(int indeks) {
        educations.remove(indeks);
    }
    
    public void editEducation(int indeks, Education education) {
        this.educations.set(indeks, education);
    }
    
    // Course
    public void addCouse(Course course) {
        if (courses == null) {
            courses = new ArrayList<Course>();
        }
        courses.add(course);
    }
    
    public int getSizeCourse() {
        if (courses == null) {
            return 0;
        } else {
            return courses.size();
        }
    }
    
    public Course getCourse(int indeks) {
        return courses.get(indeks);
    }

    public void deleteCourse(int indeks) {
        courses.remove(indeks);
    }
    
    public void editCourse(int indeks, Course course) {
        this.courses.set(indeks, course);
    }
}
