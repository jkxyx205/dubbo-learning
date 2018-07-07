package com.yodean.sys.domain;

import javax.persistence.*;

@Table(name = "sys_user_org")
public class SysUserOrg {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Id
    @Column(name = "org_id")
    private Integer orgId;

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
     * @return org_id
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}