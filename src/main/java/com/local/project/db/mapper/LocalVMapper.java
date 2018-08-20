package com.local.project.db.mapper;

import com.local.project.db.pojo.LocalV;

public interface LocalVMapper {
    int insert(LocalV record);

    int insertSelective(LocalV record);
}