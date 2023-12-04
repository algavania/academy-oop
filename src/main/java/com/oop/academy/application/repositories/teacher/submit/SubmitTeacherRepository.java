/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.teacher.submit;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.Teacher;
import com.oop.academy.models.User;
import java.util.List;

/**
 *
 * @author mamir
 */
public class SubmitTeacherRepository implements BaseSubmitTeacherRepository {

    private final List<Teacher> userTeacherRequests = DatabaseService.
            getUserTeacherRequests();
    private final List<User> user = DatabaseService.getUsers();
    private int selectedRow = 0;

    @Override
    public void acceptNewTeacher(Teacher user_teacher) {
        userTeacherRequests.remove(selectedRow);
        user.remove(user_teacher);
        user.add(user_teacher);
    }

    @Override
    public void rejectNewTeacher(Teacher user_teacher) {
        userTeacherRequests.remove(selectedRow);
    }

    @Override
    public List<Teacher> getAllUserTeacherRequest() {
        return userTeacherRequests;
    }

}
