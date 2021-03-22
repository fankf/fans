package com.fans.admin.service;

import com.fans.admin.entity.SysLoginLog;

import java.util.List;

/**
 * 系统登录日志(SysLoginLog)表服务接口
 *
 * @author makejava
 * @since 2021-03-20 22:42:52
 */
public interface SysLoginLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysLoginLog queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysLoginLog> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysLoginLog 实例对象
     * @return 实例对象
     */
    SysLoginLog insert(SysLoginLog sysLoginLog);

    /**
     * 修改数据
     *
     * @param sysLoginLog 实例对象
     * @return 实例对象
     */
    SysLoginLog update(SysLoginLog sysLoginLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}