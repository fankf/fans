package com.fans.admin.controller;

import com.fans.admin.entity.SysRole;
import com.fans.admin.service.SysRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色管理(SysRole)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:43:06
 */
@RestController
@RequestMapping("sysRole")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRole selectOne(Long id) {
        return this.sysRoleService.queryById(id);
    }

}