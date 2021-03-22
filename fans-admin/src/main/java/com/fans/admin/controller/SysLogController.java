package com.fans.admin.controller;

import com.fans.admin.entity.SysLog;
import com.fans.admin.service.SysLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统操作日志(SysLog)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:42:47
 */
@RestController
@RequestMapping("sysLog")
public class SysLogController {
    /**
     * 服务对象
     */
    @Resource
    private SysLogService sysLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysLog selectOne(Long id) {
        return this.sysLogService.queryById(id);
    }

}