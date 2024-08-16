package edu.shu.gulimall.member.dao;

import edu.shu.gulimall.member.entity.MemberCollectSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的专题活动
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:12:12
 */
@Mapper
public interface MemberCollectSubjectDao extends BaseMapper<MemberCollectSubjectEntity> {
	
}
