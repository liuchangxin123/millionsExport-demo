/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.BondBalanceChange;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * 债券余额数据表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BondBalanceChangeRecord extends UpdatableRecordImpl<BondBalanceChangeRecord> implements Record14<ULong, ULong, LocalDate, LocalDate, UShort, BigDecimal, BigDecimal, UByte, ULong, UByte, ULong, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -2032061691;

    /**
     * Setter for <code>learn.bond_balance_change.id</code>. id
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.id</code>. id
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>learn.bond_balance_change.bond_uni_code</code>. DM债券唯一编码
     */
    public void setBondUniCode(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.bond_uni_code</code>. DM债券唯一编码
     */
    public ULong getBondUniCode() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>learn.bond_balance_change.bulletin_date</code>. 公告日期
     */
    public void setBulletinDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.bulletin_date</code>. 公告日期
     */
    public LocalDate getBulletinDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>learn.bond_balance_change.change_date</code>. 变动日期
     */
    public void setChangeDate(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.change_date</code>. 变动日期
     */
    public LocalDate getChangeDate() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>learn.bond_balance_change.change_reason</code>. 变动原因(默认给7：1 首次发行，2 回售，3 赎回，4 增发/续发，5 可转债转股，6 债券调换，7 到期兑付，8 提前偿还，9 债券合并上市，10 财政部购回，999 其他)
     */
    public void setChangeReason(UShort value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.change_reason</code>. 变动原因(默认给7：1 首次发行，2 回售，3 赎回，4 增发/续发，5 可转债转股，6 债券调换，7 到期兑付，8 提前偿还，9 债券合并上市，10 财政部购回，999 其他)
     */
    public UShort getChangeReason() {
        return (UShort) get(4);
    }

    /**
     * Setter for <code>learn.bond_balance_change.change_amount</code>. 变动规模(万元)
     */
    public void setChangeAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.change_amount</code>. 变动规模(万元)
     */
    public BigDecimal getChangeAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>learn.bond_balance_change.bond_balance</code>. 当前债券余额(万元)
     */
    public void setBondBalance(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.bond_balance</code>. 当前债券余额(万元)
     */
    public BigDecimal getBondBalance() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>learn.bond_balance_change.valid_status</code>. 是否有效(1-有效，0-无效。默认无效)
     */
    public void setValidStatus(UByte value) {
        set(7, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.valid_status</code>. 是否有效(1-有效，0-无效。默认无效)
     */
    public UByte getValidStatus() {
        return (UByte) get(7);
    }

    /**
     * Setter for <code>learn.bond_balance_change.update_by</code>. 最后编辑人user_id
     */
    public void setUpdateBy(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.update_by</code>. 最后编辑人user_id
     */
    public ULong getUpdateBy() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>learn.bond_balance_change.data_source</code>. 数据来源
     */
    public void setDataSource(UByte value) {
        set(9, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.data_source</code>. 数据来源
     */
    public UByte getDataSource() {
        return (UByte) get(9);
    }

    /**
     * Setter for <code>learn.bond_balance_change.data_id</code>. 数据来源id
     */
    public void setDataId(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.data_id</code>. 数据来源id
     */
    public ULong getDataId() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>learn.bond_balance_change.row_unique_key</code>. 数据唯一标识(规则 : data_id + data_source + bond_uni_code 拼接)

     */
    public void setRowUniqueKey(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.row_unique_key</code>. 数据唯一标识(规则 : data_id + data_source + bond_uni_code 拼接)

     */
    public String getRowUniqueKey() {
        return (String) get(11);
    }

    /**
     * Setter for <code>learn.bond_balance_change.update_time</code>. 更新时间
     */
    public void setUpdateTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.update_time</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>learn.bond_balance_change.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>learn.bond_balance_change.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<ULong, ULong, LocalDate, LocalDate, UShort, BigDecimal, BigDecimal, UByte, ULong, UByte, ULong, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<ULong, ULong, LocalDate, LocalDate, UShort, BigDecimal, BigDecimal, UByte, ULong, UByte, ULong, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.ID;
    }

    @Override
    public Field<ULong> field2() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.BOND_UNI_CODE;
    }

    @Override
    public Field<LocalDate> field3() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.BULLETIN_DATE;
    }

    @Override
    public Field<LocalDate> field4() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.CHANGE_DATE;
    }

    @Override
    public Field<UShort> field5() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.CHANGE_REASON;
    }

    @Override
    public Field<BigDecimal> field6() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.CHANGE_AMOUNT;
    }

    @Override
    public Field<BigDecimal> field7() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.BOND_BALANCE;
    }

    @Override
    public Field<UByte> field8() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.VALID_STATUS;
    }

    @Override
    public Field<ULong> field9() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.UPDATE_BY;
    }

    @Override
    public Field<UByte> field10() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.DATA_SOURCE;
    }

    @Override
    public Field<ULong> field11() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.DATA_ID;
    }

    @Override
    public Field<String> field12() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.ROW_UNIQUE_KEY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.UPDATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return BondBalanceChange.BOND_BALANCE_CHANGE.CREATE_TIME;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public ULong component2() {
        return getBondUniCode();
    }

    @Override
    public LocalDate component3() {
        return getBulletinDate();
    }

    @Override
    public LocalDate component4() {
        return getChangeDate();
    }

    @Override
    public UShort component5() {
        return getChangeReason();
    }

    @Override
    public BigDecimal component6() {
        return getChangeAmount();
    }

    @Override
    public BigDecimal component7() {
        return getBondBalance();
    }

    @Override
    public UByte component8() {
        return getValidStatus();
    }

    @Override
    public ULong component9() {
        return getUpdateBy();
    }

    @Override
    public UByte component10() {
        return getDataSource();
    }

    @Override
    public ULong component11() {
        return getDataId();
    }

    @Override
    public String component12() {
        return getRowUniqueKey();
    }

    @Override
    public LocalDateTime component13() {
        return getUpdateTime();
    }

    @Override
    public LocalDateTime component14() {
        return getCreateTime();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public ULong value2() {
        return getBondUniCode();
    }

    @Override
    public LocalDate value3() {
        return getBulletinDate();
    }

    @Override
    public LocalDate value4() {
        return getChangeDate();
    }

    @Override
    public UShort value5() {
        return getChangeReason();
    }

    @Override
    public BigDecimal value6() {
        return getChangeAmount();
    }

    @Override
    public BigDecimal value7() {
        return getBondBalance();
    }

    @Override
    public UByte value8() {
        return getValidStatus();
    }

    @Override
    public ULong value9() {
        return getUpdateBy();
    }

    @Override
    public UByte value10() {
        return getDataSource();
    }

    @Override
    public ULong value11() {
        return getDataId();
    }

    @Override
    public String value12() {
        return getRowUniqueKey();
    }

    @Override
    public LocalDateTime value13() {
        return getUpdateTime();
    }

    @Override
    public LocalDateTime value14() {
        return getCreateTime();
    }

    @Override
    public BondBalanceChangeRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value2(ULong value) {
        setBondUniCode(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value3(LocalDate value) {
        setBulletinDate(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value4(LocalDate value) {
        setChangeDate(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value5(UShort value) {
        setChangeReason(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value6(BigDecimal value) {
        setChangeAmount(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value7(BigDecimal value) {
        setBondBalance(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value8(UByte value) {
        setValidStatus(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value9(ULong value) {
        setUpdateBy(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value10(UByte value) {
        setDataSource(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value11(ULong value) {
        setDataId(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value12(String value) {
        setRowUniqueKey(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value13(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord value14(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public BondBalanceChangeRecord values(ULong value1, ULong value2, LocalDate value3, LocalDate value4, UShort value5, BigDecimal value6, BigDecimal value7, UByte value8, ULong value9, UByte value10, ULong value11, String value12, LocalDateTime value13, LocalDateTime value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BondBalanceChangeRecord
     */
    public BondBalanceChangeRecord() {
        super(BondBalanceChange.BOND_BALANCE_CHANGE);
    }

    /**
     * Create a detached, initialised BondBalanceChangeRecord
     */
    public BondBalanceChangeRecord(ULong id, ULong bondUniCode, LocalDate bulletinDate, LocalDate changeDate, UShort changeReason, BigDecimal changeAmount, BigDecimal bondBalance, UByte validStatus, ULong updateBy, UByte dataSource, ULong dataId, String rowUniqueKey, LocalDateTime updateTime, LocalDateTime createTime) {
        super(BondBalanceChange.BOND_BALANCE_CHANGE);

        set(0, id);
        set(1, bondUniCode);
        set(2, bulletinDate);
        set(3, changeDate);
        set(4, changeReason);
        set(5, changeAmount);
        set(6, bondBalance);
        set(7, validStatus);
        set(8, updateBy);
        set(9, dataSource);
        set(10, dataId);
        set(11, rowUniqueKey);
        set(12, updateTime);
        set(13, createTime);
    }
}
