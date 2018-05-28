package com.vpp.core.system.role.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vpp.core.system.role.bean.UserRole;

public interface IUserRoleService {
    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

    List<Long> findRoleIdsByUserId(@Param("userId") Long userId);

    int deleteByUserId(@Param("userId") Long userId);

}
