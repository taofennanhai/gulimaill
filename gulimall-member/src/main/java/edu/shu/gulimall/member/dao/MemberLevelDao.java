package edu.shu.gulimall.member.dao;

import edu.shu.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:12:12
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
