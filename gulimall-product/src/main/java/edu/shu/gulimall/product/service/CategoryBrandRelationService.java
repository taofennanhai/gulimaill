package edu.shu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.shu.common.utils.PageUtils;
import edu.shu.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 15:31:15
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

