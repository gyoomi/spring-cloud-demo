/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/11 16:20
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy // 开启Zuul网关
public class ZuulService {

    public static void main(String[] args) {
        SpringApplication.run(ZuulService.class, args);
    }
}
