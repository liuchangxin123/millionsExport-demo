/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables;


import com.pluto.millionsExport.data.Indexes;
import com.pluto.millionsExport.data.Keys;
import com.pluto.millionsExport.data.Learn;
import com.pluto.millionsExport.data.tables.records.BondBalanceChangeRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * 债券余额数据表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BondBalanceChange extends TableImpl<BondBalanceChangeRecord> {

    private static final long serialVersionUID = -208342165;

    /**
     * The reference instance of <code>learn.bond_balance_change</code>
     */
    public static final BondBalanceChange BOND_BALANCE_CHANGE = new BondBalanceChange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BondBalanceChangeRecord> getRecordType() {
        return BondBalanceChangeRecord.class;
    }

    /**
     * The column <code>learn.bond_balance_change.id</code>. id
     */
    public final TableField<BondBalanceChangeRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "id");

    /**
     * The column <code>learn.bond_balance_change.bond_uni_code</code>. DM债券唯一编码
     */
    public final TableField<BondBalanceChangeRecord, ULong> BOND_UNI_CODE = createField(DSL.name("bond_uni_code"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "DM债券唯一编码");

    /**
     * The column <code>learn.bond_balance_change.bulletin_date</code>. 公告日期
     */
    public final TableField<BondBalanceChangeRecord, LocalDate> BULLETIN_DATE = createField(DSL.name("bulletin_date"), org.jooq.impl.SQLDataType.LOCALDATE, this, "公告日期");

    /**
     * The column <code>learn.bond_balance_change.change_date</code>. 变动日期
     */
    public final TableField<BondBalanceChangeRecord, LocalDate> CHANGE_DATE = createField(DSL.name("change_date"), org.jooq.impl.SQLDataType.LOCALDATE, this, "变动日期");

    /**
     * The column <code>learn.bond_balance_change.change_reason</code>. 变动原因(默认给7：1 首次发行，2 回售，3 赎回，4 增发/续发，5 可转债转股，6 债券调换，7 到期兑付，8 提前偿还，9 债券合并上市，10 财政部购回，999 其他)
     */
    public final TableField<BondBalanceChangeRecord, UShort> CHANGE_REASON = createField(DSL.name("change_reason"), org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("7", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "变动原因(默认给7：1 首次发行，2 回售，3 赎回，4 增发/续发，5 可转债转股，6 债券调换，7 到期兑付，8 提前偿还，9 债券合并上市，10 财政部购回，999 其他)");

    /**
     * The column <code>learn.bond_balance_change.change_amount</code>. 变动规模(万元)
     */
    public final TableField<BondBalanceChangeRecord, BigDecimal> CHANGE_AMOUNT = createField(DSL.name("change_amount"), org.jooq.impl.SQLDataType.DECIMAL(18, 6), this, "变动规模(万元)");

    /**
     * The column <code>learn.bond_balance_change.bond_balance</code>. 当前债券余额(万元)
     */
    public final TableField<BondBalanceChangeRecord, BigDecimal> BOND_BALANCE = createField(DSL.name("bond_balance"), org.jooq.impl.SQLDataType.DECIMAL(20, 6), this, "当前债券余额(万元)");

    /**
     * The column <code>learn.bond_balance_change.valid_status</code>. 是否有效(1-有效，0-无效。默认无效)
     */
    public final TableField<BondBalanceChangeRecord, UByte> VALID_STATUS = createField(DSL.name("valid_status"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "是否有效(1-有效，0-无效。默认无效)");

    /**
     * The column <code>learn.bond_balance_change.update_by</code>. 最后编辑人user_id
     */
    public final TableField<BondBalanceChangeRecord, ULong> UPDATE_BY = createField(DSL.name("update_by"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "最后编辑人user_id");

    /**
     * The column <code>learn.bond_balance_change.data_source</code>. 数据来源
     */
    public final TableField<BondBalanceChangeRecord, UByte> DATA_SOURCE = createField(DSL.name("data_source"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "数据来源");

    /**
     * The column <code>learn.bond_balance_change.data_id</code>. 数据来源id
     */
    public final TableField<BondBalanceChangeRecord, ULong> DATA_ID = createField(DSL.name("data_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "数据来源id");

    /**
     * The column <code>learn.bond_balance_change.row_unique_key</code>. 数据唯一标识(规则 : data_id + data_source + bond_uni_code 拼接)

     */
    public final TableField<BondBalanceChangeRecord, String> ROW_UNIQUE_KEY = createField(DSL.name("row_unique_key"), org.jooq.impl.SQLDataType.CHAR(50).nullable(false), this, "数据唯一标识(规则 : data_id + data_source + bond_uni_code 拼接)\n");

    /**
     * The column <code>learn.bond_balance_change.update_time</code>. 更新时间
     */
    public final TableField<BondBalanceChangeRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP(3)", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "更新时间");

    /**
     * The column <code>learn.bond_balance_change.create_time</code>. 创建时间
     */
    public final TableField<BondBalanceChangeRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP(3)", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * Create a <code>learn.bond_balance_change</code> table reference
     */
    public BondBalanceChange() {
        this(DSL.name("bond_balance_change"), null);
    }

    /**
     * Create an aliased <code>learn.bond_balance_change</code> table reference
     */
    public BondBalanceChange(String alias) {
        this(DSL.name(alias), BOND_BALANCE_CHANGE);
    }

    /**
     * Create an aliased <code>learn.bond_balance_change</code> table reference
     */
    public BondBalanceChange(Name alias) {
        this(alias, BOND_BALANCE_CHANGE);
    }

    private BondBalanceChange(Name alias, Table<BondBalanceChangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private BondBalanceChange(Name alias, Table<BondBalanceChangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("债券余额数据表"), TableOptions.table());
    }

    public <O extends Record> BondBalanceChange(Table<O> child, ForeignKey<O, BondBalanceChangeRecord> key) {
        super(child, key, BOND_BALANCE_CHANGE);
    }

    @Override
    public Schema getSchema() {
        return Learn.LEARN;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BOND_BALANCE_CHANGE_IDX_BOND_UNI_CODE);
    }

    @Override
    public Identity<BondBalanceChangeRecord, ULong> getIdentity() {
        return Keys.IDENTITY_BOND_BALANCE_CHANGE;
    }

    @Override
    public UniqueKey<BondBalanceChangeRecord> getPrimaryKey() {
        return Keys.KEY_BOND_BALANCE_CHANGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<BondBalanceChangeRecord>> getKeys() {
        return Arrays.<UniqueKey<BondBalanceChangeRecord>>asList(Keys.KEY_BOND_BALANCE_CHANGE_PRIMARY);
    }

    @Override
    public BondBalanceChange as(String alias) {
        return new BondBalanceChange(DSL.name(alias), this);
    }

    @Override
    public BondBalanceChange as(Name alias) {
        return new BondBalanceChange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BondBalanceChange rename(String name) {
        return new BondBalanceChange(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BondBalanceChange rename(Name name) {
        return new BondBalanceChange(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<ULong, ULong, LocalDate, LocalDate, UShort, BigDecimal, BigDecimal, UByte, ULong, UByte, ULong, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
