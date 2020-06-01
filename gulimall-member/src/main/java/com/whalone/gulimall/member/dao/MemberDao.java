package com.whalone.gulimall.member.dao;

import com.whalone.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author whalone
 * @email 469716638@qq.com
 * @date 2020-04-30 20:28:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
