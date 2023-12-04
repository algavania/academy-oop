/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.teacher.registration;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.Education;
import com.oop.academy.models.Teacher;
import com.oop.academy.models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mamir
 */
public class TeacherRegistRepository implements BaseTeacherRegistRepository {

    private List<Education> educations;
    private final List<Teacher> userTeacherRequests = DatabaseService.
            getUserTeacherRequests();
    private int selectedRow = 0;

    public int getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(int selectedRow) {
        this.selectedRow = selectedRow;
    }

    @Override
    public void addEducation(Education education) throws Exception {
        if (educations == null) {
            educations = new ArrayList();
        }
        educations.add(education);
    }

    @Override
    public void updateEducation(int idOldEducation, Education newEducation) throws Exception {
        educations.set(idOldEducation, newEducation);
    }

    @Override
    public void deleteEducation(Education education) throws Exception {
        educations.remove(educations);
    }

    @Override
    public void RegisterTeacher(Teacher teacher) throws Exception {
        userTeacherRequests.add(teacher);
    }

    @Override
    public List<Education> getAllEducation() {
        if (educations == null) {
            educations = new ArrayList();
        }
        return educations;
    }

    public Education getEducationById(int id) {
        return educations.get(id);
    }


}
