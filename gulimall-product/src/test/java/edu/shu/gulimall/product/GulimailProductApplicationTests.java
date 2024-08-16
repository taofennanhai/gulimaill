package edu.shu.gulimall.product;

import edu.shu.gulimall.product.entity.BrandEntity;
import edu.shu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void testCURD() {
        //增加
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("花粉");
//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        //修改
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(6L);
//        brandEntity.setDescript("修改");
//        brandService.updateById(brandEntity);

        //查询



    }

}
