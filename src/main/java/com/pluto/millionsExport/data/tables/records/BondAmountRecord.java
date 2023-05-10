/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.BondAmount;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 债券余额数据表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BondAmountRecord extends UpdatableRecordImpl<BondAmountRecord> implements Record12<Long, Long, LocalDate, LocalDate, Byte, BigDecimal, BigDecimal, Byte, Long, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1727570431;

    /**
     * Setter for <code>learn.bond_amount.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.bond_amount.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>learn.bond_amount.bond_uni_code</code>. DM债券唯一编码
     */
    public void setBondUniCode(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.bond_amount.bond_uni_code</code>. DM债券唯一编码
     */
    public Long getBondUniCode() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>learn.bond_amount.publish_date</code>. 公告日期
     */
    public void setPublishDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.bond_amount.publish_date</code>. 公告日期
     */
    public LocalDate getPublishDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>learn.bond_amount.change_date</code>. 变动日期
     */
    public void setChangeDate(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.bond_amount.change_date</code>. 变动日期
     */
    public LocalDate getChangeDate() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>learn.bond_amount.change_reason</code>. 变动原因(默认给7：1 首次发行，2 回售，3 赎回，4 增发/续发，5 可转债转股，6 债券调换，7 到期兑付，8 提前偿还，9 债券合并上市，10 财政部购回)
     */
    public void setChangeReason(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn.bond_amount.change_reason</code>. 变动原因(默认给7：1 首次发行，2 回售，3 赎回，4 增发/续发，5 可转债转股，6 债券调换，7 到期兑付，8 提前偿还，9 债券合并上市，10 财政部购回)
     */
    public Byte getChangeReason() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>learn.bond_amount.change_amount</code>. 变动规模(万元)
     */
    public void setChangeAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn.bond_amount.change_amount</code>. 变动规模(万元)
     */
    public BigDecimal getChangeAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>learn.bond_amount.remain_amount</code>. 余额(万元)
     */
    public void setRemainAmount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>learn.bond_amount.remain_amount</code>. 余额(万元)
     */
    public BigDecimal getRemainAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>learn.bond_amount.valid_status</code>. 是否有效(1-有效，0-无效。默认无效)
     */
    public void setValidStatus(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>learn.bond_amount.valid_status</code>. 是否有效(1-有效，0-无效。默认无效)
     */
    public Byte getValidStatus() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>learn.bond_amount.update_by</code>. 最后编辑人user_id
     */
    public void setUpdateBy(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>learn.bond_amount.update_by</code>. 最后编辑人user_id
     */
    public Long getUpdateBy() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>learn.bond_amount.update_time</code>. 更新时间
     */
    public void setUpdateTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>learn.bond_amount.update_time</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>learn.bond_amount.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>learn.bond_amount.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>learn.bond_amount.row_unique_key</code>. 数据唯一标识(规则 : data_id + data_source + bond_uni_code 拼接)

     */
    public void setRowUniqueKey(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>learn.bond_amount.row_unique_key</code>. 数据唯一标识(规则 : data_id + data_source + bond_uni_code 拼接)

     */
    public String getRowUniqueKey() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, LocalDate, LocalDate, Byte, BigDecimal, BigDecimal, Byte, Long, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Long, LocalDate, LocalDate, Byte, BigDecimal, BigDecimal, Byte, Long, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return BondAmount.BOND_AMOUNT.ID;
    }

    @Override
    public Field<Long> field2() {
        return BondAmount.BOND_AMOUNT.BOND_UNI_CODE;
    }

    @Override
    public Field<LocalDate> field3() {
        return BondAmount.BOND_AMOUNT.PUBLISH_DATE;
    }

    @Override
    public Field<LocalDate> field4() {
        return BondAmount.BOND_AMOUNT.CHANGE_DATE;
    }

    @Override
    public Field<Byte> field5() {
        return BondAmount.BOND_AMOUNT.CHANGE_REASON;
    }

    @Override
    public Field<BigDecimal> field6() {
        return BondAmount.BOND_AMOUNT.CHANGE_AMOUNT;
    }

    @Override
    public Field<BigDecimal> field7() {
        return BondAmount.BOND_AMOUNT.REMAIN_AMOUNT;
    }

    @Override
    public Field<Byte> field8() {
        return BondAmount.BOND_AMOUNT.VALID_STATUS;
    }

    @Override
    public Field<Long> field9() {
        return BondAmount.BOND_AMOUNT.UPDATE_BY;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return BondAmount.BOND_AMOUNT.UPDATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return BondAmount.BOND_AMOUNT.CREATE_TIME;
    }

    @Override
    public Field<String> field12() {
        return BondAmount.BOND_AMOUNT.ROW_UNIQUE_KEY;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getBondUniCode();
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
    public Byte component5() {
        return getChangeReason();
    }

    @Override
    public BigDecimal component6() {
        return getChangeAmount();
    }

    @Override
    public BigDecimal component7() {
        return getRemainAmount();
    }

    @Override
    public Byte component8() {
        return getValidStatus();
    }

    @Override
    public Long component9() {
        return getUpdateBy();
    }

    @Override
    public LocalDateTime component10() {
        return getUpdateTime();
    }

    @Override
    public LocalDateTime component11() {
        return getCreateTime();
    }

    @Override
    public String component12() {
        return getRowUniqueKey();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getBondUniCode();
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
    public Byte value5() {
        return getChangeReason();
    }

    @Override
    public BigDecimal value6() {
        return getChangeAmount();
    }

    @Override
    public BigDecimal value7() {
        return getRemainAmount();
    }

    @Override
    public Byte value8() {
        return getValidStatus();
    }

    @Override
    public Long value9() {
        return getUpdateBy();
    }

    @Override
    public LocalDateTime value10() {
        return getUpdateTime();
    }

    @Override
    public LocalDateTime value11() {
        return getCreateTime();
    }

    @Override
    public String value12() {
        return getRowUniqueKey();
    }

    @Override
    public BondAmountRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public BondAmountRecord value2(Long value) {
        setBondUniCode(value);
        return this;
    }

    @Override
    public BondAmountRecord value3(LocalDate value) {
        setPublishDate(value);
        return this;
    }

    @Override
    public BondAmountRecord value4(LocalDate value) {
        setChangeDate(value);
        return this;
    }

    @Override
    public BondAmountRecord value5(Byte value) {
        setChangeReason(value);
        return this;
    }

    @Override
    public BondAmountRecord value6(BigDecimal value) {
        setChangeAmount(value);
        return this;
    }

    @Override
    public BondAmountRecord value7(BigDecimal value) {
        setRemainAmount(value);
        return this;
    }

    @Override
    public BondAmountRecord value8(Byte value) {
        setValidStatus(value);
        return this;
    }

    @Override
    public BondAmountRecord value9(Long value) {
        setUpdateBy(value);
        return this;
    }

    @Override
    public BondAmountRecord value10(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public BondAmountRecord value11(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public BondAmountRecord value12(String value) {
        setRowUniqueKey(value);
        return this;
    }

    @Override
    public BondAmountRecord values(Long value1, Long value2, LocalDate value3, LocalDate value4, Byte value5, BigDecimal value6, BigDecimal value7, Byte value8, Long value9, LocalDateTime value10, LocalDateTime value11, String value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BondAmountRecord
     */
    public BondAmountRecord() {
        super(BondAmount.BOND_AMOUNT);
    }

    /**
     * Create a detached, initialised BondAmountRecord
     */
    public BondAmountRecord(Long id, Long bondUniCode, LocalDate publishDate, LocalDate changeDate, Byte changeReason, BigDecimal changeAmount, BigDecimal remainAmount, Byte validStatus, Long updateBy, LocalDateTime updateTime, LocalDateTime createTime, String rowUniqueKey) {
        super(BondAmount.BOND_AMOUNT);

        set(0, id);
        set(1, bondUniCode);
        set(2, publishDate);
        set(3, changeDate);
        set(4, changeReason);
        set(5, changeAmount);
        set(6, remainAmount);
        set(7, validStatus);
        set(8, updateBy);
        set(9, updateTime);
        set(10, createTime);
        set(11, rowUniqueKey);
    }
}