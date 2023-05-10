/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.jooqData.tables.records;


import com.pluto.millionsExport.jooqData.tables.TBondunicodeMapping;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBondunicodeMappingRecord extends UpdatableRecordImpl<TBondunicodeMappingRecord> implements Record11<Integer, Long, String, String, String, Long, LocalDateTime, Long, Integer, LocalDateTime, Long> {

    private static final long serialVersionUID = 189111378;

    /**
     * Setter for <code>learn.t_bondunicode_mapping.id</code>. 主键ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.id</code>. 主键ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.bond_uni_code</code>. DM债券code
     */
    public void setBondUniCode(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.bond_uni_code</code>. DM债券code
     */
    public Long getBondUniCode() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.bond_code</code>. 带市场的债券社会统一编码
     */
    public void setBondCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.bond_code</code>. 带市场的债券社会统一编码
     */
    public String getBondCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.bond_short_name</code>. 债券简称
     */
    public void setBondShortName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.bond_short_name</code>. 债券简称
     */
    public String getBondShortName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.bond_full_name</code>. 债券全称
     */
    public void setBondFullName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.bond_full_name</code>. 债券全称
     */
    public String getBondFullName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.ccxe_bond_uni_code</code>. 中诚信债券code
     */
    public void setCcxeBondUniCode(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.ccxe_bond_uni_code</code>. 中诚信债券code
     */
    public Long getCcxeBondUniCode() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.ch_bond_uni_code</code>. 财汇的债券编号
     */
    public void setChBondUniCode(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.ch_bond_uni_code</code>. 财汇的债券编号
     */
    public Long getChBondUniCode() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.is_valid</code>. 是否有效（1：有效 0：无效）
     */
    public void setIsValid(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.is_valid</code>. 是否有效（1：有效 0：无效）
     */
    public Integer getIsValid() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.update_time</code>. 更新时间
     */
    public void setUpdateTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.update_time</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>learn.t_bondunicode_mapping.tl_bond_uni_code</code>. 通联债券编码 security_id
     */
    public void setTlBondUniCode(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>learn.t_bondunicode_mapping.tl_bond_uni_code</code>. 通联债券编码 security_id
     */
    public Long getTlBondUniCode() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Long, String, String, String, Long, LocalDateTime, Long, Integer, LocalDateTime, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, Long, String, String, String, Long, LocalDateTime, Long, Integer, LocalDateTime, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.ID;
    }

    @Override
    public Field<Long> field2() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_UNI_CODE;
    }

    @Override
    public Field<String> field3() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_CODE;
    }

    @Override
    public Field<String> field4() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_SHORT_NAME;
    }

    @Override
    public Field<String> field5() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_FULL_NAME;
    }

    @Override
    public Field<Long> field6() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.CCXE_BOND_UNI_CODE;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.CREATE_TIME;
    }

    @Override
    public Field<Long> field8() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.CH_BOND_UNI_CODE;
    }

    @Override
    public Field<Integer> field9() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.IS_VALID;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.UPDATE_TIME;
    }

    @Override
    public Field<Long> field11() {
        return TBondunicodeMapping.T_BONDUNICODE_MAPPING.TL_BOND_UNI_CODE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getBondUniCode();
    }

    @Override
    public String component3() {
        return getBondCode();
    }

    @Override
    public String component4() {
        return getBondShortName();
    }

    @Override
    public String component5() {
        return getBondFullName();
    }

    @Override
    public Long component6() {
        return getCcxeBondUniCode();
    }

    @Override
    public LocalDateTime component7() {
        return getCreateTime();
    }

    @Override
    public Long component8() {
        return getChBondUniCode();
    }

    @Override
    public Integer component9() {
        return getIsValid();
    }

    @Override
    public LocalDateTime component10() {
        return getUpdateTime();
    }

    @Override
    public Long component11() {
        return getTlBondUniCode();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getBondUniCode();
    }

    @Override
    public String value3() {
        return getBondCode();
    }

    @Override
    public String value4() {
        return getBondShortName();
    }

    @Override
    public String value5() {
        return getBondFullName();
    }

    @Override
    public Long value6() {
        return getCcxeBondUniCode();
    }

    @Override
    public LocalDateTime value7() {
        return getCreateTime();
    }

    @Override
    public Long value8() {
        return getChBondUniCode();
    }

    @Override
    public Integer value9() {
        return getIsValid();
    }

    @Override
    public LocalDateTime value10() {
        return getUpdateTime();
    }

    @Override
    public Long value11() {
        return getTlBondUniCode();
    }

    @Override
    public TBondunicodeMappingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value2(Long value) {
        setBondUniCode(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value3(String value) {
        setBondCode(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value4(String value) {
        setBondShortName(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value5(String value) {
        setBondFullName(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value6(Long value) {
        setCcxeBondUniCode(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value8(Long value) {
        setChBondUniCode(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value9(Integer value) {
        setIsValid(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value10(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord value11(Long value) {
        setTlBondUniCode(value);
        return this;
    }

    @Override
    public TBondunicodeMappingRecord values(Integer value1, Long value2, String value3, String value4, String value5, Long value6, LocalDateTime value7, Long value8, Integer value9, LocalDateTime value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TBondunicodeMappingRecord
     */
    public TBondunicodeMappingRecord() {
        super(TBondunicodeMapping.T_BONDUNICODE_MAPPING);
    }

    /**
     * Create a detached, initialised TBondunicodeMappingRecord
     */
    public TBondunicodeMappingRecord(Integer id, Long bondUniCode, String bondCode, String bondShortName, String bondFullName, Long ccxeBondUniCode, LocalDateTime createTime, Long chBondUniCode, Integer isValid, LocalDateTime updateTime, Long tlBondUniCode) {
        super(TBondunicodeMapping.T_BONDUNICODE_MAPPING);

        set(0, id);
        set(1, bondUniCode);
        set(2, bondCode);
        set(3, bondShortName);
        set(4, bondFullName);
        set(5, ccxeBondUniCode);
        set(6, createTime);
        set(7, chBondUniCode);
        set(8, isValid);
        set(9, updateTime);
        set(10, tlBondUniCode);
    }
}