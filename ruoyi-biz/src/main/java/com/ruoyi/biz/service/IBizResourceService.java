package com.ruoyi.biz.service;

import java.util.List;
import com.ruoyi.biz.domain.BizResource;

/**
 * 资源管理Service接口
 * 
 * @author liumh
 * @date 2022-08-28
 */
public interface IBizResourceService 
{
    /**
     * 查询资源管理
     * 
     * @param id 资源管理主键
     * @return 资源管理
     */
    public BizResource selectBizResourceById(Long id);

    /**
     * 查询资源管理列表
     * 
     * @param bizResource 资源管理
     * @return 资源管理集合
     */
    public List<BizResource> selectBizResourceList(BizResource bizResource);

    /**
     * 新增资源管理
     * 
     * @param bizResource 资源管理
     * @return 结果
     */
    public int insertBizResource(BizResource bizResource);

    /**
     * 修改资源管理
     * 
     * @param bizResource 资源管理
     * @return 结果
     */
    public int updateBizResource(BizResource bizResource);

    /**
     * 批量删除资源管理
     * 
     * @param ids 需要删除的资源管理主键集合
     * @return 结果
     */
    public int deleteBizResourceByIds(Long[] ids);

    /**
     * 删除资源管理信息
     * 
     * @param id 资源管理主键
     * @return 结果
     */
    public int deleteBizResourceById(Long id);
}
