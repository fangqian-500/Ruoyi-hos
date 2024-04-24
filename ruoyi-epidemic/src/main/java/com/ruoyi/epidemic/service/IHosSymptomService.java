package com.ruoyi.epidemic.service;

import java.util.List;
import com.ruoyi.epidemic.domain.HosSymptom;

/**
 * 异样报告Service接口
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public interface IHosSymptomService 
{
    /**
     * 查询异样报告
     * 
     * @param id 异样报告主键
     * @return 异样报告
     */
    public HosSymptom selectHosSymptomById(Long id);

    /**
     * 查询异样报告列表
     * 
     * @param hosSymptom 异样报告
     * @return 异样报告集合
     */
    public List<HosSymptom> selectHosSymptomList(HosSymptom hosSymptom);

    /**
     * 新增异样报告
     * 
     * @param hosSymptom 异样报告
     * @return 结果
     */
    public int insertHosSymptom(HosSymptom hosSymptom);

    /**
     * 修改异样报告
     * 
     * @param hosSymptom 异样报告
     * @return 结果
     */
    public int updateHosSymptom(HosSymptom hosSymptom);

    /**
     * 批量删除异样报告
     * 
     * @param ids 需要删除的异样报告主键集合
     * @return 结果
     */
    public int deleteHosSymptomByIds(Long[] ids);

    /**
     * 删除异样报告信息
     * 
     * @param id 异样报告主键
     * @return 结果
     */
    public int deleteHosSymptomById(Long id);
}
