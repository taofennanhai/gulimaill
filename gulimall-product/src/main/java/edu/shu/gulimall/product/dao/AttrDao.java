package edu.shu.gulimall.product.dao;

import edu.shu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 15:31:15
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
