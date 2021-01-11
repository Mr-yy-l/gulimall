package com.guli.mall.member.exception;

/**
 * @author L
 */
public class PhoneExsitException extends RuntimeException {

    public PhoneExsitException() {
        super("手机号存在");
    }
}
