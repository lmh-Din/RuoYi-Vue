package com.ruoyi.biz.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.biz.mapper.BizBookContentMapper;
import com.ruoyi.biz.domain.BizBookContent;
import com.ruoyi.biz.service.IBizBookContentService;

/**
 * 图书内容管理Service业务层处理
 * 
 * @author liumh
 * @date 2022-08-28
 */
@Service
public class BizBookContentServiceImpl implements IBizBookContentService 
{
    @Autowired
    private BizBookContentMapper bizBookContentMapper;

    /**
     * 查询图书内容管理
     * 
     * @param id 图书内容管理主键
     * @return 图书内容管理
     */
    @Override
    public BizBookContent selectBizBookContentById(Long id)
    {
        return bizBookContentMapper.selectBizBookContentById(id);
    }

    /**
     * 查询图书内容管理列表
     * 
     * @param bizBookContent 图书内容管理
     * @return 图书内容管理
     */
    @Override
    public List<BizBookContent> selectBizBookContentList(BizBookContent bizBookContent)
    {
        return bizBookContentMapper.selectBizBookContentList(bizBookContent);
    }

    /**
     * 新增图书内容管理
     * 
     * @param bizBookContent 图书内容管理
     * @return 结果
     */
    @Override
    public int insertBizBookContent(BizBookContent bizBookContent)
    {
        bizBookContent.setCreateTime(DateUtils.getNowDate());
        return bizBookContentMapper.insertBizBookContent(bizBookContent);
    }

    /**
     * 修改图书内容管理
     * 
     * @param bizBookContent 图书内容管理
     * @return 结果
     */
    @Override
    public int updateBizBookContent(BizBookContent bizBookContent)
    {
        bizBookContent.setUpdateTime(DateUtils.getNowDate());
        return bizBookContentMapper.updateBizBookContent(bizBookContent);
    }

    /**
     * 批量删除图书内容管理
     * 
     * @param ids 需要删除的图书内容管理主键
     * @return 结果
     */
    @Override
    public int deleteBizBookContentByIds(Long[] ids)
    {
        return bizBookContentMapper.deleteBizBookContentByIds(ids);
    }

    /**
     * 删除图书内容管理信息
     * 
     * @param id 图书内容管理主键
     * @return 结果
     */
    @Override
    public int deleteBizBookContentById(Long id)
    {
        return bizBookContentMapper.deleteBizBookContentById(id);
    }
}
