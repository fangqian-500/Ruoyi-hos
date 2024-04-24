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
import com.ruoyi.epidemic.domain.HosMoveTrajectory;
import com.ruoyi.epidemic.service.IHosMoveTrajectoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 行动轨迹Controller
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
@RestController
@RequestMapping("/epidemic/trajectory")
public class HosMoveTrajectoryController extends BaseController
{
    @Autowired
    private IHosMoveTrajectoryService hosMoveTrajectoryService;

    /**
     * 查询行动轨迹列表
     */
    @PreAuthorize("@ss.hasPermi('epidemic:trajectory:list')")
    @GetMapping("/list")
    public TableDataInfo list(HosMoveTrajectory hosMoveTrajectory)
    {
        startPage();
        List<HosMoveTrajectory> list = hosMoveTrajectoryService.selectHosMoveTrajectoryList(hosMoveTrajectory);
        return getDataTable(list);
    }

    /**
     * 导出行动轨迹列表
     */
    @PreAuthorize("@ss.hasPermi('epidemic:trajectory:export')")
    @Log(title = "行动轨迹", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HosMoveTrajectory hosMoveTrajectory)
    {
        List<HosMoveTrajectory> list = hosMoveTrajectoryService.selectHosMoveTrajectoryList(hosMoveTrajectory);
        ExcelUtil<HosMoveTrajectory> util = new ExcelUtil<HosMoveTrajectory>(HosMoveTrajectory.class);
        util.exportExcel(response, list, "行动轨迹数据");
    }

    /**
     * 获取行动轨迹详细信息
     */
    @PreAuthorize("@ss.hasPermi('epidemic:trajectory:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(hosMoveTrajectoryService.selectHosMoveTrajectoryById(id));
    }

    /**
     * 新增行动轨迹
     */
    @PreAuthorize("@ss.hasPermi('epidemic:trajectory:add')")
    @Log(title = "行动轨迹", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HosMoveTrajectory hosMoveTrajectory)
    {
        return toAjax(hosMoveTrajectoryService.insertHosMoveTrajectory(hosMoveTrajectory));
    }

    /**
     * 修改行动轨迹
     */
    @PreAuthorize("@ss.hasPermi('epidemic:trajectory:edit')")
    @Log(title = "行动轨迹", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HosMoveTrajectory hosMoveTrajectory)
    {
        return toAjax(hosMoveTrajectoryService.updateHosMoveTrajectory(hosMoveTrajectory));
    }

    /**
     * 删除行动轨迹
     */
    @PreAuthorize("@ss.hasPermi('epidemic:trajectory:remove')")
    @Log(title = "行动轨迹", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hosMoveTrajectoryService.deleteHosMoveTrajectoryByIds(ids));
    }
}
