package com.suood.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.suood.commons.result.Tree;
import com.suood.model.Organization;

/**
 *
 * Organization 表数据服务层接口
 *
 */
public interface IOrganizationService extends IService<Organization> {

    List<Tree> selectTree();

    List<Organization> selectTreeGrid();

}