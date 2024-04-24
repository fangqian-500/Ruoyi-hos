package com.ruoyi.epidemic.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.DictUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.epidemic.mapper.HosSymptomMapper;
import com.ruoyi.epidemic.domain.HosSymptom;
import com.ruoyi.epidemic.service.IHosSymptomService;

/**
 * 异样报告Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
@Service
public class HosSymptomServiceImpl implements IHosSymptomService 
{
    @Autowired
    private HosSymptomMapper hosSymptomMapper;


    /**
     * 查询异样报告
     * 
     * @param id 异样报告主键
     * @return 异样报告
     */
    @Override
    public HosSymptom selectHosSymptomById(Long id)
    {
        return hosSymptomMapper.selectHosSymptomById(id);
    }

    /**
     * 查询异样报告列表
     * 
     * @param hosSymptom 异样报告
     * @return 异样报告
     */
    @Override
    public List<HosSymptom> selectHosSymptomList(HosSymptom hosSymptom)
    {
        List<SysDictData> hos_symptom = DictUtils.getDictCache("hos_symptom");
        Map<String, String> collect = hos_symptom.stream()
                .collect(Collectors.toMap(SysDictData::getDictValue, SysDictData::getDictLabel));
        List<HosSymptom> hosSymptoms = hosSymptomMapper.selectHosSymptomList(hosSymptom);
        List<HosSymptom> result = matchAndJoin(collect, hosSymptoms);
        return result;
    }

    public static List<HosSymptom> matchAndJoin(Map<String, String> map, List<HosSymptom> list) {
        // 创建一个用于存储匹配到的值的列表
        List<String> matchedValues = new ArrayList<>();

        // 将匹配到的值列表转换为逗号拼接的字符串
        if (list!=null&&list.size()>0){
            list.stream().forEach(e->{
                String[] split = e.getSymptom().split(",");
                Arrays.stream(split).forEach(j->{
                    if (map.containsKey(j)){
                        matchedValues.add(map.get(j));
                    }
                });
                e.setSymptom(String.join(",", matchedValues));
                matchedValues.clear();

            });
        }

        return list;
    }

    /**
     * 新增异样报告
     * 
     * @param hosSymptom 异样报告
     * @return 结果
     */
    @Override
    public int insertHosSymptom(HosSymptom hosSymptom)
    {
        return hosSymptomMapper.insertHosSymptom(hosSymptom);
    }

    /**
     * 修改异样报告
     * 
     * @param hosSymptom 异样报告
     * @return 结果
     */
    @Override
    public int updateHosSymptom(HosSymptom hosSymptom)
    {
        return hosSymptomMapper.updateHosSymptom(hosSymptom);
    }

    /**
     * 批量删除异样报告
     * 
     * @param ids 需要删除的异样报告主键
     * @return 结果
     */
    @Override
    public int deleteHosSymptomByIds(Long[] ids)
    {
        return hosSymptomMapper.deleteHosSymptomByIds(ids);
    }

    /**
     * 删除异样报告信息
     * 
     * @param id 异样报告主键
     * @return 结果
     */
    @Override
    public int deleteHosSymptomById(Long id)
    {
        return hosSymptomMapper.deleteHosSymptomById(id);
    }
}
