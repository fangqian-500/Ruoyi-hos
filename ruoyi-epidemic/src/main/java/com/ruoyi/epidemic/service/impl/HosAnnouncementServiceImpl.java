package com.ruoyi.epidemic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.epidemic.mapper.HosAnnouncementMapper;
import com.ruoyi.epidemic.domain.HosAnnouncement;
import com.ruoyi.epidemic.service.IHosAnnouncementService;

/**
 * 公告管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
@Service
public class HosAnnouncementServiceImpl implements IHosAnnouncementService 
{
    @Autowired
    private HosAnnouncementMapper hosAnnouncementMapper;

    /**
     * 查询公告管理
     * 
     * @param id 公告管理主键
     * @return 公告管理
     */
    @Override
    public HosAnnouncement selectHosAnnouncementById(Long id)
    {
        return hosAnnouncementMapper.selectHosAnnouncementById(id);
    }

    /**
     * 查询公告管理列表
     * 
     * @param hosAnnouncement 公告管理
     * @return 公告管理
     */
    @Override
    public List<HosAnnouncement> selectHosAnnouncementList(HosAnnouncement hosAnnouncement)
    {
        return hosAnnouncementMapper.selectHosAnnouncementList(hosAnnouncement);
    }

    /**
     * 新增公告管理
     * 
     * @param hosAnnouncement 公告管理
     * @return 结果
     */
    @Override
    public int insertHosAnnouncement(HosAnnouncement hosAnnouncement)
    {
        return hosAnnouncementMapper.insertHosAnnouncement(hosAnnouncement);
    }

    /**
     * 修改公告管理
     * 
     * @param hosAnnouncement 公告管理
     * @return 结果
     */
    @Override
    public int updateHosAnnouncement(HosAnnouncement hosAnnouncement)
    {
        return hosAnnouncementMapper.updateHosAnnouncement(hosAnnouncement);
    }

    /**
     * 批量删除公告管理
     * 
     * @param ids 需要删除的公告管理主键
     * @return 结果
     */
    @Override
    public int deleteHosAnnouncementByIds(Long[] ids)
    {
        return hosAnnouncementMapper.deleteHosAnnouncementByIds(ids);
    }

    /**
     * 删除公告管理信息
     * 
     * @param id 公告管理主键
     * @return 结果
     */
    @Override
    public int deleteHosAnnouncementById(Long id)
    {
        return hosAnnouncementMapper.deleteHosAnnouncementById(id);
    }
}
