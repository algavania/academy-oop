/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class DateHelper {

    private final String pattern = "yyyy-MM-dd HH:mm:ss";
    private final String birthdayPattern = "dd-MM-yyyy";

    public String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }

    public String formatBirthday(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(birthdayPattern);
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }
}
