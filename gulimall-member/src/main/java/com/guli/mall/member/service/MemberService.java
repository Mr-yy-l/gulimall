package com.guli.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.mall.common.utils.PageUtils;
import com.guli.mall.member.entity.MemberEntity;

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
}

