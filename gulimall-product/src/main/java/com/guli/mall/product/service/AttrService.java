package com.guli.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 17:00:57
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

