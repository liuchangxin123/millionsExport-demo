/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables;


import com.pluto.millionsExport.data.Keys;
import com.pluto.millionsExport.data.Learn;
import com.pluto.millionsExport.data.tables.records.ComGuarInfoRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
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
 * 公司担保基本信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ComGuarInfo extends TableImpl<ComGuarInfoRecord> {

    private static final long serialVersionUID = 503907042;

    /**
     * The reference instance of <code>learn.com_guar_info</code>
     */
    public static final ComGuarInfo COM_GUAR_INFO = new ComGuarInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ComGuarInfoRecord> getRecordType() {
        return ComGuarInfoRecord.class;
    }

    /**
     * The column <code>learn.com_guar_info.id</code>. 主键id
     */
    public final TableField<ComGuarInfoRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>learn.com_guar_info.com_uni_code</code>. 企业担保人唯一编码
     */
    public final TableField<ComGuarInfoRecord, Long> COM_UNI_CODE = createField(DSL.name("com_uni_code"), org.jooq.impl.SQLDataType.BIGINT, this, "企业担保人唯一编码");

    /**
     * The column <code>learn.com_guar_info.com_full_name</code>. 担保公司全称
     */
    public final TableField<ComGuarInfoRecord, String> COM_FULL_NAME = createField(DSL.name("com_full_name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "担保公司全称");

    /**
     * The column <code>learn.com_guar_info.report_year</code>. 报告年份
     */
    public final TableField<ComGuarInfoRecord, Short> REPORT_YEAR = createField(DSL.name("report_year"), org.jooq.impl.SQLDataType.SMALLINT, this, "报告年份");

    /**
     * The column <code>learn.com_guar_info.report_quarter</code>. 报告季度：1: 一季度；2:二季度；3:三季度；4: 四季度
     */
    public final TableField<ComGuarInfoRecord, Byte> REPORT_QUARTER = createField(DSL.name("report_quarter"), org.jooq.impl.SQLDataType.TINYINT, this, "报告季度：1: 一季度；2:二季度；3:三季度；4: 四季度");

    /**
     * The column <code>learn.com_guar_info.guarantee_bond_number</code>. 担保债券只数
     */
    public final TableField<ComGuarInfoRecord, Integer> GUARANTEE_BOND_NUMBER = createField(DSL.name("guarantee_bond_number"), org.jooq.impl.SQLDataType.INTEGER, this, "担保债券只数");

    /**
     * The column <code>learn.com_guar_info.guarantee_bp</code>. 担保利差(bp)
     */
    public final TableField<ComGuarInfoRecord, BigDecimal> GUARANTEE_BP = createField(DSL.name("guarantee_bp"), org.jooq.impl.SQLDataType.DECIMAL(14, 4), this, "担保利差(bp)");

    /**
     * The column <code>learn.com_guar_info.bond_coupon_rate_avg</code>. 债券票面利率/收益率平均单位%
     */
    public final TableField<ComGuarInfoRecord, BigDecimal> BOND_COUPON_RATE_AVG = createField(DSL.name("bond_coupon_rate_avg"), org.jooq.impl.SQLDataType.DECIMAL(14, 4), this, "债券票面利率/收益率平均单位%");

    /**
     * The column <code>learn.com_guar_info.guar_liability_balance_gr</code>. 担保责任余额增长率(%)
     */
    public final TableField<ComGuarInfoRecord, BigDecimal> GUAR_LIABILITY_BALANCE_GR = createField(DSL.name("guar_liability_balance_gr"), org.jooq.impl.SQLDataType.DECIMAL(14, 4), this, "担保责任余额增长率(%)");

    /**
     * The column <code>learn.com_guar_info.udic_radio</code>. 担保债券城投占比(%)
     */
    public final TableField<ComGuarInfoRecord, BigDecimal> UDIC_RADIO = createField(DSL.name("udic_radio"), org.jooq.impl.SQLDataType.DECIMAL(14, 4), this, "担保债券城投占比(%)");

    /**
     * The column <code>learn.com_guar_info.private_enterprise_ratio</code>. 担保债券民企占比(%)
     */
    public final TableField<ComGuarInfoRecord, BigDecimal> PRIVATE_ENTERPRISE_RATIO = createField(DSL.name("private_enterprise_ratio"), org.jooq.impl.SQLDataType.DECIMAL(14, 4), this, "担保债券民企占比(%)");

    /**
     * The column <code>learn.com_guar_info.outside_province_ratio</code>. 担保债券省外占比(%)
     */
    public final TableField<ComGuarInfoRecord, BigDecimal> OUTSIDE_PROVINCE_RATIO = createField(DSL.name("outside_province_ratio"), org.jooq.impl.SQLDataType.DECIMAL(14, 4), this, "担保债券省外占比(%)");

    /**
     * The column <code>learn.com_guar_info.private_enterprise_status</code>. 是否担保民企主体债： 0: 否；1:是
     */
    public final TableField<ComGuarInfoRecord, UByte> PRIVATE_ENTERPRISE_STATUS = createField(DSL.name("private_enterprise_status"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "是否担保民企主体债： 0: 否；1:是");

    /**
     * The column <code>learn.com_guar_info.outside_province_status</code>. 是否担保省外债主体：0:否；1: 是
     */
    public final TableField<ComGuarInfoRecord, UByte> OUTSIDE_PROVINCE_STATUS = createField(DSL.name("outside_province_status"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "是否担保省外债主体：0:否；1: 是");

    /**
     * The column <code>learn.com_guar_info.province_uni_code</code>. 担保人省份编码
     */
    public final TableField<ComGuarInfoRecord, ULong> PROVINCE_UNI_CODE = createField(DSL.name("province_uni_code"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "担保人省份编码");

    /**
     * The column <code>learn.com_guar_info.com_current_bonds_balance</code>. 担保人当前存续规模
     */
    public final TableField<ComGuarInfoRecord, BigDecimal> COM_CURRENT_BONDS_BALANCE = createField(DSL.name("com_current_bonds_balance"), org.jooq.impl.SQLDataType.DECIMAL(14, 4).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "担保人当前存续规模");

    /**
     * The column <code>learn.com_guar_info.com_ext_rating_filter_mapping</code>. 主体外部评级-筛选方案 1 AAA; 2 AA+; 3: AA; 4: AA-; 5: A+; 999:其他
     */
    public final TableField<ComGuarInfoRecord, UShort> COM_EXT_RATING_FILTER_MAPPING = createField(DSL.name("com_ext_rating_filter_mapping"), org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("99", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "主体外部评级-筛选方案 1 AAA; 2 AA+; 3: AA; 4: AA-; 5: A+; 999:其他");

    /**
     * The column <code>learn.com_guar_info.com_ext_credit_rating_com_name</code>. 主体外部评级机构名称
     */
    public final TableField<ComGuarInfoRecord, String> COM_EXT_CREDIT_RATING_COM_NAME = createField(DSL.name("com_ext_credit_rating_com_name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "主体外部评级机构名称");

    /**
     * The column <code>learn.com_guar_info.establish_date</code>. 担保公司成立日期
     */
    public final TableField<ComGuarInfoRecord, LocalDate> ESTABLISH_DATE = createField(DSL.name("establish_date"), org.jooq.impl.SQLDataType.LOCALDATE, this, "担保公司成立日期");

    /**
     * The column <code>learn.com_guar_info.deleted</code>. 是否删除：0: 否； 1: 是
     */
    public final TableField<ComGuarInfoRecord, Byte> DELETED = createField(DSL.name("deleted"), org.jooq.impl.SQLDataType.TINYINT, this, "是否删除：0: 否； 1: 是");

    /**
     * The column <code>learn.com_guar_info.registered_capital</code>. 注册资本
     */
    public final TableField<ComGuarInfoRecord, Long> REGISTERED_CAPITAL = createField(DSL.name("registered_capital"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "注册资本");

    /**
     * The column <code>learn.com_guar_info.business_nature</code>. 企业性质（经营类型） 1 中央国有企业 2 地方国有企业 3 集体企业 4 中外合资企业 5 外商独资企业 6 民营企业 7 公众企业 8 国有企业 9 民营相对控股企业 10 国有相对控股企业 11 其他分类
     */
    public final TableField<ComGuarInfoRecord, UShort> BUSINESS_NATURE = createField(DSL.name("business_nature"), org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "企业性质（经营类型） 1 中央国有企业 2 地方国有企业 3 集体企业 4 中外合资企业 5 外商独资企业 6 民营企业 7 公众企业 8 国有企业 9 民营相对控股企业 10 国有相对控股企业 11 其他分类");

    /**
     * The column <code>learn.com_guar_info.report_date</code>. 报告日期： 
     */
    public final TableField<ComGuarInfoRecord, LocalDate> REPORT_DATE = createField(DSL.name("report_date"), org.jooq.impl.SQLDataType.LOCALDATE, this, "报告日期： ");

    /**
     * Create a <code>learn.com_guar_info</code> table reference
     */
    public ComGuarInfo() {
        this(DSL.name("com_guar_info"), null);
    }

    /**
     * Create an aliased <code>learn.com_guar_info</code> table reference
     */
    public ComGuarInfo(String alias) {
        this(DSL.name(alias), COM_GUAR_INFO);
    }

    /**
     * Create an aliased <code>learn.com_guar_info</code> table reference
     */
    public ComGuarInfo(Name alias) {
        this(alias, COM_GUAR_INFO);
    }

    private ComGuarInfo(Name alias, Table<ComGuarInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ComGuarInfo(Name alias, Table<ComGuarInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("公司担保基本信息"), TableOptions.table());
    }

    public <O extends Record> ComGuarInfo(Table<O> child, ForeignKey<O, ComGuarInfoRecord> key) {
        super(child, key, COM_GUAR_INFO);
    }

    @Override
    public Schema getSchema() {
        return Learn.LEARN;
    }

    @Override
    public Identity<ComGuarInfoRecord, ULong> getIdentity() {
        return Keys.IDENTITY_COM_GUAR_INFO;
    }

    @Override
    public UniqueKey<ComGuarInfoRecord> getPrimaryKey() {
        return Keys.KEY_COM_GUAR_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<ComGuarInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<ComGuarInfoRecord>>asList(Keys.KEY_COM_GUAR_INFO_PRIMARY, Keys.KEY_COM_GUAR_INFO_UK_GUAR_INFO);
    }

    @Override
    public ComGuarInfo as(String alias) {
        return new ComGuarInfo(DSL.name(alias), this);
    }

    @Override
    public ComGuarInfo as(Name alias) {
        return new ComGuarInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ComGuarInfo rename(String name) {
        return new ComGuarInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ComGuarInfo rename(Name name) {
        return new ComGuarInfo(name, null);
    }
}
