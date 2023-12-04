/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.academy.application.repositories.course;

import com.oop.academy.models.Course;
import com.oop.academy.models.Submission;

/**
 *
 * @author asus
 */
public interface BaseSubmissionRepository {
    public void addSubmission(Course course, Submission tugas);
    public void updateSubmission(Course course, Submission tugas, Submission newTugas)throws Exception;
    public void deleteSubmission(Course course, Submission tugas);
}
