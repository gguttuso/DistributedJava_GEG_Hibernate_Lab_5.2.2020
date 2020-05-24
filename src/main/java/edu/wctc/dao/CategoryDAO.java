package edu.wctc.dao;

import edu.wctc.entity.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getCategories();

    void saveCategory(Category theCategory);

    Category getCategory(int theId);

    void deleteCategory(int theId);
}
