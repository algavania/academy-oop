/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.models;

/**
 *
 * @author MSI
 */
public class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object objenct) {
        Category category;
        try {
            category = (Category) objenct;
        } catch(Exception e) {
            return false;
        }
        
        return (category.getName().equals(this.name));
    }
}
