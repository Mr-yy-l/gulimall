package com.guli.mall.product.dao;

import com.guli.mall.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu信息
 * 
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 17:00:57
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    void updateSpuStatus(Long spuId, int code);
}
