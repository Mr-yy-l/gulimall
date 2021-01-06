/**
  * Copyright 2019 bejson.com 
  */
package com.guli.mall.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021/1/6 18:35
 **/
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}