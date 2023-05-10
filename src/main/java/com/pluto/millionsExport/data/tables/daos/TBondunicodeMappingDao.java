/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.daos;


import com.pluto.millionsExport.data.tables.TBondunicodeMapping;
import com.pluto.millionsExport.data.tables.records.TBondunicodeMappingRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBondunicodeMappingDao extends DAOImpl<TBondunicodeMappingRecord, com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping, Integer> {

    /**
     * Create a new TBondunicodeMappingDao without any configuration
     */
    public TBondunicodeMappingDao() {
        super(TBondunicodeMapping.T_BONDUNICODE_MAPPING, com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping.class);
    }

    /**
     * Create a new TBondunicodeMappingDao with an attached configuration
     */
    public TBondunicodeMappingDao(Configuration configuration) {
        super(TBondunicodeMapping.T_BONDUNICODE_MAPPING, com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping.class, configuration);
    }

    @Override
    public Integer getId(com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchById(Integer... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping fetchOneById(Integer value) {
        return fetchOne(TBondunicodeMapping.T_BONDUNICODE_MAPPING.ID, value);
    }

    /**
     * Fetch records that have <code>bond_uni_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfBondUniCode(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_UNI_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>bond_uni_code IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByBondUniCode(Long... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_UNI_CODE, values);
    }

    /**
     * Fetch a unique record that has <code>bond_uni_code = value</code>
     */
    public com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping fetchOneByBondUniCode(Long value) {
        return fetchOne(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_UNI_CODE, value);
    }

    /**
     * Fetch records that have <code>bond_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfBondCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>bond_code IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByBondCode(String... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_CODE, values);
    }

    /**
     * Fetch records that have <code>bond_short_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfBondShortName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_SHORT_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>bond_short_name IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByBondShortName(String... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_SHORT_NAME, values);
    }

    /**
     * Fetch records that have <code>bond_full_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfBondFullName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_FULL_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>bond_full_name IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByBondFullName(String... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.BOND_FULL_NAME, values);
    }

    /**
     * Fetch records that have <code>ccxe_bond_uni_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfCcxeBondUniCode(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.CCXE_BOND_UNI_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ccxe_bond_uni_code IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByCcxeBondUniCode(Long... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.CCXE_BOND_UNI_CODE, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByCreateTime(LocalDateTime... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>ch_bond_uni_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfChBondUniCode(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.CH_BOND_UNI_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ch_bond_uni_code IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByChBondUniCode(Long... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.CH_BOND_UNI_CODE, values);
    }

    /**
     * Fetch records that have <code>is_valid BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfIsValid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.IS_VALID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_valid IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByIsValid(Integer... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.IS_VALID, values);
    }

    /**
     * Fetch records that have <code>update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfUpdateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByUpdateTime(LocalDateTime... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>tl_bond_uni_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchRangeOfTlBondUniCode(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TBondunicodeMapping.T_BONDUNICODE_MAPPING.TL_BOND_UNI_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tl_bond_uni_code IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TBondunicodeMapping> fetchByTlBondUniCode(Long... values) {
        return fetch(TBondunicodeMapping.T_BONDUNICODE_MAPPING.TL_BOND_UNI_CODE, values);
    }
}