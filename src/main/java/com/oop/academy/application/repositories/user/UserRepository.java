/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.user;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.User;
import java.util.List;

/**
 *
 * @author mamir
 */
public class UserRepository implements BaseUserRepository{
    private final List<User> users = DatabaseService.getUsers();

    @Override
    public void addCategory(User user) throws Exception {
        boolean isNameExist = false;
        for (User data : users) {
            isNameExist = data.getName().equalsIgnoreCase(user.getName());
            if (isNameExist) {
                break;
            }
        }
        if (isNameExist) {
            throw new Exception("Nama sudah dipakai, silakan pilih nama lain.");
        } else {
            users.add(user);
        }
    }

    @Override
    public void updateCategory(User user, User newUser) throws Exception {
        
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteCategory(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
