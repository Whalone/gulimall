package com.whalone.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whalone.common.utils.PageUtils;
import com.whalone.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author whalone
 * @email 469716638@qq.com
 * @date 2020-04-30 20:41:10
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

