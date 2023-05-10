/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 测试创建库
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestCreated implements Serializable {

    private static final long serialVersionUID = 1707366083;

    private String        id;
    private String        trackingId;
    private String        openId;
    private LocalDateTime createdTime;
    private LocalDateTime updateTime;

    public TestCreated() {}

    public TestCreated(TestCreated value) {
        this.id = value.id;
        this.trackingId = value.trackingId;
        this.openId = value.openId;
        this.createdTime = value.createdTime;
        this.updateTime = value.updateTime;
    }

    public TestCreated(
        String        id,
        String        trackingId,
        String        openId,
        LocalDateTime createdTime,
        LocalDateTime updateTime
    ) {
        this.id = id;
        this.trackingId = trackingId;
        this.openId = openId;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrackingId() {
        return this.trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestCreated (");

        sb.append(id);
        sb.append(", ").append(trackingId);
        sb.append(", ").append(openId);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
