/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.academy.application.repositories.user;

import com.oop.academy.models.User;
import java.util.List;

/**
 *
 * @author mfazi
 */
public interface BaseUserRepository {
    public List<User> getAllUser();
    public void add(User user);
    public User getByUsername(String username) throws Exception;
    public void delete(User user) throws Exception;
}
