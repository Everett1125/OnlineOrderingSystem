package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.ZiXun;
import com.cjq.oos.pojo.ZiXunExample;

public interface ZiXunMapper extends CrudDao<ZiXun> {

    List<ZiXun> selectByExample(ZiXunExample example);

    /**
     * 资讯审核
     * @param zid
     */
    void shenhe(int zid);

}