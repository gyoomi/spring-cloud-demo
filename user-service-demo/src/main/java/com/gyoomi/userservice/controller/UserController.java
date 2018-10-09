/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userservice.controller;

import com.gyoomi.userservice.pojo.User;
import com.gyoomi.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/5 17:56
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable("id") Long id) {
        try {
            int i = new Random().nextInt(3000);
            System.out.println("沉睡时间：" + i);
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userService.findById(id);
    }
}
