package com.ruoyi.epidemic.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 行动轨迹对象 hos_move_trajectory
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public class HosMoveTrajectory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 人员编号 */
    @Excel(name = "人员编号")
    private String perCode;

    /** 移动开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "移动开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date moveDateStart;

    /** 移动结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "移动结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date moveDateEnd;

    /** 轨迹编号用于关联地点表 */
    @Excel(name = "轨迹编号用于关联地点表")
    private String moveCode;

    @Excel(name = "轨迹编号用于关联地点表")
    private String moveName;

    public String getMoveName() {
        return moveName;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPerCode(String perCode) 
    {
        this.perCode = perCode;
    }

    public String getPerCode() 
    {
        return perCode;
    }
    public void setMoveDateStart(Date moveDateStart) 
    {
        this.moveDateStart = moveDateStart;
    }

    public Date getMoveDateStart() 
    {
        return moveDateStart;
    }
    public void setMoveDateEnd(Date moveDateEnd) 
    {
        this.moveDateEnd = moveDateEnd;
    }

    public Date getMoveDateEnd() 
    {
        return moveDateEnd;
    }
    public void setMoveCode(String moveCode) 
    {
        this.moveCode = moveCode;
    }

    public String getMoveCode() 
    {
        return moveCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("perCode", getPerCode())
            .append("moveDateStart", getMoveDateStart())
            .append("moveDateEnd", getMoveDateEnd())
            .append("moveCode", getMoveCode())
            .toString();
    }
}
