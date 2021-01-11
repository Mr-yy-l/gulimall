package com.guli.mall.member.exception;

/**
 * @author L
 */
public class UsernameExistException extends RuntimeException {

    public UsernameExistException() {
        super("用户名存在");
    }
}
