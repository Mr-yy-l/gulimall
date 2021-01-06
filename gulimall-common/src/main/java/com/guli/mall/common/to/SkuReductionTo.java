package com.guli.mall.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021/1/6 18:35
 **/

@Data
public class SkuReductionTo {

    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;
}
