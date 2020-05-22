package com.cjq.oos.service;

import java.util.List;

import com.cjq.oos.pojo.Product;
import com.cjq.oos.pojo.Review;

public interface ReviewService extends CrudService<Review>{

    /**
     * 获得一个商品的所有评论
     * @param id 商品id
     * @return
     */
    List<Review> getReviewListByPid(int id);

}
