package com.rh.mybase.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * 创建日期
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    /**
     * 创建人
     */
    @Column
    private String createName;

    /**
     * 修改日期
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    /**
     * 修改人
     */
    @Column
    private String modifyName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName;
    }
}
