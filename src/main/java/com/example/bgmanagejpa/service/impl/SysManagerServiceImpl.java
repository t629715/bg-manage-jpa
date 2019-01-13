package com.example.bgmanagejpa.service.impl;

import com.example.bgmanagejpa.entity.SysManager;
import com.example.bgmanagejpa.mapper.SysManagerMapper;
import com.example.bgmanagejpa.service.SysManagerService;
import com.example.bgmanagejpa.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysManagerServiceImpl implements SysManagerService {
    @Autowired
    private SysManagerMapper sysManagerMapper;
    @Override
    public String getOneManager(SysManager sysManager) {
        List<SysManager> sysManagerList = sysManagerMapper.findAll(Example.of(sysManager));
        if (sysManagerList != null && sysManagerList.size() != 0){
            return JwtUtil.createToken(sysManager.getId(),100);
        }
        return null;
    }
}
