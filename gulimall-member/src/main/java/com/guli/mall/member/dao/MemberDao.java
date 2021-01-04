package com.guli.mall.member.dao;

import com.guli.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author L
 * @email ali_L@aliyu.com
 * @date 2021-01-04 17:03:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
