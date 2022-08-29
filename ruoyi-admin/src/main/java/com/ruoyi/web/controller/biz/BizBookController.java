package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.BizBook;
import com.ruoyi.biz.service.IBizBookService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 书籍信息Controller
 * 
 * @author liumh
 * @date 2022-08-28
 */
@RestController
@RequestMapping("/biz/book")
public class BizBookController extends BaseController
{
    @Autowired
    private IBizBookService bizBookService;

    /**
     * 查询书籍信息列表
     */
    @PreAuthorize("@ss.hasPermi('biz:book:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizBook bizBook)
    {
        startPage();
        List<BizBook> list = bizBookService.selectBizBookList(bizBook);
        return getDataTable(list);
    }

    /**
     * 导出书籍信息列表
     */
    @PreAuthorize("@ss.hasPermi('biz:book:export')")
    @Log(title = "书籍信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizBook bizBook)
    {
        List<BizBook> list = bizBookService.selectBizBookList(bizBook);
        ExcelUtil<BizBook> util = new ExcelUtil<BizBook>(BizBook.class);
        util.exportExcel(response, list, "书籍信息数据");
    }

    /**
     * 获取书籍信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('biz:book:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bizBookService.selectBizBookById(id));
    }

    /**
     * 新增书籍信息
     */
    @PreAuthorize("@ss.hasPermi('biz:book:add')")
    @Log(title = "书籍信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizBook bizBook)
    {
        return toAjax(bizBookService.insertBizBook(bizBook));
    }

    /**
     * 修改书籍信息
     */
    @PreAuthorize("@ss.hasPermi('biz:book:edit')")
    @Log(title = "书籍信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizBook bizBook)
    {
        return toAjax(bizBookService.updateBizBook(bizBook));
    }

    /**
     * 删除书籍信息
     */
    @PreAuthorize("@ss.hasPermi('biz:book:remove')")
    @Log(title = "书籍信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bizBookService.deleteBizBookByIds(ids));
    }
}
