package edu.shu.gulimall.ware.dao;

import edu.shu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:28:42
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
