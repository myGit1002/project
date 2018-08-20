package com.local.project.db.mapper;

import com.local.project.db.pojo.SysEvent;

public interface SysEventMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysEvent record);

    int insertSelective(SysEvent record);

    SysEvent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysEvent record);

    int updateByPrimaryKey(SysEvent record);
}