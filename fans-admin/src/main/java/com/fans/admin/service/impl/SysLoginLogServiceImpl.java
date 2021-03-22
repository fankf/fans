package com.fans.admin.service.impl;

import com.fans.admin.entity.SysLoginLog;
import com.fans.admin.dao.SysLoginLogDao;
import com.fans.admin.service.SysLoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统登录日志(SysLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2021-03-20 22:42:53
 */
@Service("sysLoginLogService")
public class SysLoginLogServiceImpl implements SysLoginLogService {
    @Resource
    private SysLoginLogDao sysLoginLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysLoginLog queryById(Long id) {
        return this.sysLoginLogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysLoginLog> queryAllByLimit(int offset, int limit) {
        return this.sysLoginLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public SysLoginLog insert(SysLoginLog sysLoginLog) {
        this.sysLoginLogDao.insert(sysLoginLog);
        return sysLoginLog;
    }

    /**
     * 修改数据
     *
     * @param sysLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public SysLoginLog update(SysLoginLog sysLoginLog) {
        this.sysLoginLogDao.update(sysLoginLog);
        return this.queryById(sysLoginLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysLoginLogDao.deleteById(id) > 0;
    }
}