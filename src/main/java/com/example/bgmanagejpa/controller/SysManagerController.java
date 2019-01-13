package com.example.bgmanagejpa.controller;

import com.example.bgmanagejpa.entity.SysManager;
import com.example.bgmanagejpa.service.SysManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: adminisrator
 * @date: 2019/1/9
 * @description:
 */
@RestController
@RequestMapping("/sysManager")
public class SysManagerController {
    @Autowired
    SysManagerService sysManagerService;


    @GetMapping("/login")
    public Object login(SysManager sysManager){
        String token = sysManagerService.getOneManager(sysManager);
        if (StringUtils.isEmpty(token)){

        }else {
        }

        return null;
    }
}
