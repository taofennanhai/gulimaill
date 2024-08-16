package edu.shu.gulimall.order.dao;

import edu.shu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:22:50
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
