package com.whalone.gulimall.product.dao;

import com.whalone.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author whalone
 * @email 469716638@qq.com
 * @date 2020-04-25 19:04:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
