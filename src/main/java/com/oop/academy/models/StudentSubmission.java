/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.io.File;
import java.util.Date;

/**
 *
 * @author mamir
 */
public class StudentSubmission {
    private Submission submission;
    private User student;
    private File file;
    private Double score;
    private Date createdAt;

    public StudentSubmission(Submission submission, User student, File file, Double score, Date createdAt) {
        this.submission = submission;
        this.student = student;
        this.file = file;
        this.score = score;
        this.createdAt = createdAt;
    }

    
    
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
