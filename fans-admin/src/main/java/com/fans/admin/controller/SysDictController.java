package com.fans.admin.controller;

import com.fans.admin.entity.SysDict;
import com.fans.admin.service.SysDictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 字典表(SysDict)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:42:40
 */
@RestController
@RequestMapping("sysDict")
public class SysDictController {
    /**
     * 服务对象
     */
    @Resource
    private SysDictService sysDictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDict selectOne(Long id) {
        return this.sysDictService.queryById(id);
    }

}