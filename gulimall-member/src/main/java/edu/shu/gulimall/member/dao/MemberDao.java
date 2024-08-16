package edu.shu.gulimall.member.dao;

import edu.shu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:12:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
