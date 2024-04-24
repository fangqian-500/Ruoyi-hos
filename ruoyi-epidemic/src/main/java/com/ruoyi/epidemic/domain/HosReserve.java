package com.ruoyi.epidemic.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预约管理对象 hos_reserve
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public class HosReserve extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 人员编号 */
    @Excel(name = "人员编号")
    private String perCode;

    /** 医生编号 */
    @Excel(name = "医生编号")
    private String doctor;

    /** 预约时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预约时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reserveTime;

    /** 部门编号 */
    @Excel(name = "部门编号")
    private String dept;

    @Excel(name = "部门名称")
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPerCode(String perCode) 
    {
        this.perCode = perCode;
    }

    public String getPerCode() 
    {
        return perCode;
    }
    public void setDoctor(String doctor) 
    {
        this.doctor = doctor;
    }

    public String getDoctor() 
    {
        return doctor;
    }
    public void setReserveTime(Date reserveTime) 
    {
        this.reserveTime = reserveTime;
    }

    public Date getReserveTime() 
    {
        return reserveTime;
    }
    public void setDept(String dept) 
    {
        this.dept = dept;
    }

    public String getDept() 
    {
        return dept;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("perCode", getPerCode())
            .append("doctor", getDoctor())
            .append("reserveTime", getReserveTime())
            .append("dept", getDept())
            .toString();
    }
}
