package com.fans.admin.controller;

import com.fans.admin.entity.SysMenu;
import com.fans.admin.service.SysMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 菜单管理(SysMenu)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:43:00
 */
@RestController
@RequestMapping("sysMenu")
public class SysMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysMenuService sysMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysMenu selectOne(Long id) {
        return this.sysMenuService.queryById(id);
    }

}