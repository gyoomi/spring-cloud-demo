/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userservice.service;

import com.gyoomi.userservice.mapper.UserMapper;
import com.gyoomi.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/5 17:57
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}