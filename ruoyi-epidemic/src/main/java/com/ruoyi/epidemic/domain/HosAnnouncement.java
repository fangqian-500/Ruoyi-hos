package com.ruoyi.epidemic.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公告管理对象 hos_announcement
 * 
 * @author ruoyi
 * @date 2024-04-24
 */
public class HosAnnouncement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    @Excel(name = " 公告内容")
    private String title;

    /**  公告内容 */
    @Excel(name = " 公告内容")
    private String context;

    /** 开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateStart;

    /** 结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateEnd;

    /** 附件 */
    @Excel(name = "附件")
    private String attach;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setContext(String context) 
    {
        this.context = context;
    }

    public String getContext() 
    {
        return context;
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
    public void setAttach(String attach) 
    {
        this.attach = attach;
    }

    public String getAttach() 
    {
        return attach;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("context", getContext())
            .append("dateStart", getDateStart())
            .append("dateEnd", getDateEnd())
            .append("attach", getAttach())
            .toString();
    }
}
