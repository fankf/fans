package com.fans.admin.dao;

import com.fans.admin.entity.SysLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统操作日志(SysLog)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-20 22:42:43
 */
public interface SysLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysLog queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysLog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysLog 实例对象
     * @return 对象列表
     */
    List<SysLog> queryAll(SysLog sysLog);

    /**
     * 新增数据
     *
     * @param sysLog 实例对象
     * @return 影响行数
     */
    int insert(SysLog sysLog);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysLog> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysLog> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysLog> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SysLog> entities);

    /**
     * 修改数据
     *
     * @param sysLog 实例对象
     * @return 影响行数
     */
    int update(SysLog sysLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}