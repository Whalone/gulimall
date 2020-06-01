package com.whalone.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whalone.common.utils.PageUtils;
import com.whalone.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author whalone
 * @email 469716638@qq.com
 * @date 2020-04-30 20:28:20
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

