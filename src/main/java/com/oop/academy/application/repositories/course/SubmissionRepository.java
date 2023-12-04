/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.course;

import com.oop.academy.models.Course;
import com.oop.academy.models.Submission;

/**
 *
 * @author asus
 */
public class SubmissionRepository implements BaseSubmissionRepository{

    @Override
    public void addSubmission(Course course, Submission tugas) {
        course.getListSubmission().add(tugas);
    }

    @Override
    public void updateSubmission(Course course,Submission tugas, Submission newTugas) throws Exception {
        if (!course.getListSubmission().remove(tugas)) {
            throw new Exception("Course tidak ditemukan");
        }
        
        course.getListSubmission().add(newTugas);
    }


    @Override
    public void deleteSubmission(Course course, Submission tugas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
