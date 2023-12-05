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
    private final List<User> users = DatabaseService.getUsers();

    @Override
    public void acceptNewTeacher(int selectedRow) {
        User user = findStudentByUser(userTeacherRequests.
                get(selectedRow));
        users.remove(user);
        users.add(userTeacherRequests.get(selectedRow));
        userTeacherRequests.remove(selectedRow);

    }

    @Override
    public void rejectNewTeacher(int selectedRow) {
        userTeacherRequests.remove(selectedRow);
    }

    @Override
    public List<Teacher> getAllUserTeacherRequest() {
        return userTeacherRequests;
    }
    
    public User findStudentByUser(User user) {
        boolean isUserNameExist = false;
        for (User data : users) {
            isUserNameExist = data.getUsername().equalsIgnoreCase(user.getUsername());
            if (isUserNameExist) {
                return (User) data;
            }
            
        }
        return null;
    }
}
