package edu.shu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
    命名空间：用作配置隔离。（一般每个微服务一个命名空间）
    默认public。默认新增的配置都在public空间下
    开发、测试、开发可以用命名空间分割。properties每个空间有一份。也可以为每个微服务配置一个命名空间，微服务互相隔离
    在bootstrap.properties里配置（测试完去掉，学习不需要）
 */



@SpringBootApplication
public class GulimailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailCouponApplication.class, args);
    }

}
