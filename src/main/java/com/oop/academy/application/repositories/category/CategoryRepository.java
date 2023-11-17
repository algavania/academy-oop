/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.category;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.Category;
import java.util.List;

/**
 *
 * @author MSI
 */
public class CategoryRepository implements BaseCategoryRepository {

    private final List<Category> categories = DatabaseService.getCategories();

    @Override
    public void addCategory(Category category) throws Exception {
        boolean isNameExist = false;
        for (Category data : categories) {
            isNameExist = data.getName().equalsIgnoreCase(category.getName());
            if (isNameExist) {
                break;
            }
        }
        if (isNameExist) {
            throw new Exception("Nama sudah dipakai, silakan pilih nama lain.");
        } else {
            categories.add(category);
        }
    }

    @Override
    public void updateCategory(Category category, Category newCategory) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
