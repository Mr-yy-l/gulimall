package com.guli.mall.product.dao;

import com.guli.mall.product.entity.SkuSaleAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guli.mall.product.vo.SkuItemSaleAttrVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * sku销售属性&值
 * 
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 17:00:57
 */
@Mapper
public interface SkuSaleAttrValueDao extends BaseMapper<SkuSaleAttrValueEntity> {

    List<String> getSkuSaleAttrValuesAsStringList(Long skuId);

    List<SkuItemSaleAttrVo> getSaleAttrsBySpuId(Long spuId);
}
