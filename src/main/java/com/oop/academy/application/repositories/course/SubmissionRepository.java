/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.course;

import com.oop.academy.models.Course;
import com.oop.academy.models.StudentSubmission;
import com.oop.academy.models.Submission;

/**
 *
 * @author asus
 */
public class SubmissionRepository implements BaseSubmissionRepository {

    @Override
    public void addSubmission(Course course, Submission tugas) {
        course.getListSubmission().add(tugas);
    }

    @Override
    public void updateSubmission(Course course, Submission tugas, Submission newTugas) throws Exception {
        int index = -1;
        for (int i = 0; i < course.getListSubmission().size(); i++) {
            if (course.getListSubmission().get(i) == tugas) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new Exception("Course content not found");
        } else {
            course.getListSubmission().set(index, newTugas);
        }
    }

    @Override
    public void deleteSubmission(Course course, Submission tugas) {
        course.getListSubmission().remove(tugas);
    }

    @Override
    public void addStudentSubmission(Submission submission, StudentSubmission data) {
        submission.getStudentSubmissions().add(data);
    }

    @Override
    public void updateStudentSubmission(Submission submission, StudentSubmission data, StudentSubmission newData) throws Exception {
        int index = -1;
        for (int i = 0; i < submission.getStudentSubmissions().size(); i++) {
            if (submission.getStudentSubmissions().get(i) == data) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new Exception("Course content not found");
        } else {
            submission.getStudentSubmissions().set(index, newData);
        }
    }

    @Override
    public void deleteStudentSubmission(Submission submission, StudentSubmission data) {
        submission.getStudentSubmissions().remove(data);
    }

}
