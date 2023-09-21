package com.alexg.apicommon.service;

import com.alexg.apicommon.model.entity.User;

/**
 * 用户服务
 *

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
