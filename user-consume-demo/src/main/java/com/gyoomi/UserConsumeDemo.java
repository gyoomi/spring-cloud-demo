/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/8 15:33
 */
@EnableHystrix
@SpringBootApplication
@EnableDiscoveryClient
@EnableRetry
@EnableFeignClients
public class UserConsumeDemo {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumeDemo.class, args);
    }

    /*@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }*/
}
