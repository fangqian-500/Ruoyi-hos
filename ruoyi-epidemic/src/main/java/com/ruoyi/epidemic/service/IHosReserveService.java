package com.ruoyi.epidemic.service;

import java.util.List;
import com.ruoyi.epidemic.domain.HosReserve;

/**
 * 预约管理Service接口
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public interface IHosReserveService 
{
    /**
     * 查询预约管理
     * 
     * @param id 预约管理主键
     * @return 预约管理
     */
    public HosReserve selectHosReserveById(Long id);

    /**
     * 查询预约管理列表
     * 
     * @param hosReserve 预约管理
     * @return 预约管理集合
     */
    public List<HosReserve> selectHosReserveList(HosReserve hosReserve);

    /**
     * 新增预约管理
     * 
     * @param hosReserve 预约管理
     * @return 结果
     */
    public int insertHosReserve(HosReserve hosReserve);

    /**
     * 修改预约管理
     * 
     * @param hosReserve 预约管理
     * @return 结果
     */
    public int updateHosReserve(HosReserve hosReserve);

    /**
     * 批量删除预约管理
     * 
     * @param ids 需要删除的预约管理主键集合
     * @return 结果
     */
    public int deleteHosReserveByIds(Long[] ids);

    /**
     * 删除预约管理信息
     * 
     * @param id 预约管理主键
     * @return 结果
     */
    public int deleteHosReserveById(Long id);
}
