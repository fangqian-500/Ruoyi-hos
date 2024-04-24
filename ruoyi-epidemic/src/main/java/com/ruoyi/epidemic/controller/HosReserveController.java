package com.ruoyi.epidemic.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.epidemic.domain.HosReserve;
import com.ruoyi.epidemic.service.IHosReserveService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预约管理Controller
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
@RestController
@RequestMapping("/epidemic/reserve")
public class HosReserveController extends BaseController
{
    @Autowired
    private IHosReserveService hosReserveService;

    /**
     * 查询预约管理列表
     */
    @PreAuthorize("@ss.hasPermi('epidemic:reserve:list')")
    @GetMapping("/list")
    public TableDataInfo list(HosReserve hosReserve)
    {
        startPage();
        List<HosReserve> list = hosReserveService.selectHosReserveList(hosReserve);
        return getDataTable(list);
    }

    /**
     * 导出预约管理列表
     */
    @PreAuthorize("@ss.hasPermi('epidemic:reserve:export')")
    @Log(title = "预约管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HosReserve hosReserve)
    {
        List<HosReserve> list = hosReserveService.selectHosReserveList(hosReserve);
        ExcelUtil<HosReserve> util = new ExcelUtil<HosReserve>(HosReserve.class);
        util.exportExcel(response, list, "预约管理数据");
    }

    /**
     * 获取预约管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('epidemic:reserve:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(hosReserveService.selectHosReserveById(id));
    }

    /**
     * 新增预约管理
     */
    @PreAuthorize("@ss.hasPermi('epidemic:reserve:add')")
    @Log(title = "预约管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HosReserve hosReserve)
    {
        return toAjax(hosReserveService.insertHosReserve(hosReserve));
    }

    /**
     * 修改预约管理
     */
    @PreAuthorize("@ss.hasPermi('epidemic:reserve:edit')")
    @Log(title = "预约管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HosReserve hosReserve)
    {
        return toAjax(hosReserveService.updateHosReserve(hosReserve));
    }

    /**
     * 删除预约管理
     */
    @PreAuthorize("@ss.hasPermi('epidemic:reserve:remove')")
    @Log(title = "预约管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hosReserveService.deleteHosReserveByIds(ids));
    }
}
