package edu.shu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.shu.common.utils.PageUtils;
import edu.shu.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 15:31:15
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

