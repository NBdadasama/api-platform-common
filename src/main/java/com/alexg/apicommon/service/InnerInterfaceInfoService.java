package com.alexg.apicommon.service;

import com.alexg.apicommon.model.entity.InterfaceInfo;

/**
* @author 86185
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-04-02 16:58:27
*/
public interface InnerInterfaceInfoService {
    /**
     * 根据path、method查询接口信息
     *
     * @param path   请求路径
     * @param method 请求方法
     * @return InterfaceInfo
     */
    InterfaceInfo getInvokeInterfaceInfo(String path, String method);
}
