/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.util.Date;

/**
 *
 * @author mamir
 */
public class StudentSubmission {
    private Submission submission;
    private Student student;
    private String file;
    private int score;
    private Date createAt;

    public StudentSubmission(Submission submission, Student student, String file, int score, Date createAt) {
        this.submission = submission;
        this.student = student;
        this.file = file;
        this.score = score;
        this.createAt = createAt;
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
