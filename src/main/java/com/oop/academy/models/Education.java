/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.io.File;

/**
 *
 * @author asus
 */
public class Education {
    private String name;
    private int attendPeriod;
    private String degree;
    private float gpa;
    private File certificateUrl;

    public Education(String name, int attendPeriod, String degree, float gpa, 
            File certificateUrl) {
        this.name = name;
        this.attendPeriod = attendPeriod;
        this.degree = degree;
        this.gpa = gpa;
        this.certificateUrl = certificateUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttendPeriod() {
        return attendPeriod;
    }

    public void setAttendPeriod(int attendPeriod) {
        this.attendPeriod = attendPeriod;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public File getCertificateUrl() {
        return certificateUrl;
    }

    public void setCertificateUrl(File certificateUrl) {
        this.certificateUrl = certificateUrl;
    }
    
    
}
