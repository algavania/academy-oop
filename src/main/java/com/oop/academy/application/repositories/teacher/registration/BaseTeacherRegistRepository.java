/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oop.academy.application.repositories.teacher.registration;

import com.oop.academy.models.Education;
import com.oop.academy.models.Teacher;
import java.util.List;

/**
 *
 * @author mamir
 */
public interface BaseTeacherRegistRepository {
    public void addEducation(Education education) throws Exception;

    public void updateEducation(int idOldEducation, Education newEducation) throws Exception;

    public void deleteEducation(Education education) throws Exception;

    public List<Education> getAllEducation();

    public void RegisterTeacher(Teacher teacher) throws Exception;
}
