package com.logact.mall.member.member.dao;

import com.logact.mall.member.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author logact
 * @email logact@qq.com
 * @date 2020-04-02 00:41:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
