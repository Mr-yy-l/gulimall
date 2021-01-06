package com.guli.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.to.SkuReductionTo;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 17:02:34
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
    void saveSkuReduction(SkuReductionTo reductionTo);
}

