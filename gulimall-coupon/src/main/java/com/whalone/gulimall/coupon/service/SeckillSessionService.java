package com.whalone.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whalone.common.utils.PageUtils;
import com.whalone.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author whalone
 * @email 469716638@qq.com
 * @date 2020-04-30 20:18:52
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

