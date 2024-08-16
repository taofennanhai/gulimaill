package edu.shu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.shu.common.utils.PageUtils;
import edu.shu.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:22:50
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

