package com.suood.service;

import com.baomidou.mybatisplus.service.IService;
import com.suood.commons.utils.PageInfo;
import com.suood.model.SysLog;

/**
 *
 * SysLog 表数据服务层接口
 *
 */
public interface ISysLogService extends IService<SysLog> {

    void selectDataGrid(PageInfo pageInfo);

}