/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/8 13:30
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceDemo {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDemo.class, args);
    }
}
