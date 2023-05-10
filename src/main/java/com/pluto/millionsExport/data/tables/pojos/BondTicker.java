/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BondTicker implements Serializable {

    private static final long serialVersionUID = 1521990257;

    private Long          id;
    private String        bondId;
    private Long          securityId;
    private LocalDateTime updateTime;
    private Long          tmstamp;

    public BondTicker() {}

    public BondTicker(BondTicker value) {
        this.id = value.id;
        this.bondId = value.bondId;
        this.securityId = value.securityId;
        this.updateTime = value.updateTime;
        this.tmstamp = value.tmstamp;
    }

    public BondTicker(
        Long          id,
        String        bondId,
        Long          securityId,
        LocalDateTime updateTime,
        Long          tmstamp
    ) {
        this.id = id;
        this.bondId = bondId;
        this.securityId = securityId;
        this.updateTime = updateTime;
        this.tmstamp = tmstamp;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBondId() {
        return this.bondId;
    }

    public void setBondId(String bondId) {
        this.bondId = bondId;
    }

    public Long getSecurityId() {
        return this.securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getTmstamp() {
        return this.tmstamp;
    }

    public void setTmstamp(Long tmstamp) {
        this.tmstamp = tmstamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BondTicker (");

        sb.append(id);
        sb.append(", ").append(bondId);
        sb.append(", ").append(securityId);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(tmstamp);

        sb.append(")");
        return sb.toString();
    }
}