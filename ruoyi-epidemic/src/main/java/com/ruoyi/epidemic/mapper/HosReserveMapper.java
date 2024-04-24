package com.ruoyi.epidemic.mapper;

import java.util.List;
import com.ruoyi.epidemic.domain.HosReserve;

/**
 * 预约管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public interface HosReserveMapper 
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
     * 删除预约管理
     * 
     * @param id 预约管理主键
     * @return 结果
     */
    public int deleteHosReserveById(Long id);

    /**
     * 批量删除预约管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHosReserveByIds(Long[] ids);
}
