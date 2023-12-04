/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.academy.application.repositories.teacher.submit;

import com.oop.academy.models.Teacher;
import com.oop.academy.models.User;
import java.util.List;

/**
 *
 * @author mamir
 */
public interface BaseSubmitTeacherRepository {

    public void acceptNewTeacher(Teacher user_teacher);

    public void rejectNewTeacher(Teacher user_teacher);
    
    public List<Teacher> getAllUserTeacherRequest();
}
