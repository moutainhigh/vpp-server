package com.vpp.core.withdrawal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vpp.core.withdrawal.bean.WithdrawalAccount;

@Mapper
public interface WithdrawalAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WithdrawalAccount record);

    int insertSelective(WithdrawalAccount record);

    WithdrawalAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WithdrawalAccount record);

    int updateByPrimaryKey(WithdrawalAccount record);
    
    /**
     * 根据客户Id查询钱包地址
     * @param customerId
     * @return
     */
    List<WithdrawalAccount> selectWithdrawalAccountByCustomerId(Long customerId);
}