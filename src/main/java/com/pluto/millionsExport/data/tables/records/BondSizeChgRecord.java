/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.BondSizeChg;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BondSizeChgRecord extends UpdatableRecordImpl<BondSizeChgRecord> implements Record9<Long, String, LocalDate, LocalDate, BigDecimal, BigDecimal, String, LocalDateTime, Long> {

    private static final long serialVersionUID = -1733072531;

    /**
     * Setter for <code>learn.bond_size_chg.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>learn.bond_size_chg.BOND_ID</code>.
     */
    public void setBondId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.BOND_ID</code>.
     */
    public String getBondId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>learn.bond_size_chg.PUBLISH_DATE</code>.
     */
    public void setPublishDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.PUBLISH_DATE</code>.
     */
    public LocalDate getPublishDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>learn.bond_size_chg.CHANGE_DATE</code>.
     */
    public void setChangeDate(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.CHANGE_DATE</code>.
     */
    public LocalDate getChangeDate() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>learn.bond_size_chg.CHANGE_SIZE</code>.
     */
    public void setChangeSize(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.CHANGE_SIZE</code>.
     */
    public BigDecimal getChangeSize() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>learn.bond_size_chg.REMAIN_SIZE</code>.
     */
    public void setRemainSize(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.REMAIN_SIZE</code>.
     */
    public BigDecimal getRemainSize() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>learn.bond_size_chg.CHANGE_REASON_CD</code>.
     */
    public void setChangeReasonCd(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.CHANGE_REASON_CD</code>.
     */
    public String getChangeReasonCd() {
        return (String) get(6);
    }

    /**
     * Setter for <code>learn.bond_size_chg.UPDATE_TIME</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.UPDATE_TIME</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>learn.bond_size_chg.TMSTAMP</code>.
     */
    public void setTmstamp(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>learn.bond_size_chg.TMSTAMP</code>.
     */
    public Long getTmstamp() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, LocalDate, LocalDate, BigDecimal, BigDecimal, String, LocalDateTime, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, LocalDate, LocalDate, BigDecimal, BigDecimal, String, LocalDateTime, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return BondSizeChg.BOND_SIZE_CHG.ID;
    }

    @Override
    public Field<String> field2() {
        return BondSizeChg.BOND_SIZE_CHG.BOND_ID;
    }

    @Override
    public Field<LocalDate> field3() {
        return BondSizeChg.BOND_SIZE_CHG.PUBLISH_DATE;
    }

    @Override
    public Field<LocalDate> field4() {
        return BondSizeChg.BOND_SIZE_CHG.CHANGE_DATE;
    }

    @Override
    public Field<BigDecimal> field5() {
        return BondSizeChg.BOND_SIZE_CHG.CHANGE_SIZE;
    }

    @Override
    public Field<BigDecimal> field6() {
        return BondSizeChg.BOND_SIZE_CHG.REMAIN_SIZE;
    }

    @Override
    public Field<String> field7() {
        return BondSizeChg.BOND_SIZE_CHG.CHANGE_REASON_CD;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return BondSizeChg.BOND_SIZE_CHG.UPDATE_TIME;
    }

    @Override
    public Field<Long> field9() {
        return BondSizeChg.BOND_SIZE_CHG.TMSTAMP;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getBondId();
    }

    @Override
    public LocalDate component3() {
        return getPublishDate();
    }

    @Override
    public LocalDate component4() {
        return getChangeDate();
    }

    @Override
    public BigDecimal component5() {
        return getChangeSize();
    }

    @Override
    public BigDecimal component6() {
        return getRemainSize();
    }

    @Override
    public String component7() {
        return getChangeReasonCd();
    }

    @Override
    public LocalDateTime component8() {
        return getUpdateTime();
    }

    @Override
    public Long component9() {
        return getTmstamp();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getBondId();
    }

    @Override
    public LocalDate value3() {
        return getPublishDate();
    }

    @Override
    public LocalDate value4() {
        return getChangeDate();
    }

    @Override
    public BigDecimal value5() {
        return getChangeSize();
    }

    @Override
    public BigDecimal value6() {
        return getRemainSize();
    }

    @Override
    public String value7() {
        return getChangeReasonCd();
    }

    @Override
    public LocalDateTime value8() {
        return getUpdateTime();
    }

    @Override
    public Long value9() {
        return getTmstamp();
    }

    @Override
    public BondSizeChgRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public BondSizeChgRecord value2(String value) {
        setBondId(value);
        return this;
    }

    @Override
    public BondSizeChgRecord value3(LocalDate value) {
        setPublishDate(value);
        return this;
    }

    @Override
    public BondSizeChgRecord value4(LocalDate value) {
        setChangeDate(value);
        return this;
    }

    @Override
    public BondSizeChgRecord value5(BigDecimal value) {
        setChangeSize(value);
        return this;
    }

    @Override
    public BondSizeChgRecord value6(BigDecimal value) {
        setRemainSize(value);
        return this;
    }

    @Override
    public BondSizeChgRecord value7(String value) {
        setChangeReasonCd(value);
        return this;
    }

    @Override
    public BondSizeChgRecord value8(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public BondSizeChgRecord value9(Long value) {
        setTmstamp(value);
        return this;
    }

    @Override
    public BondSizeChgRecord values(Long value1, String value2, LocalDate value3, LocalDate value4, BigDecimal value5, BigDecimal value6, String value7, LocalDateTime value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BondSizeChgRecord
     */
    public BondSizeChgRecord() {
        super(BondSizeChg.BOND_SIZE_CHG);
    }

    /**
     * Create a detached, initialised BondSizeChgRecord
     */
    public BondSizeChgRecord(Long id, String bondId, LocalDate publishDate, LocalDate changeDate, BigDecimal changeSize, BigDecimal remainSize, String changeReasonCd, LocalDateTime updateTime, Long tmstamp) {
        super(BondSizeChg.BOND_SIZE_CHG);

        set(0, id);
        set(1, bondId);
        set(2, publishDate);
        set(3, changeDate);
        set(4, changeSize);
        set(5, remainSize);
        set(6, changeReasonCd);
        set(7, updateTime);
        set(8, tmstamp);
    }
}
