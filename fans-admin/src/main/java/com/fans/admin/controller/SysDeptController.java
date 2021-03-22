package com.fans.admin.controller;

import com.fans.admin.entity.SysDept;
import com.fans.admin.service.SysDeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 机构管理(SysDept)表控制层
 *
 * @author makejava
 * @since 2021-03-20 22:42:32
 */
@RestController
@RequestMapping("sysDept")
public class SysDeptController {
    /**
     * 服务对象
     */
    @Resource
    private SysDeptService sysDeptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDept selectOne(Long id) {
        return this.sysDeptService.queryById(id);
    }

}