/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userconsume.controller;

import com.gyoomi.userconsume.pojo.User;
import com.gyoomi.userconsume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/8 15:46
 */
@RestController
@RequestMapping(value = "/consume")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findListByIds(@RequestParam("ids") List<Long> ids) {
        return userService.findListByIds(ids);
    }
}
