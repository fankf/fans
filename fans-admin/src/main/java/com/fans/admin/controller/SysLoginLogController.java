package com.fans.admin.controller;

import com.fans.admin.entity.SysLoginLog;
import com.fans.admin.service.SysLoginLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统登录日志(SysLoginLog)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:42:54
 */
@RestController
@RequestMapping("sysLoginLog")
public class SysLoginLogController {
    /**
     * 服务对象
     */
    @Resource
    private SysLoginLogService sysLoginLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysLoginLog selectOne(Long id) {
        return this.sysLoginLogService.queryById(id);
    }

}