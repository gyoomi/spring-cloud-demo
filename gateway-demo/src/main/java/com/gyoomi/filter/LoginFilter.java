/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录拦截
 *
 * @author Leon
 * @version 2018/10/11 22:34
 */
@Component
public class LoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest req = ctx.getRequest();
        String token = req.getParameter("token");
        if (token == null || "".equals(token.trim())) {
            // 没有携带token，设置401
            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            // 没有携带token,登录 校验失败，登录拦截
            ctx.setSendZuulResponse(false);
        }
        return null;
    }
}
