package com.fans.admin.dao;

import com.fans.admin.entity.SysLoginLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统登录日志(SysLoginLog)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-20 22:42:50
 */
public interface SysLoginLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysLoginLog queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysLoginLog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysLoginLog 实例对象
     * @return 对象列表
     */
    List<SysLoginLog> queryAll(SysLoginLog sysLoginLog);

    /**
     * 新增数据
     *
     * @param sysLoginLog 实例对象
     * @return 影响行数
     */
    int insert(SysLoginLog sysLoginLog);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysLoginLog> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysLoginLog> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysLoginLog> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SysLoginLog> entities);

    /**
     * 修改数据
     *
     * @param sysLoginLog 实例对象
     * @return 影响行数
     */
    int update(SysLoginLog sysLoginLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}