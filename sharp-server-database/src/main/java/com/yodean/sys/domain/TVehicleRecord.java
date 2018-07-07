package com.yodean.sys.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_vehicle_record")
public class TVehicleRecord {
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

    @Column(name = "back_date")
    private String backDate;

    private String dist;

    @Column(name = "usage_type")
    private String usageType;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "vehicle_id")
    private Integer vehicleId;

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
     * @return back_date
     */
    public String getBackDate() {
        return backDate;
    }

    /**
     * @param backDate
     */
    public void setBackDate(String backDate) {
        this.backDate = backDate;
    }

    /**
     * @return dist
     */
    public String getDist() {
        return dist;
    }

    /**
     * @param dist
     */
    public void setDist(String dist) {
        this.dist = dist;
    }

    /**
     * @return usage_type
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * @param usageType
     */
    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return vehicle_id
     */
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * @param vehicleId
     */
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }
}