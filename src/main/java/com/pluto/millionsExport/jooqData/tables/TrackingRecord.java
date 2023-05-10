/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.jooqData.tables;


import com.pluto.millionsExport.jooqData.Indexes;
import com.pluto.millionsExport.jooqData.Keys;
import com.pluto.millionsExport.jooqData.Learn;
import com.pluto.millionsExport.jooqData.tables.records.TrackingRecordRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 埋点记录表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrackingRecord extends TableImpl<TrackingRecordRecord> {

    private static final long serialVersionUID = 1707342250;

    /**
     * The reference instance of <code>learn.tracking_record</code>
     */
    public static final TrackingRecord TRACKING_RECORD = new TrackingRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrackingRecordRecord> getRecordType() {
        return TrackingRecordRecord.class;
    }

    /**
     * The column <code>learn.tracking_record.id</code>. 标识
     */
    public final TableField<TrackingRecordRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "标识");

    /**
     * The column <code>learn.tracking_record.tracking_id</code>. 唯一编码
     */
    public final TableField<TrackingRecordRecord, String> TRACKING_ID = createField(DSL.name("tracking_id"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "唯一编码");

    /**
     * The column <code>learn.tracking_record.user_id</code>. 用户id
     */
    public final TableField<TrackingRecordRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "用户id");

    /**
     * The column <code>learn.tracking_record.open_id</code>. 用户微信公众号的openid
     */
    public final TableField<TrackingRecordRecord, String> OPEN_ID = createField(DSL.name("open_id"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "用户微信公众号的openid");

    /**
     * The column <code>learn.tracking_record.patient_id</code>. 患者id
     */
    public final TableField<TrackingRecordRecord, String> PATIENT_ID = createField(DSL.name("patient_id"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "患者id");

    /**
     * The column <code>learn.tracking_record.physician_id</code>. 医生id
     */
    public final TableField<TrackingRecordRecord, String> PHYSICIAN_ID = createField(DSL.name("physician_id"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "医生id");

    /**
     * The column <code>learn.tracking_record.event_type</code>. 事件类型
     */
    public final TableField<TrackingRecordRecord, String> EVENT_TYPE = createField(DSL.name("event_type"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "事件类型");

    /**
     * The column <code>learn.tracking_record.create_by</code>. 创建人
     */
    public final TableField<TrackingRecordRecord, String> CREATE_BY = createField(DSL.name("create_by"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "创建人");

    /**
     * The column <code>learn.tracking_record.create_time</code>. 创建时间
     */
    public final TableField<TrackingRecordRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建时间");

    /**
     * The column <code>learn.tracking_record.update_by</code>. 更新人
     */
    public final TableField<TrackingRecordRecord, String> UPDATE_BY = createField(DSL.name("update_by"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "更新人");

    /**
     * The column <code>learn.tracking_record.update_time</code>. 更新时间
     */
    public final TableField<TrackingRecordRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "更新时间");

    /**
     * The column <code>learn.tracking_record.revision</code>. 乐观锁
     */
    public final TableField<TrackingRecordRecord, Integer> REVISION = createField(DSL.name("revision"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "乐观锁");

    /**
     * The column <code>learn.tracking_record.deleted</code>. 删除标记
     */
    public final TableField<TrackingRecordRecord, Byte> DELETED = createField(DSL.name("deleted"), org.jooq.impl.SQLDataType.TINYINT, this, "删除标记");

    /**
     * Create a <code>learn.tracking_record</code> table reference
     */
    public TrackingRecord() {
        this(DSL.name("tracking_record"), null);
    }

    /**
     * Create an aliased <code>learn.tracking_record</code> table reference
     */
    public TrackingRecord(String alias) {
        this(DSL.name(alias), TRACKING_RECORD);
    }

    /**
     * Create an aliased <code>learn.tracking_record</code> table reference
     */
    public TrackingRecord(Name alias) {
        this(alias, TRACKING_RECORD);
    }

    private TrackingRecord(Name alias, Table<TrackingRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private TrackingRecord(Name alias, Table<TrackingRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("埋点记录表"), TableOptions.table());
    }

    public <O extends Record> TrackingRecord(Table<O> child, ForeignKey<O, TrackingRecordRecord> key) {
        super(child, key, TRACKING_RECORD);
    }

    @Override
    public Schema getSchema() {
        return Learn.LEARN;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TRACKING_RECORD_IDX_CREATE_TIME);
    }

    @Override
    public UniqueKey<TrackingRecordRecord> getPrimaryKey() {
        return Keys.KEY_TRACKING_RECORD_PRIMARY;
    }

    @Override
    public List<UniqueKey<TrackingRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<TrackingRecordRecord>>asList(Keys.KEY_TRACKING_RECORD_PRIMARY);
    }

    @Override
    public TrackingRecord as(String alias) {
        return new TrackingRecord(DSL.name(alias), this);
    }

    @Override
    public TrackingRecord as(Name alias) {
        return new TrackingRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TrackingRecord rename(String name) {
        return new TrackingRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TrackingRecord rename(Name name) {
        return new TrackingRecord(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime, Integer, Byte> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}