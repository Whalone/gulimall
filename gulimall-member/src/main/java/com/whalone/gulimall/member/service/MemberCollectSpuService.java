package com.whalone.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whalone.common.utils.PageUtils;
import com.whalone.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author whalone
 * @email 469716638@qq.com
 * @date 2020-04-30 20:28:21
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

