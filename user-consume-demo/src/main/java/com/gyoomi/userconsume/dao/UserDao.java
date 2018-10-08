/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userconsume.dao;

import com.gyoomi.userconsume.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/8 15:56
 */
@Component
public class UserDao {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        String url = "http://localhost:8081/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }
}
