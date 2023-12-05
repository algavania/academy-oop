/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.authentication;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.User;
import java.util.List;

/**
 *
 * @author mamir
 */
public class AuthRepository implements BaseAuthRepository {

    private final List<User> users = DatabaseService.getUsers();

    @Override
    public void register(User user) throws Exception {
        boolean isUserNameExist = false;
        for (User data : users) {
            isUserNameExist = data.getUsername().equalsIgnoreCase(user.getUsername());
            if (isUserNameExist) {
                break;
            }
        }
        if (isUserNameExist) {
            throw new Exception("username sudah dipakai, silakan pilih nama lain.");
        } else {
            users.add(user);
        }
    }

    @Override
    public User login(String username, String password) throws Exception {
        for (User user : users) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                DatabaseService.currentUser = user;
                return user;
            }
        }
        throw new Exception("data tidak ditemukan, coba lagi!");
    }
    
    @Override
    public void logout() {
        DatabaseService.currentUser = null;
    }
}
