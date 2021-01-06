package com.guli.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.common.utils.R;
import com.guli.mall.product.entity.AttrEntity;
import com.guli.mall.product.vo.AttrGroupRelationVo;
import com.guli.mall.product.vo.AttrRespVo;
import com.guli.mall.product.vo.AttrVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
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

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

    //product/attr/sale/list/0?
    ///product/attr/base/list/{catelogId}
    @GetMapping("/{attrType}/list/{catelogId}")
    default R baseAttrList(@RequestParam Map<String, Object> params,
                           @PathVariable("catelogId") Long catelogId,
                           @PathVariable("attrType") String type){

        PageUtils page = queryBaseAttrPage(params,catelogId,type);
        return R.ok().put("page", page);
    }
}

