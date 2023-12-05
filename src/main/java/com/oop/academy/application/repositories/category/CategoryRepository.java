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
        if (!categories.remove(category)) {
            throw new Exception("Kategori tidak ditemukan");
        }
        
        categories.add(newCategory);
    }

    @Override
    public void deleteCategory(Category category) throws Exception {
        categories.remove(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categories;
    }
    
    @Override
    public Category getByName(String name) throws Exception {
        for (Category data : categories) {
            if (data.getName().equalsIgnoreCase(name)) {
                return data;
            }
        }
        throw new Exception("Kategori tidak ditemukan");
    }
}
