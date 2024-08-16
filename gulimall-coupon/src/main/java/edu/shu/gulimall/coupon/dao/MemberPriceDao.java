package edu.shu.gulimall.coupon.dao;

import edu.shu.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:03:15
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
