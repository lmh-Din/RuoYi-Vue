package com.ruoyi.biz.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.biz.mapper.BizBookMapper;
import com.ruoyi.biz.domain.BizBook;
import com.ruoyi.biz.service.IBizBookService;

/**
 * 书籍信息Service业务层处理
 * 
 * @author liumh
 * @date 2022-08-28
 */
@Service
public class BizBookServiceImpl implements IBizBookService 
{
    @Autowired
    private BizBookMapper bizBookMapper;

    /**
     * 查询书籍信息
     * 
     * @param id 书籍信息主键
     * @return 书籍信息
     */
    @Override
    public BizBook selectBizBookById(Long id)
    {
        return bizBookMapper.selectBizBookById(id);
    }

    /**
     * 查询书籍信息列表
     * 
     * @param bizBook 书籍信息
     * @return 书籍信息
     */
    @Override
    public List<BizBook> selectBizBookList(BizBook bizBook)
    {
        return bizBookMapper.selectBizBookList(bizBook);
    }

    /**
     * 新增书籍信息
     * 
     * @param bizBook 书籍信息
     * @return 结果
     */
    @Override
    public int insertBizBook(BizBook bizBook)
    {
        bizBook.setCreateTime(DateUtils.getNowDate());
        return bizBookMapper.insertBizBook(bizBook);
    }

    /**
     * 修改书籍信息
     * 
     * @param bizBook 书籍信息
     * @return 结果
     */
    @Override
    public int updateBizBook(BizBook bizBook)
    {
        bizBook.setUpdateTime(DateUtils.getNowDate());
        return bizBookMapper.updateBizBook(bizBook);
    }

    /**
     * 批量删除书籍信息
     * 
     * @param ids 需要删除的书籍信息主键
     * @return 结果
     */
    @Override
    public int deleteBizBookByIds(Long[] ids)
    {
        return bizBookMapper.deleteBizBookByIds(ids);
    }

    /**
     * 删除书籍信息信息
     * 
     * @param id 书籍信息主键
     * @return 结果
     */
    @Override
    public int deleteBizBookById(Long id)
    {
        return bizBookMapper.deleteBizBookById(id);
    }
}
