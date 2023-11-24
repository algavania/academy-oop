/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

import java.util.Date;

/**
 *
 * @author mfazi
 */
public class Student extends User{
    
    public Student(String username, String name, String gender, Date birthdate, String email, String password, String photoUrl, double balance) {
        super(username, name, gender, birthdate, email, password, photoUrl, balance);
    }
    
}
