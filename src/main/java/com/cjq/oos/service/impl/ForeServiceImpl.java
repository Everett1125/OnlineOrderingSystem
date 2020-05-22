package com.cjq.oos.service.impl;

import com.cjq.oos.dao.CategoryMapper;
import com.cjq.oos.dao.ProductMapper;
import com.cjq.oos.pojo.Category;
import com.cjq.oos.pojo.CategoryExample;
import com.cjq.oos.pojo.Product;
import com.cjq.oos.service.ForeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeServiceImpl implements ForeService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Category> listToThree() {
        CategoryExample example = new CategoryExample();
        example.createCriteria().andIdBetween(1,4); //从1开始计数
        List<Category> categories = categoryMapper.selectByExample(example);
        return categories;
    }

    @Override
    public List<Product> getFivePro() {
        return productMapper.randFive();
    }


}
