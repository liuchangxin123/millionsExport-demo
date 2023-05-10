/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.ComGuarInfo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * 公司担保基本信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ComGuarInfoRecord extends UpdatableRecordImpl<ComGuarInfoRecord> {

    private static final long serialVersionUID = 1411073958;

    /**
     * Setter for <code>learn.com_guar_info.id</code>. 主键id
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.id</code>. 主键id
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>learn.com_guar_info.com_uni_code</code>. 企业担保人唯一编码
     */
    public void setComUniCode(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.com_uni_code</code>. 企业担保人唯一编码
     */
    public Long getComUniCode() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>learn.com_guar_info.com_full_name</code>. 担保公司全称
     */
    public void setComFullName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.com_full_name</code>. 担保公司全称
     */
    public String getComFullName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>learn.com_guar_info.report_year</code>. 报告年份
     */
    public void setReportYear(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.report_year</code>. 报告年份
     */
    public Short getReportYear() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>learn.com_guar_info.report_quarter</code>. 报告季度：1: 一季度；2:二季度；3:三季度；4: 四季度
     */
    public void setReportQuarter(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.report_quarter</code>. 报告季度：1: 一季度；2:二季度；3:三季度；4: 四季度
     */
    public Byte getReportQuarter() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>learn.com_guar_info.guarantee_bond_number</code>. 担保债券只数
     */
    public void setGuaranteeBondNumber(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.guarantee_bond_number</code>. 担保债券只数
     */
    public Integer getGuaranteeBondNumber() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>learn.com_guar_info.guarantee_bp</code>. 担保利差(bp)
     */
    public void setGuaranteeBp(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.guarantee_bp</code>. 担保利差(bp)
     */
    public BigDecimal getGuaranteeBp() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>learn.com_guar_info.bond_coupon_rate_avg</code>. 债券票面利率/收益率平均单位%
     */
    public void setBondCouponRateAvg(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.bond_coupon_rate_avg</code>. 债券票面利率/收益率平均单位%
     */
    public BigDecimal getBondCouponRateAvg() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>learn.com_guar_info.guar_liability_balance_gr</code>. 担保责任余额增长率(%)
     */
    public void setGuarLiabilityBalanceGr(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.guar_liability_balance_gr</code>. 担保责任余额增长率(%)
     */
    public BigDecimal getGuarLiabilityBalanceGr() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>learn.com_guar_info.udic_radio</code>. 担保债券城投占比(%)
     */
    public void setUdicRadio(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.udic_radio</code>. 担保债券城投占比(%)
     */
    public BigDecimal getUdicRadio() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>learn.com_guar_info.private_enterprise_ratio</code>. 担保债券民企占比(%)
     */
    public void setPrivateEnterpriseRatio(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.private_enterprise_ratio</code>. 担保债券民企占比(%)
     */
    public BigDecimal getPrivateEnterpriseRatio() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>learn.com_guar_info.outside_province_ratio</code>. 担保债券省外占比(%)
     */
    public void setOutsideProvinceRatio(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.outside_province_ratio</code>. 担保债券省外占比(%)
     */
    public BigDecimal getOutsideProvinceRatio() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>learn.com_guar_info.private_enterprise_status</code>. 是否担保民企主体债： 0: 否；1:是
     */
    public void setPrivateEnterpriseStatus(UByte value) {
        set(12, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.private_enterprise_status</code>. 是否担保民企主体债： 0: 否；1:是
     */
    public UByte getPrivateEnterpriseStatus() {
        return (UByte) get(12);
    }

    /**
     * Setter for <code>learn.com_guar_info.outside_province_status</code>. 是否担保省外债主体：0:否；1: 是
     */
    public void setOutsideProvinceStatus(UByte value) {
        set(13, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.outside_province_status</code>. 是否担保省外债主体：0:否；1: 是
     */
    public UByte getOutsideProvinceStatus() {
        return (UByte) get(13);
    }

    /**
     * Setter for <code>learn.com_guar_info.province_uni_code</code>. 担保人省份编码
     */
    public void setProvinceUniCode(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.province_uni_code</code>. 担保人省份编码
     */
    public ULong getProvinceUniCode() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>learn.com_guar_info.com_current_bonds_balance</code>. 担保人当前存续规模
     */
    public void setComCurrentBondsBalance(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.com_current_bonds_balance</code>. 担保人当前存续规模
     */
    public BigDecimal getComCurrentBondsBalance() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>learn.com_guar_info.com_ext_rating_filter_mapping</code>. 主体外部评级-筛选方案 1 AAA; 2 AA+; 3: AA; 4: AA-; 5: A+; 999:其他
     */
    public void setComExtRatingFilterMapping(UShort value) {
        set(16, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.com_ext_rating_filter_mapping</code>. 主体外部评级-筛选方案 1 AAA; 2 AA+; 3: AA; 4: AA-; 5: A+; 999:其他
     */
    public UShort getComExtRatingFilterMapping() {
        return (UShort) get(16);
    }

    /**
     * Setter for <code>learn.com_guar_info.com_ext_credit_rating_com_name</code>. 主体外部评级机构名称
     */
    public void setComExtCreditRatingComName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.com_ext_credit_rating_com_name</code>. 主体外部评级机构名称
     */
    public String getComExtCreditRatingComName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>learn.com_guar_info.establish_date</code>. 担保公司成立日期
     */
    public void setEstablishDate(LocalDate value) {
        set(18, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.establish_date</code>. 担保公司成立日期
     */
    public LocalDate getEstablishDate() {
        return (LocalDate) get(18);
    }

    /**
     * Setter for <code>learn.com_guar_info.deleted</code>. 是否删除：0: 否； 1: 是
     */
    public void setDeleted(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.deleted</code>. 是否删除：0: 否； 1: 是
     */
    public Byte getDeleted() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>learn.com_guar_info.registered_capital</code>. 注册资本
     */
    public void setRegisteredCapital(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.registered_capital</code>. 注册资本
     */
    public Long getRegisteredCapital() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>learn.com_guar_info.business_nature</code>. 企业性质（经营类型） 1 中央国有企业 2 地方国有企业 3 集体企业 4 中外合资企业 5 外商独资企业 6 民营企业 7 公众企业 8 国有企业 9 民营相对控股企业 10 国有相对控股企业 11 其他分类
     */
    public void setBusinessNature(UShort value) {
        set(21, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.business_nature</code>. 企业性质（经营类型） 1 中央国有企业 2 地方国有企业 3 集体企业 4 中外合资企业 5 外商独资企业 6 民营企业 7 公众企业 8 国有企业 9 民营相对控股企业 10 国有相对控股企业 11 其他分类
     */
    public UShort getBusinessNature() {
        return (UShort) get(21);
    }

    /**
     * Setter for <code>learn.com_guar_info.report_date</code>. 报告日期： 
     */
    public void setReportDate(LocalDate value) {
        set(22, value);
    }

    /**
     * Getter for <code>learn.com_guar_info.report_date</code>. 报告日期： 
     */
    public LocalDate getReportDate() {
        return (LocalDate) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ComGuarInfoRecord
     */
    public ComGuarInfoRecord() {
        super(ComGuarInfo.COM_GUAR_INFO);
    }

    /**
     * Create a detached, initialised ComGuarInfoRecord
     */
    public ComGuarInfoRecord(ULong id, Long comUniCode, String comFullName, Short reportYear, Byte reportQuarter, Integer guaranteeBondNumber, BigDecimal guaranteeBp, BigDecimal bondCouponRateAvg, BigDecimal guarLiabilityBalanceGr, BigDecimal udicRadio, BigDecimal privateEnterpriseRatio, BigDecimal outsideProvinceRatio, UByte privateEnterpriseStatus, UByte outsideProvinceStatus, ULong provinceUniCode, BigDecimal comCurrentBondsBalance, UShort comExtRatingFilterMapping, String comExtCreditRatingComName, LocalDate establishDate, Byte deleted, Long registeredCapital, UShort businessNature, LocalDate reportDate) {
        super(ComGuarInfo.COM_GUAR_INFO);

        set(0, id);
        set(1, comUniCode);
        set(2, comFullName);
        set(3, reportYear);
        set(4, reportQuarter);
        set(5, guaranteeBondNumber);
        set(6, guaranteeBp);
        set(7, bondCouponRateAvg);
        set(8, guarLiabilityBalanceGr);
        set(9, udicRadio);
        set(10, privateEnterpriseRatio);
        set(11, outsideProvinceRatio);
        set(12, privateEnterpriseStatus);
        set(13, outsideProvinceStatus);
        set(14, provinceUniCode);
        set(15, comCurrentBondsBalance);
        set(16, comExtRatingFilterMapping);
        set(17, comExtCreditRatingComName);
        set(18, establishDate);
        set(19, deleted);
        set(20, registeredCapital);
        set(21, businessNature);
        set(22, reportDate);
    }
}
