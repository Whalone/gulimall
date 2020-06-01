package com.whalone.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whalone.common.utils.PageUtils;
import com.whalone.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author whalone
 * @email 469716638@qq.com
 * @date 2020-04-25 19:04:00
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

