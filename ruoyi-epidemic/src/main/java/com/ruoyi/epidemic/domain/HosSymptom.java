package com.ruoyi.epidemic.domain;

import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 异样报告对象 hos_symptom
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public class HosSymptom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 症状 */
    @Excel(name = "症状")
    private String symptom;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateStart;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateEnd;

    /** 人员编号 */
    @Excel(name = "人员编号")
    private String perCode;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSymptom(String symptom)
    {
        this.symptom = symptom;
    }

    public String getSymptom() 
    {
        return symptom;
    }
    public void setDateStart(Date dateStart) 
    {
        this.dateStart = dateStart;
    }

    public Date getDateStart() 
    {
        return dateStart;
    }
    public void setDateEnd(Date dateEnd) 
    {
        this.dateEnd = dateEnd;
    }

    public Date getDateEnd() 
    {
        return dateEnd;
    }
    public void setPerCode(String perCode) 
    {
        this.perCode = perCode;
    }

    public String getPerCode() 
    {
        return perCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("symptom", getSymptom())
            .append("dateStart", getDateStart())
            .append("dateEnd", getDateEnd())
            .append("perCode", getPerCode())
            .toString();
    }
}
