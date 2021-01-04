package com.guli.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 16:59:07
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

