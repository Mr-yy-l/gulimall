package com.guli.mall.order.dao;

import com.guli.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 16:59:07
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
