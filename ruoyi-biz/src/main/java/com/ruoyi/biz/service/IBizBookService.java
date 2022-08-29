package com.ruoyi.biz.service;

import java.util.List;
import com.ruoyi.biz.domain.BizBook;

/**
 * 书籍信息Service接口
 * 
 * @author liumh
 * @date 2022-08-28
 */
public interface IBizBookService 
{
    /**
     * 查询书籍信息
     * 
     * @param id 书籍信息主键
     * @return 书籍信息
     */
    public BizBook selectBizBookById(Long id);

    /**
     * 查询书籍信息列表
     * 
     * @param bizBook 书籍信息
     * @return 书籍信息集合
     */
    public List<BizBook> selectBizBookList(BizBook bizBook);

    /**
     * 新增书籍信息
     * 
     * @param bizBook 书籍信息
     * @return 结果
     */
    public int insertBizBook(BizBook bizBook);

    /**
     * 修改书籍信息
     * 
     * @param bizBook 书籍信息
     * @return 结果
     */
    public int updateBizBook(BizBook bizBook);

    /**
     * 批量删除书籍信息
     * 
     * @param ids 需要删除的书籍信息主键集合
     * @return 结果
     */
    public int deleteBizBookByIds(Long[] ids);

    /**
     * 删除书籍信息信息
     * 
     * @param id 书籍信息主键
     * @return 结果
     */
    public int deleteBizBookById(Long id);
}
