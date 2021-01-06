package com.guli.mall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021/1/6 23:20
 **/
@Data
public class MergeVo {

   private Long purchaseId; //整单id
   private List<Long> items;//[1,2,3,4] //合并项集合
}
