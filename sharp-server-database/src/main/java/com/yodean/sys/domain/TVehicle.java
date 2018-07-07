package com.yodean.sys.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_vehicle")
public class TVehicle {
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

    @Column(name = "buy_date")
    private Date buyDate;

    private Integer capacity;

    @Column(name = "engine_code")
    private String engineCode;

    @Column(name = "identify_code")
    private String identifyCode;

    private Integer keeper;

    private String licence;

    @Column(name = "need_approve")
    private Boolean needApprove;

    @Column(name = "vehicle_brand")
    private String vehicleBrand;

    @Column(name = "vehicle_status")
    private String vehicleStatus;

    @Column(name = "vehicle_type")
    private String vehicleType;

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
     * @return buy_date
     */
    public Date getBuyDate() {
        return buyDate;
    }

    /**
     * @param buyDate
     */
    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    /**
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * @param capacity
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * @return engine_code
     */
    public String getEngineCode() {
        return engineCode;
    }

    /**
     * @param engineCode
     */
    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    /**
     * @return identify_code
     */
    public String getIdentifyCode() {
        return identifyCode;
    }

    /**
     * @param identifyCode
     */
    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
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
     * @return licence
     */
    public String getLicence() {
        return licence;
    }

    /**
     * @param licence
     */
    public void setLicence(String licence) {
        this.licence = licence;
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
     * @return vehicle_brand
     */
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    /**
     * @param vehicleBrand
     */
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    /**
     * @return vehicle_status
     */
    public String getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * @param vehicleStatus
     */
    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    /**
     * @return vehicle_type
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}