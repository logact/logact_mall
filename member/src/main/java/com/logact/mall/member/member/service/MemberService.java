package com.logact.mall.member.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.logact.common.utils.PageUtils;
import com.logact.mall.member.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author logact
 * @email logact@qq.com
 * @date 2020-04-02 00:41:13
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

