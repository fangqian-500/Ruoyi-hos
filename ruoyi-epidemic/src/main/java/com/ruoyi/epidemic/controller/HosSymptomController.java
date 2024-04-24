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
import com.ruoyi.epidemic.domain.HosSymptom;
import com.ruoyi.epidemic.service.IHosSymptomService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 异样报告Controller
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
@RestController
@RequestMapping("/epidemic/symptom")
public class HosSymptomController extends BaseController
{
    @Autowired
    private IHosSymptomService hosSymptomService;

    /**
     * 查询异样报告列表
     */
    @PreAuthorize("@ss.hasPermi('epidemic:symptom:list')")
    @GetMapping("/list")
    public TableDataInfo list(HosSymptom hosSymptom)
    {
        startPage();
        List<HosSymptom> list = hosSymptomService.selectHosSymptomList(hosSymptom);
        return getDataTable(list);
    }

    /**
     * 导出异样报告列表
     */
    @PreAuthorize("@ss.hasPermi('epidemic:symptom:export')")
    @Log(title = "异样报告", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HosSymptom hosSymptom)
    {
        List<HosSymptom> list = hosSymptomService.selectHosSymptomList(hosSymptom);
        ExcelUtil<HosSymptom> util = new ExcelUtil<HosSymptom>(HosSymptom.class);
        util.exportExcel(response, list, "异样报告数据");
    }

    /**
     * 获取异样报告详细信息
     */
    @PreAuthorize("@ss.hasPermi('epidemic:symptom:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(hosSymptomService.selectHosSymptomById(id));
    }

    /**
     * 新增异样报告
     */
    @PreAuthorize("@ss.hasPermi('epidemic:symptom:add')")
    @Log(title = "异样报告", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HosSymptom hosSymptom)
    {
        return toAjax(hosSymptomService.insertHosSymptom(hosSymptom));
    }

    /**
     * 修改异样报告
     */
    @PreAuthorize("@ss.hasPermi('epidemic:symptom:edit')")
    @Log(title = "异样报告", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HosSymptom hosSymptom)
    {
        return toAjax(hosSymptomService.updateHosSymptom(hosSymptom));
    }

    /**
     * 删除异样报告
     */
    @PreAuthorize("@ss.hasPermi('epidemic:symptom:remove')")
    @Log(title = "异样报告", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hosSymptomService.deleteHosSymptomByIds(ids));
    }
}
