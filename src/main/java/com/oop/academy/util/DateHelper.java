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

    public String formatDate(Date date) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }
}
