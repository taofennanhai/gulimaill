package edu.shu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.shu.common.utils.PageUtils;
import edu.shu.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 15:31:15
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

