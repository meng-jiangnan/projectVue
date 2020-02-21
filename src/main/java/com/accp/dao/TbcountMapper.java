package com.accp.dao;

import com.accp.pojo.Tbcount;

public interface TbcountMapper {
    int deleteByPrimaryKey(Integer countid);

    int insert(Tbcount record);

    int insertSelective(Tbcount record);

    Tbcount selectByPrimaryKey(Integer countid);

    int updateByPrimaryKeySelective(Tbcount record);

    int updateByPrimaryKey(Tbcount record);
}