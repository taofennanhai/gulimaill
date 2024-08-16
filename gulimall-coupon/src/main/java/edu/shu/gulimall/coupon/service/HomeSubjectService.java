package edu.shu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.shu.common.utils.PageUtils;
import edu.shu.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yu
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 17:03:15
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

