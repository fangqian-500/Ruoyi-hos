package com.ruoyi.epidemic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.epidemic.mapper.HosMoveTrajectoryMapper;
import com.ruoyi.epidemic.domain.HosMoveTrajectory;
import com.ruoyi.epidemic.service.IHosMoveTrajectoryService;

/**
 * 行动轨迹Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
@Service
public class HosMoveTrajectoryServiceImpl implements IHosMoveTrajectoryService 
{
    @Autowired
    private HosMoveTrajectoryMapper hosMoveTrajectoryMapper;

    /**
     * 查询行动轨迹
     * 
     * @param id 行动轨迹主键
     * @return 行动轨迹
     */
    @Override
    public HosMoveTrajectory selectHosMoveTrajectoryById(Long id)
    {
        return hosMoveTrajectoryMapper.selectHosMoveTrajectoryById(id);
    }

    /**
     * 查询行动轨迹列表
     * 
     * @param hosMoveTrajectory 行动轨迹
     * @return 行动轨迹
     */
    @Override
    public List<HosMoveTrajectory> selectHosMoveTrajectoryList(HosMoveTrajectory hosMoveTrajectory)
    {
        return hosMoveTrajectoryMapper.selectHosMoveTrajectoryList(hosMoveTrajectory);
    }

    /**
     * 新增行动轨迹
     * 
     * @param hosMoveTrajectory 行动轨迹
     * @return 结果
     */
    @Override
    public int insertHosMoveTrajectory(HosMoveTrajectory hosMoveTrajectory)
    {
        return hosMoveTrajectoryMapper.insertHosMoveTrajectory(hosMoveTrajectory);
    }

    /**
     * 修改行动轨迹
     * 
     * @param hosMoveTrajectory 行动轨迹
     * @return 结果
     */
    @Override
    public int updateHosMoveTrajectory(HosMoveTrajectory hosMoveTrajectory)
    {
        return hosMoveTrajectoryMapper.updateHosMoveTrajectory(hosMoveTrajectory);
    }

    /**
     * 批量删除行动轨迹
     * 
     * @param ids 需要删除的行动轨迹主键
     * @return 结果
     */
    @Override
    public int deleteHosMoveTrajectoryByIds(Long[] ids)
    {
        return hosMoveTrajectoryMapper.deleteHosMoveTrajectoryByIds(ids);
    }

    /**
     * 删除行动轨迹信息
     * 
     * @param id 行动轨迹主键
     * @return 结果
     */
    @Override
    public int deleteHosMoveTrajectoryById(Long id)
    {
        return hosMoveTrajectoryMapper.deleteHosMoveTrajectoryById(id);
    }
}
