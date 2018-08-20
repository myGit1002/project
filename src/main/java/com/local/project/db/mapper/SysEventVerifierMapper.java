package com.local.project.db.mapper;

import com.local.project.db.pojo.SysEventVerifier;

public interface SysEventVerifierMapper {
    int insert(SysEventVerifier record);

    int insertSelective(SysEventVerifier record);
}