package com.fans.admin.controller;

import com.fans.admin.entity.SysRoleDept;
import com.fans.admin.service.SysRoleDeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色机构(SysRoleDept)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:43:12
 */
@RestController
@RequestMapping("sysRoleDept")
public class SysRoleDeptController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleDeptService sysRoleDeptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRoleDept selectOne(Long id) {
        return this.sysRoleDeptService.queryById(id);
    }

}