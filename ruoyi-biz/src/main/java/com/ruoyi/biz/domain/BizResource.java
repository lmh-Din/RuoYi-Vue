package com.ruoyi.biz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资源管理对象 biz_resource
 * 
 * @author liumh
 * @date 2022-08-28
 */
public class BizResource extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资源ID */
    private Long id;

    /** 资源名称 */
    @Excel(name = "资源名称")
    private String name;

    /** 类型 0目录 1视频 2音频 3图片 4链接 5文档 */
    @Excel(name = "类型 0目录 1视频 2音频 3图片 4链接 5文档")
    private Long type;

    /** 类型描述：文档(PDF) */
    @Excel(name = "类型描述：文档(PDF)")
    private String typeDesc;

    /** 父ID */
    @Excel(name = "父ID")
    private Long parentId;

    /** 文件大小，KB */
    @Excel(name = "文件大小，KB")
    private Long size;

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
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setTypeDesc(String typeDesc) 
    {
        this.typeDesc = typeDesc;
    }

    public String getTypeDesc() 
    {
        return typeDesc;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setSize(Long size) 
    {
        this.size = size;
    }

    public Long getSize() 
    {
        return size;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("typeDesc", getTypeDesc())
            .append("parentId", getParentId())
            .append("size", getSize())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
