package com.ruoyi.epidemic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.epidemic.mapper.HosReserveMapper;
import com.ruoyi.epidemic.domain.HosReserve;
import com.ruoyi.epidemic.service.IHosReserveService;

/**
 * 预约管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
@Service
public class HosReserveServiceImpl implements IHosReserveService 
{
    @Autowired
    private HosReserveMapper hosReserveMapper;

    /**
     * 查询预约管理
     * 
     * @param id 预约管理主键
     * @return 预约管理
     */
    @Override
    public HosReserve selectHosReserveById(Long id)
    {
        return hosReserveMapper.selectHosReserveById(id);
    }

    /**
     * 查询预约管理列表
     * 
     * @param hosReserve 预约管理
     * @return 预约管理
     */
    @Override
    public List<HosReserve> selectHosReserveList(HosReserve hosReserve)
    {
        return hosReserveMapper.selectHosReserveList(hosReserve);
    }

    /**
     * 新增预约管理
     * 
     * @param hosReserve 预约管理
     * @return 结果
     */
    @Override
    public int insertHosReserve(HosReserve hosReserve)
    {
        return hosReserveMapper.insertHosReserve(hosReserve);
    }

    /**
     * 修改预约管理
     * 
     * @param hosReserve 预约管理
     * @return 结果
     */
    @Override
    public int updateHosReserve(HosReserve hosReserve)
    {
        return hosReserveMapper.updateHosReserve(hosReserve);
    }

    /**
     * 批量删除预约管理
     * 
     * @param ids 需要删除的预约管理主键
     * @return 结果
     */
    @Override
    public int deleteHosReserveByIds(Long[] ids)
    {
        return hosReserveMapper.deleteHosReserveByIds(ids);
    }

    /**
     * 删除预约管理信息
     * 
     * @param id 预约管理主键
     * @return 结果
     */
    @Override
    public int deleteHosReserveById(Long id)
    {
        return hosReserveMapper.deleteHosReserveById(id);
    }
}
