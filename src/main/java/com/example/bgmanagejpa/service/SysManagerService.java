package com.example.bgmanagejpa.service;

import com.example.bgmanagejpa.entity.SysManager;

public interface SysManagerService {
    /**
     * 根据用户名、密码获取用户信息
     * @param sysManager
     * @return
     */
    String getOneManager(SysManager sysManager);
}
