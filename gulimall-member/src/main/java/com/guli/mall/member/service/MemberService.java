package com.guli.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.member.entity.MemberEntity;
import com.guli.mall.member.exception.PhoneExsitException;
import com.guli.mall.member.exception.UsernameExistException;
import com.guli.mall.member.vo.MemberLoginVo;
import com.guli.mall.member.vo.MemberRegistVo;
import com.guli.mall.member.vo.SocialUser;

import java.util.Map;

/**
 * 会员
 *
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 17:03:55
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void regist(MemberRegistVo vo);

    void checkPhoneUnique(String phone) throws PhoneExsitException;

    void checkUsernameUnique(String username) throws UsernameExistException;

    MemberEntity login(MemberLoginVo vo);

    MemberEntity login(SocialUser socialUser) throws Exception;
}

