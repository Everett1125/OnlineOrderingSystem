package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.Review;
import com.cjq.oos.pojo.ReviewExample;

public interface ReviewMapper extends CrudDao<Review>{

    List<Review> selectByExample(ReviewExample example);

}