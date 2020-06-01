package com.whalone.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  1. 如何使用nacos作为配置中心
 *      1）、引入依赖
 *      <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *      </dependency>
 *      2）、在resource目录下创建bootstrap.properties文件，配置应用名和nacos请求地址端口
 *      spring.application.name=gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *      3）、在配置中心建立数据集。默认命名规则为应用名.properties。即为bootstrap.properties
 *      4）、给properties里面添加配置
 *      5）、使用注解
 *      @RefreshScope：动态刷新配置
 *      @Value("${配置的名字}")：获取配置的值
 *      如果配置中心和当前应用的配置文件都配置了相同的项，则优先读取配置中心的项。
 *  2. 细节
 *      1）、命名空间：配置隔离
 *          默认：public（保留空间）；默认新增的所有配置都在public空间
 *          1. 开发，测试，生产：利用命名空间进行环境隔离
 *          注意：在bootstrap.properties需要配置上需要使用哪一个命名空间的配置
 *          spring.cloud.nacos.config.namespace=429aaa12-0167-4210-9936-997cc67b9d76
 *          2. 每一个微服务之间相互隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间上的配置
 *      2）、配置集：所有配置的集合
 *      3）、配置集ID：文件名
 *          Data Id：类似文件名
 *      4）、配置分组：
 *          默认所有的配置及都属于DEFAULT_GROUP
 *          在bootstrap.properties中配置分组 spring.cloud.nacos.config.group=dev
 *
 *      每个微服务创建自己的命名空间，使用配置分组来区分各个环境：dev，test，prod
 *      3. 同事加载多个配置集
 *      1）、微服务任何配置信息，任何配置文件都可以放在配置中心
 *      2）、只需要在bootstrap.properties说明加载配置中的我哪些配置文件即可
 *      3）、@Value,@Configuration。。。
 *      以前springboot任何方法从配置中心获取值，都能使用。
 *      配置中心有的优先使用配置中心的
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
