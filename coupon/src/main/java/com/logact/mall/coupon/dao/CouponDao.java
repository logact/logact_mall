package com.logact.mall.coupon.dao;

import com.logact.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author logact
 * @email logact@qq.com
 * @date 2020-04-01 21:46:27
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
