package edu.shu.gulimall.ware.dao;

import edu.shu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:28:42
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
