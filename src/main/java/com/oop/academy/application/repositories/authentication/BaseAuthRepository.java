/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.academy.application.repositories.authentication;

import com.oop.academy.models.User;

/**
 *
 * @author mamir
 */
public interface BaseAuthRepository {
    public void Register(User user) throws Exception;
    public int Login(String username, String password) throws Exception;
}
