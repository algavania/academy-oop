/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.academy.application.repositories.user;

import com.oop.academy.models.User;

/**
 *
 * @author mamir
 */
public interface BaseUserRepository {
    public void addCategory(User user) throws Exception;
    public void updateCategory(User user, User newUser) throws Exception;
    public void deleteCategory(User user);
}
