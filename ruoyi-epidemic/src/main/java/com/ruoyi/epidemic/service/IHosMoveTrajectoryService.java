package com.ruoyi.epidemic.service;

import java.util.List;
import com.ruoyi.epidemic.domain.HosMoveTrajectory;

/**
 * 行动轨迹Service接口
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public interface IHosMoveTrajectoryService 
{
    /**
     * 查询行动轨迹
     * 
     * @param id 行动轨迹主键
     * @return 行动轨迹
     */
    public HosMoveTrajectory selectHosMoveTrajectoryById(Long id);

    /**
     * 查询行动轨迹列表
     * 
     * @param hosMoveTrajectory 行动轨迹
     * @return 行动轨迹集合
     */
    public List<HosMoveTrajectory> selectHosMoveTrajectoryList(HosMoveTrajectory hosMoveTrajectory);

    /**
     * 新增行动轨迹
     * 
     * @param hosMoveTrajectory 行动轨迹
     * @return 结果
     */
    public int insertHosMoveTrajectory(HosMoveTrajectory hosMoveTrajectory);

    /**
     * 修改行动轨迹
     * 
     * @param hosMoveTrajectory 行动轨迹
     * @return 结果
     */
    public int updateHosMoveTrajectory(HosMoveTrajectory hosMoveTrajectory);

    /**
     * 批量删除行动轨迹
     * 
     * @param ids 需要删除的行动轨迹主键集合
     * @return 结果
     */
    public int deleteHosMoveTrajectoryByIds(Long[] ids);

    /**
     * 删除行动轨迹信息
     * 
     * @param id 行动轨迹主键
     * @return 结果
     */
    public int deleteHosMoveTrajectoryById(Long id);
}
