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
 * @author mfazi
 */
public class UserRepository implements BaseUserRepository{
    
    private final List<User> users = DatabaseService.getUsers();
    
    @Override
    public List<User> getAllUser() {
        return users;
    }
    
    @Override
    public void add(User user) {
        users.add(user);
    }
    
    @Override
    public User getByUsername(String username) throws Exception {
        for(User user: users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        throw new Exception("User tidak ditemukan");
    }
    
    public void delete(User user) throws Exception {
        if(!users.remove(user)) {
            throw new Exception("User tidak ditemukan");
        }
    }
}
