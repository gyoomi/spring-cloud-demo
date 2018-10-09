/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userconsume.service;

import com.gyoomi.userconsume.dao.UserDao;
import com.gyoomi.userconsume.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/8 15:54
 */
@Service
public class UserService {

    /**
     * Eureka客户端，可以获取到服务实例
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserDao userDao;

    public List<User> findListByIds(List<Long> ids) {
        String baseUrl = "http://user-service/user/";
        List<User> list = new LinkedList<>();
        if (ids.size() > 0) {
            ids.stream().map(id -> restTemplate.getForObject(baseUrl + id, User.class)).forEach(list::add);
        }
        return list;
    }
}
