package com.ruoyi.biz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 书籍信息对象 biz_book
 * 
 * @author liumh
 * @date 2022-08-28
 */
public class BizBook extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 书籍ID */
    private Long id;

    /** 书籍名称 */
    @Excel(name = "书籍名称")
    private String bookName;

    /** 年级 */
    @Excel(name = "年级")
    private String grade;

    /** 科目 */
    @Excel(name = "科目")
    private String subject;

    /** 学期 */
    @Excel(name = "学期")
    private String semester;

    /** 出版社 */
    @Excel(name = "出版社")
    private String press;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 发行社 */
    @Excel(name = "发行社")
    private String publisher;

    /** 封面图片链接 */
    @Excel(name = "封面图片链接")
    private String coverLink;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }

    public String getBookName() 
    {
        return bookName;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setSemester(String semester) 
    {
        this.semester = semester;
    }

    public String getSemester() 
    {
        return semester;
    }
    public void setPress(String press) 
    {
        this.press = press;
    }

    public String getPress() 
    {
        return press;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public String getPublisher() 
    {
        return publisher;
    }
    public void setCoverLink(String coverLink) 
    {
        this.coverLink = coverLink;
    }

    public String getCoverLink() 
    {
        return coverLink;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bookName", getBookName())
            .append("grade", getGrade())
            .append("subject", getSubject())
            .append("semester", getSemester())
            .append("press", getPress())
            .append("version", getVersion())
            .append("publisher", getPublisher())
            .append("coverLink", getCoverLink())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
