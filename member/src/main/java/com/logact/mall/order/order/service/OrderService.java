package com.logact.mall.order.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.logact.common.utils.PageUtils;
import com.logact.mall.order.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author logact
 * @email logact@qq.com
 * @date 2020-04-02 00:20:36
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

