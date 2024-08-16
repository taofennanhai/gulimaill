package edu.shu.gulimall.order.dao;

import edu.shu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:22:50
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
