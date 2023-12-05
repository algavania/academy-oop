/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.academy.application.repositories.user.topup;

import com.oop.academy.models.User;

/**
 *
 * @author mamir
 */
public interface BaseTopUpRepository {
    public void topUp(int jumlahUang, User currentUser);
}
