/**
  * Copyright 2019 bejson.com 
  */
package com.guli.mall.product.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021-01-05 15:49
 **/

@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}