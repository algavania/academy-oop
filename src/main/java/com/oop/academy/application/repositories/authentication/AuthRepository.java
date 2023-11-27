/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.authentication;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.User;
import java.util.List;
import com.oop.academy.application.repositories.authentication.BaseAuthRepository;

/**
 *
 * @author mamir
 */
public class AuthRepository implements BaseAuthRepository {

    private final List<User> users = DatabaseService.getUsers();

    @Override
    public void Register(User user) throws Exception {
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
    public int Login(String username, String password) throws Exception {
        int i = 0;
        for (User data : users) {
            if (data.getUsername().equals(username)
                    && data.getPassword().equals(password)) {

                return i;
            }
            i++;
        }
        throw new Exception("not found");

    }

}
