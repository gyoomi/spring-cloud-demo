/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/8 14:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceDemo {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceDemo.class, args);
    }
}
