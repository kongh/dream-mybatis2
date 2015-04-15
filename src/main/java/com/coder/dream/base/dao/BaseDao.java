package com.coder.dream.base.dao;

import com.coder.dream.base.dao.mapper.BaseMapper;
import com.coder.dream.base.dao.query.support.FilterQuery;

import java.util.List;

public abstract class BaseDao<T,M extends BaseMapper<T>> {

    protected M mapper;

    /**
     * 列表
     *
     * @param filters
     * @return
     */
    public List<T> list(FilterQuery filters){
        return mapper.list(filters);
    }

    /**
     * 分页
     *
     * @param filters
     * @return
     */
    public List<T> page(FilterQuery filters){
        return mapper.page(filters);
    }
}
