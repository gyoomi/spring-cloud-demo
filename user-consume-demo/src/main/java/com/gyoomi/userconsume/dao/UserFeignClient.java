/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userconsume.dao;

import com.gyoomi.userconsume.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 接口功能描述
 *
 * @author Leon
 * @version 2018/10/11 10:26
 */
@FeignClient(value = "user-service")
public interface UserFeignClient {

    @GetMapping(value = "/user/{id}")
    User findById(@PathVariable("id") Long id);
}
