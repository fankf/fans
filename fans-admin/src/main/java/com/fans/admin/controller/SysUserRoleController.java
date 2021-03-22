package com.fans.admin.controller;

import com.fans.admin.entity.SysUserRole;
import com.fans.admin.service.SysUserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户角色(SysUserRole)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:43:31
 */
@RestController
@RequestMapping("sysUserRole")
public class SysUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserRoleService sysUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserRole selectOne(Long id) {
        return this.sysUserRoleService.queryById(id);
    }

}