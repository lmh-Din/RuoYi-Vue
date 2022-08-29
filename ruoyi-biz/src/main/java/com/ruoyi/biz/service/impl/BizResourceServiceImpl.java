package com.ruoyi.biz.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.biz.mapper.BizResourceMapper;
import com.ruoyi.biz.domain.BizResource;
import com.ruoyi.biz.service.IBizResourceService;

/**
 * 资源管理Service业务层处理
 * 
 * @author liumh
 * @date 2022-08-28
 */
@Service
public class BizResourceServiceImpl implements IBizResourceService 
{
    @Autowired
    private BizResourceMapper bizResourceMapper;

    /**
     * 查询资源管理
     * 
     * @param id 资源管理主键
     * @return 资源管理
     */
    @Override
    public BizResource selectBizResourceById(Long id)
    {
        return bizResourceMapper.selectBizResourceById(id);
    }

    /**
     * 查询资源管理列表
     * 
     * @param bizResource 资源管理
     * @return 资源管理
     */
    @Override
    public List<BizResource> selectBizResourceList(BizResource bizResource)
    {
        return bizResourceMapper.selectBizResourceList(bizResource);
    }

    /**
     * 新增资源管理
     * 
     * @param bizResource 资源管理
     * @return 结果
     */
    @Override
    public int insertBizResource(BizResource bizResource)
    {
        bizResource.setCreateTime(DateUtils.getNowDate());
        return bizResourceMapper.insertBizResource(bizResource);
    }

    /**
     * 修改资源管理
     * 
     * @param bizResource 资源管理
     * @return 结果
     */
    @Override
    public int updateBizResource(BizResource bizResource)
    {
        bizResource.setUpdateTime(DateUtils.getNowDate());
        return bizResourceMapper.updateBizResource(bizResource);
    }

    /**
     * 批量删除资源管理
     * 
     * @param ids 需要删除的资源管理主键
     * @return 结果
     */
    @Override
    public int deleteBizResourceByIds(Long[] ids)
    {
        return bizResourceMapper.deleteBizResourceByIds(ids);
    }

    /**
     * 删除资源管理信息
     * 
     * @param id 资源管理主键
     * @return 结果
     */
    @Override
    public int deleteBizResourceById(Long id)
    {
        return bizResourceMapper.deleteBizResourceById(id);
    }
}
