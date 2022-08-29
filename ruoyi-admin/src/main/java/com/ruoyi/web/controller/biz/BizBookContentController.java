package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.BizBookContent;
import com.ruoyi.biz.service.IBizBookContentService;
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
 * 图书内容管理Controller
 * 
 * @author liumh
 * @date 2022-08-28
 */
@RestController
@RequestMapping("/biz/content")
public class BizBookContentController extends BaseController
{
    @Autowired
    private IBizBookContentService bizBookContentService;

    /**
     * 查询图书内容管理列表
     */
    @PreAuthorize("@ss.hasPermi('biz:content:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizBookContent bizBookContent)
    {
        startPage();
        List<BizBookContent> list = bizBookContentService.selectBizBookContentList(bizBookContent);
        return getDataTable(list);
    }

    /**
     * 导出图书内容管理列表
     */
    @PreAuthorize("@ss.hasPermi('biz:content:export')")
    @Log(title = "图书内容管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizBookContent bizBookContent)
    {
        List<BizBookContent> list = bizBookContentService.selectBizBookContentList(bizBookContent);
        ExcelUtil<BizBookContent> util = new ExcelUtil<BizBookContent>(BizBookContent.class);
        util.exportExcel(response, list, "图书内容管理数据");
    }

    /**
     * 获取图书内容管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('biz:content:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bizBookContentService.selectBizBookContentById(id));
    }

    /**
     * 新增图书内容管理
     */
    @PreAuthorize("@ss.hasPermi('biz:content:add')")
    @Log(title = "图书内容管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizBookContent bizBookContent)
    {
        return toAjax(bizBookContentService.insertBizBookContent(bizBookContent));
    }

    /**
     * 修改图书内容管理
     */
    @PreAuthorize("@ss.hasPermi('biz:content:edit')")
    @Log(title = "图书内容管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizBookContent bizBookContent)
    {
        return toAjax(bizBookContentService.updateBizBookContent(bizBookContent));
    }

    /**
     * 删除图书内容管理
     */
    @PreAuthorize("@ss.hasPermi('biz:content:remove')")
    @Log(title = "图书内容管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bizBookContentService.deleteBizBookContentByIds(ids));
    }
}
