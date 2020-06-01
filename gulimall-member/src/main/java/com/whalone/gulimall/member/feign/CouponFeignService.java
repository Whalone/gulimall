package com.whalone.gulimall.member.feign;

import com.whalone.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")

/**
 *  1、@FeignClient(XXX) 告诉springcloud这个一个远程客户端 调用的是XXX
 *  2、复制要调用的方法的路径和方法名
 */
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
