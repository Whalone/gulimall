package com.whalone.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whalone.common.utils.PageUtils;
import com.whalone.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author whalone
 * @email 469716638@qq.com
 * @date 2020-04-30 20:41:10
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

