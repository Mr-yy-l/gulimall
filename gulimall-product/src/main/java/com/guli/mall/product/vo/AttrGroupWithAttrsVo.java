package com.guli.mall.product.vo;

import com.guli.mall.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021-01-05 15:49
 **/

@Data
public class AttrGroupWithAttrsVo {

    /**
     * 分组id
     */
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
