package com.yodean.sys.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_material_incoming")
public class TMaterialIncoming {
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

    @Column(name = "base_num")
    private Double baseNum;

    @Column(name = "base_unit_id")
    private Integer baseUnitId;

    @Column(name = "batch_num")
    private String batchNum;

    private String bid;

    private Integer keeper;

    @Column(name = "need_approve")
    private Boolean needApprove;

    private Double num;

    private String sno;

    private String status;

    @Column(name = "storage_id")
    private Integer storageId;

    @Column(name = "unit_id")
    private Integer unitId;

    private String users;

    @Column(name = "material_id")
    private Integer materialId;

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
     * @return base_num
     */
    public Double getBaseNum() {
        return baseNum;
    }

    /**
     * @param baseNum
     */
    public void setBaseNum(Double baseNum) {
        this.baseNum = baseNum;
    }

    /**
     * @return base_unit_id
     */
    public Integer getBaseUnitId() {
        return baseUnitId;
    }

    /**
     * @param baseUnitId
     */
    public void setBaseUnitId(Integer baseUnitId) {
        this.baseUnitId = baseUnitId;
    }

    /**
     * @return batch_num
     */
    public String getBatchNum() {
        return batchNum;
    }

    /**
     * @param batchNum
     */
    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return bid;
    }

    /**
     * @param bid
     */
    public void setBid(String bid) {
        this.bid = bid;
    }

    /**
     * @return keeper
     */
    public Integer getKeeper() {
        return keeper;
    }

    /**
     * @param keeper
     */
    public void setKeeper(Integer keeper) {
        this.keeper = keeper;
    }

    /**
     * @return need_approve
     */
    public Boolean getNeedApprove() {
        return needApprove;
    }

    /**
     * @param needApprove
     */
    public void setNeedApprove(Boolean needApprove) {
        this.needApprove = needApprove;
    }

    /**
     * @return num
     */
    public Double getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Double num) {
        this.num = num;
    }

    /**
     * @return sno
     */
    public String getSno() {
        return sno;
    }

    /**
     * @param sno
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return storage_id
     */
    public Integer getStorageId() {
        return storageId;
    }

    /**
     * @param storageId
     */
    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    /**
     * @return unit_id
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * @param unitId
     */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    /**
     * @return users
     */
    public String getUsers() {
        return users;
    }

    /**
     * @param users
     */
    public void setUsers(String users) {
        this.users = users;
    }

    /**
     * @return material_id
     */
    public Integer getMaterialId() {
        return materialId;
    }

    /**
     * @param materialId
     */
    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }
}