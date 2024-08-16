package edu.shu.gulimall.order.dao;

import edu.shu.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:22:50
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
