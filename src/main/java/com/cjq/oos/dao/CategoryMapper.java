package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.Category;
import com.cjq.oos.pojo.CategoryExample;

public interface CategoryMapper extends CrudDao<Category>{

     List<Category> selectByExample(CategoryExample example);

}