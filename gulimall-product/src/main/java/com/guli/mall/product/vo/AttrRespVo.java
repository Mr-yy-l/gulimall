package com.guli.mall.product.vo;

import lombok.Data;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021-01-05 15:49
 **/

@Data
public class AttrRespVo extends AttrVo {
    /**
     * 			"catelogName": "手机/数码/手机", //所属分类名字
     * 			"groupName": "主体", //所属分组名字
     */
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
