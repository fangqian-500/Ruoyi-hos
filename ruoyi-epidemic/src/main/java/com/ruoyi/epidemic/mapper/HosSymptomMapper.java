package com.ruoyi.epidemic.mapper;

import java.util.List;
import com.ruoyi.epidemic.domain.HosSymptom;

/**
 * 异样报告Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public interface HosSymptomMapper 
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
     * 删除异样报告
     * 
     * @param id 异样报告主键
     * @return 结果
     */
    public int deleteHosSymptomById(Long id);

    /**
     * 批量删除异样报告
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHosSymptomByIds(Long[] ids);
}
