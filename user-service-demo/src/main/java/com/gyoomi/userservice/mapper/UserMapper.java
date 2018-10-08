/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.userservice.mapper;

import com.gyoomi.userservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/8 15:08
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
