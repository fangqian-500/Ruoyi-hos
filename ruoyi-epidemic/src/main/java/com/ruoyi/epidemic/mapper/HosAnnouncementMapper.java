package com.ruoyi.epidemic.mapper;

import java.util.List;
import com.ruoyi.epidemic.domain.HosAnnouncement;

/**
 * 公告管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public interface HosAnnouncementMapper 
{
    /**
     * 查询公告管理
     * 
     * @param id 公告管理主键
     * @return 公告管理
     */
    public HosAnnouncement selectHosAnnouncementById(Long id);

    /**
     * 查询公告管理列表
     * 
     * @param hosAnnouncement 公告管理
     * @return 公告管理集合
     */
    public List<HosAnnouncement> selectHosAnnouncementList(HosAnnouncement hosAnnouncement);

    /**
     * 新增公告管理
     * 
     * @param hosAnnouncement 公告管理
     * @return 结果
     */
    public int insertHosAnnouncement(HosAnnouncement hosAnnouncement);

    /**
     * 修改公告管理
     * 
     * @param hosAnnouncement 公告管理
     * @return 结果
     */
    public int updateHosAnnouncement(HosAnnouncement hosAnnouncement);

    /**
     * 删除公告管理
     * 
     * @param id 公告管理主键
     * @return 结果
     */
    public int deleteHosAnnouncementById(Long id);

    /**
     * 批量删除公告管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHosAnnouncementByIds(Long[] ids);
}
