package com.alexg.apicommon.service;

import com.alexg.apicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public interface InnerUserService {

    /**
     * 根据accessKey查询用户
     *
     * @param accessKey accessKey
     * @return User
     */
    User getInvokeUser(String accessKey);

}
