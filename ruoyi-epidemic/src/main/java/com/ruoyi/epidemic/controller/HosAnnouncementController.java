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
import com.ruoyi.epidemic.domain.HosAnnouncement;
import com.ruoyi.epidemic.service.IHosAnnouncementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公告管理Controller
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
@RestController
@RequestMapping("/epidemic/announcement")
public class HosAnnouncementController extends BaseController
{
    @Autowired
    private IHosAnnouncementService hosAnnouncementService;

    /**
     * 查询公告管理列表
     */
    @PreAuthorize("@ss.hasPermi('epidemic:announcement:list')")
    @GetMapping("/list")
    public TableDataInfo list(HosAnnouncement hosAnnouncement)
    {
        startPage();
        List<HosAnnouncement> list = hosAnnouncementService.selectHosAnnouncementList(hosAnnouncement);
        return getDataTable(list);
    }

    /**
     * 导出公告管理列表
     */
    @PreAuthorize("@ss.hasPermi('epidemic:announcement:export')")
    @Log(title = "公告管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HosAnnouncement hosAnnouncement)
    {
        List<HosAnnouncement> list = hosAnnouncementService.selectHosAnnouncementList(hosAnnouncement);
        ExcelUtil<HosAnnouncement> util = new ExcelUtil<HosAnnouncement>(HosAnnouncement.class);
        util.exportExcel(response, list, "公告管理数据");
    }

    /**
     * 获取公告管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('epidemic:announcement:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(hosAnnouncementService.selectHosAnnouncementById(id));
    }

    /**
     * 新增公告管理
     */
    @PreAuthorize("@ss.hasPermi('epidemic:announcement:add')")
    @Log(title = "公告管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HosAnnouncement hosAnnouncement)
    {
        return toAjax(hosAnnouncementService.insertHosAnnouncement(hosAnnouncement));
    }

    /**
     * 修改公告管理
     */
    @PreAuthorize("@ss.hasPermi('epidemic:announcement:edit')")
    @Log(title = "公告管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HosAnnouncement hosAnnouncement)
    {
        return toAjax(hosAnnouncementService.updateHosAnnouncement(hosAnnouncement));
    }

    /**
     * 删除公告管理
     */
    @PreAuthorize("@ss.hasPermi('epidemic:announcement:remove')")
    @Log(title = "公告管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hosAnnouncementService.deleteHosAnnouncementByIds(ids));
    }
}
