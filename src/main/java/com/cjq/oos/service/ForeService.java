package com.cjq.oos.service;

import java.util.List;

import com.cjq.oos.pojo.Category;
import com.cjq.oos.pojo.Product;

public interface ForeService {

    /**
     * 返回保存6个分类对象的List集合
     * @return
     */
    public List<Category> listToThree();

    public List<Product> getFivePro();

}
