package com.fans.admin.controller;

import com.fans.admin.entity.SysConfig;
import com.fans.admin.service.SysConfigService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统配置表(SysConfig)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:37:24
 */
@RestController
@RequestMapping("sysConfig")
public class SysConfigController {
    /**
     * 服务对象
     */
    @Resource
    private SysConfigService sysConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    @ApiOperation(value = "SysConfig",notes = "系统配置查询",httpMethod = "GET")
    public SysConfig selectOne(@PathVariable Long id) {
        return this.sysConfigService.queryById(id);
    }

}