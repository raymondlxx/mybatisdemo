package com.deppon.test05.dao.impl;

import com.deppon.test05.dao.CustomerEntityMapper;
import com.deppon.test05.entity.CustomerEntity;
import com.deppon.test05.entity.CustomerEntityKey;
import com.deppon.test05.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by lilei on 5/16/2017.
 */
public class CustomerEntityDao implements CustomerEntityMapper {
    @Override
    public int deleteByPrimaryKey(CustomerEntityKey key) {
        SqlSession sqlSession = MyBatisUtil.getSession();

        try {
            CustomerEntityMapper mapper = sqlSession.getMapper(CustomerEntityMapper.class);
            return mapper.deleteByPrimaryKey(key);
        } finally {
            sqlSession.close();
        }

    }

    @Override
    public int insert(CustomerEntity record) {
        SqlSession sqlSession = MyBatisUtil.getSession();

        try {
            CustomerEntityMapper mapper = sqlSession.getMapper(CustomerEntityMapper.class);
            return mapper.insert(record);
        } finally {
            sqlSession.close();
        }

    }

    @Override
    public int insertSelective(CustomerEntity record) {
        return 0;
    }

    @Override
    public CustomerEntity selectByPrimaryKey(CustomerEntityKey key) {
        SqlSession sqlSession = MyBatisUtil.getSession();

        try {
            CustomerEntityMapper mapper = sqlSession.getMapper(CustomerEntityMapper.class);
            return mapper.selectByPrimaryKey(key);
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerEntity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CustomerEntity record) {
        return 0;
    }
}
