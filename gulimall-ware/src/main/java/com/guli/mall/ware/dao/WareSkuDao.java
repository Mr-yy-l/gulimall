package com.guli.mall.ware.dao;

import com.guli.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 17:05:15
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    void addStock(Long skuId, Long wareId, Integer skuNum);

    Long getSkuStock(Long skuId);
}
