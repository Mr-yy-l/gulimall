package com.guli.mall.cart.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author L
 */
@ToString
@Data
public class UserInfoTo {

    private Long userId;
    private String userKey; //一定封装
    private boolean tempUser = false;
}
