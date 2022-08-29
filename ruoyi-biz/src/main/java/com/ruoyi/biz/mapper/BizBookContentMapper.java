package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizBookContent;

/**
 * 图书内容管理Mapper接口
 * 
 * @author liumh
 * @date 2022-08-28
 */
public interface BizBookContentMapper 
{
    /**
     * 查询图书内容管理
     * 
     * @param id 图书内容管理主键
     * @return 图书内容管理
     */
    public BizBookContent selectBizBookContentById(Long id);

    /**
     * 查询图书内容管理列表
     * 
     * @param bizBookContent 图书内容管理
     * @return 图书内容管理集合
     */
    public List<BizBookContent> selectBizBookContentList(BizBookContent bizBookContent);

    /**
     * 新增图书内容管理
     * 
     * @param bizBookContent 图书内容管理
     * @return 结果
     */
    public int insertBizBookContent(BizBookContent bizBookContent);

    /**
     * 修改图书内容管理
     * 
     * @param bizBookContent 图书内容管理
     * @return 结果
     */
    public int updateBizBookContent(BizBookContent bizBookContent);

    /**
     * 删除图书内容管理
     * 
     * @param id 图书内容管理主键
     * @return 结果
     */
    public int deleteBizBookContentById(Long id);

    /**
     * 批量删除图书内容管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizBookContentByIds(Long[] ids);
}
