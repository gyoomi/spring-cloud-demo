/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userconsume.dao;

import com.gyoomi.userconsume.pojo.User;
import org.springframework.stereotype.Component;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/11 14:20
 */
@Component
public class UserFeignClientFallback implements UserFeignClient {


    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户信息查询异常");
        return user;
    }
}
