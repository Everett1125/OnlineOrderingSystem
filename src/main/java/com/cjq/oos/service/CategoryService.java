package com.cjq.oos.service;

import java.util.List;

import com.cjq.oos.pojo.Category;

public interface CategoryService extends CrudService<Category> {
    /**
     * 更新分类
     * @param category
     */
    public void update(Category category);
}
