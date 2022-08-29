package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.BizResource;
import com.ruoyi.biz.service.IBizResourceService;
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
 * 资源管理Controller
 * 
 * @author liumh
 * @date 2022-08-28
 */
@RestController
@RequestMapping("/biz/resource")
public class BizResourceController extends BaseController
{
    @Autowired
    private IBizResourceService bizResourceService;

    /**
     * 查询资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('biz:resource:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizResource bizResource)
    {
        startPage();
        List<BizResource> list = bizResourceService.selectBizResourceList(bizResource);
        return getDataTable(list);
    }

    /**
     * 导出资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('biz:resource:export')")
    @Log(title = "资源管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizResource bizResource)
    {
        List<BizResource> list = bizResourceService.selectBizResourceList(bizResource);
        ExcelUtil<BizResource> util = new ExcelUtil<BizResource>(BizResource.class);
        util.exportExcel(response, list, "资源管理数据");
    }

    /**
     * 获取资源管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('biz:resource:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bizResourceService.selectBizResourceById(id));
    }

    /**
     * 新增资源管理
     */
    @PreAuthorize("@ss.hasPermi('biz:resource:add')")
    @Log(title = "资源管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizResource bizResource)
    {
        return toAjax(bizResourceService.insertBizResource(bizResource));
    }

    /**
     * 修改资源管理
     */
    @PreAuthorize("@ss.hasPermi('biz:resource:edit')")
    @Log(title = "资源管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizResource bizResource)
    {
        return toAjax(bizResourceService.updateBizResource(bizResource));
    }

    /**
     * 删除资源管理
     */
    @PreAuthorize("@ss.hasPermi('biz:resource:remove')")
    @Log(title = "资源管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bizResourceService.deleteBizResourceByIds(ids));
    }
}
