/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userconsume.dao;

import com.gyoomi.userconsume.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger lg = LoggerFactory.getLogger(UserDao.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "findByIdFallBack")
    public User findById(Long id) {
        long begin = System.currentTimeMillis();
        String url = "http://user-service/user/" + id;
        User user = restTemplate.getForObject(url, User.class);
        long end = System.currentTimeMillis();
        lg.info("访问用时：{} id：{}", (end - begin), id);
        return user;
    }

    public User findByIdFallBack(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户信息查询异常");
        return user;
    }
}
