package com.logact.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.logact.common.utils.PageUtils;
import com.logact.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author logact
 * @email logact@qq.com
 * @date 2020-04-01 21:46:27
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

