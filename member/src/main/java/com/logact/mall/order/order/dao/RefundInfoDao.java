package com.logact.mall.order.order.dao;

import com.logact.mall.order.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author logact
 * @email logact@qq.com
 * @date 2020-04-02 00:20:36
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
