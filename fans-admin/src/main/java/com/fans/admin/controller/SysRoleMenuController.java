package com.fans.admin.controller;

import com.fans.admin.entity.SysRoleMenu;
import com.fans.admin.service.SysRoleMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色菜单(SysRoleMenu)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:43:18
 */
@RestController
@RequestMapping("sysRoleMenu")
public class SysRoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRoleMenu selectOne(Long id) {
        return this.sysRoleMenuService.queryById(id);
    }

}