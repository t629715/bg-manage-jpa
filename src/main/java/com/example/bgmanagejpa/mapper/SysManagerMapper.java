package com.example.bgmanagejpa.mapper;

import com.example.bgmanagejpa.entity.SysManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author: adminisrator
 * @date: 2019/1/9
 * @description:
 */
@Repository
public interface SysManagerMapper extends JpaRepository<SysManager,Long>, JpaSpecificationExecutor<SysManager>, Serializable {
}
