package com.yodean.sys.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_document_auth")
public class SysDocumentAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "del_flag")
    private String delFlag;

    private String remarks;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "authority_area")
    private String authorityArea;

    @Column(name = "authority_id")
    private Integer authorityId;

    @Column(name = "authority_type")
    private String authorityType;

    @Column(name = "document_id")
    private Integer documentId;

    private Boolean inherit;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return del_flag
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return authority_area
     */
    public String getAuthorityArea() {
        return authorityArea;
    }

    /**
     * @param authorityArea
     */
    public void setAuthorityArea(String authorityArea) {
        this.authorityArea = authorityArea;
    }

    /**
     * @return authority_id
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /**
     * @param authorityId
     */
    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    /**
     * @return authority_type
     */
    public String getAuthorityType() {
        return authorityType;
    }

    /**
     * @param authorityType
     */
    public void setAuthorityType(String authorityType) {
        this.authorityType = authorityType;
    }

    /**
     * @return document_id
     */
    public Integer getDocumentId() {
        return documentId;
    }

    /**
     * @param documentId
     */
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    /**
     * @return inherit
     */
    public Boolean getInherit() {
        return inherit;
    }

    /**
     * @param inherit
     */
    public void setInherit(Boolean inherit) {
        this.inherit = inherit;
    }
}