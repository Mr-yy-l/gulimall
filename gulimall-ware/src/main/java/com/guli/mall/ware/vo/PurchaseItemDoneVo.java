package com.guli.mall.ware.vo;

import lombok.Data;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021/1/6 23:20
 **/
@Data
public class PurchaseItemDoneVo {
    //{itemId:1,status:4,reason:""}
    private Long itemId;
    private Integer status;
    private String reason;
}
