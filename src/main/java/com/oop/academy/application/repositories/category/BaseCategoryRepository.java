/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy.application.repositories.category;

import com.oop.academy.models.Category;
import java.util.List;

/**
 *
 * @author MSI
 */
interface BaseCategoryRepository {
    public void addCategory(Category category) throws Exception;
    public void updateCategory(Category category, Category newCategory) throws Exception;
    public void deleteCategory(Category category) throws Exception;
    public List<Category> getAllCategory();
    public Category getByName(String name) throws Exception;
}
