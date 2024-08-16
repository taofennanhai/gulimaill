package edu.shu.gulimall.ware.dao;

import edu.shu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:28:42
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
