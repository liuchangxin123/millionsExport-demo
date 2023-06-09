/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.jooqData.tables.daos;


import com.pluto.millionsExport.jooqData.tables.MillionsData;
import com.pluto.millionsExport.jooqData.tables.records.MillionsDataRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 百万数据导入导出测试
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MillionsDataDao extends DAOImpl<MillionsDataRecord, com.pluto.millionsExport.jooqData.tables.pojos.MillionsData, Integer> {

    /**
     * Create a new MillionsDataDao without any configuration
     */
    public MillionsDataDao() {
        super(MillionsData.MILLIONS_DATA, com.pluto.millionsExport.jooqData.tables.pojos.MillionsData.class);
    }

    /**
     * Create a new MillionsDataDao with an attached configuration
     */
    public MillionsDataDao(Configuration configuration) {
        super(MillionsData.MILLIONS_DATA, com.pluto.millionsExport.jooqData.tables.pojos.MillionsData.class, configuration);
    }

    @Override
    public Integer getId(com.pluto.millionsExport.jooqData.tables.pojos.MillionsData object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(MillionsData.MILLIONS_DATA.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchById(Integer... values) {
        return fetch(MillionsData.MILLIONS_DATA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.pluto.millionsExport.jooqData.tables.pojos.MillionsData fetchOneById(Integer value) {
        return fetchOne(MillionsData.MILLIONS_DATA.ID, value);
    }

    /**
     * Fetch records that have <code>staff_no BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchRangeOfStaffNo(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(MillionsData.MILLIONS_DATA.STAFF_NO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>staff_no IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchByStaffNo(Long... values) {
        return fetch(MillionsData.MILLIONS_DATA.STAFF_NO, values);
    }

    /**
     * Fetch records that have <code>salary BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchRangeOfSalary(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(MillionsData.MILLIONS_DATA.SALARY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>salary IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchBySalary(BigDecimal... values) {
        return fetch(MillionsData.MILLIONS_DATA.SALARY, values);
    }

    /**
     * Fetch records that have <code>start_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchRangeOfStartTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(MillionsData.MILLIONS_DATA.START_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>start_time IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchByStartTime(LocalDateTime... values) {
        return fetch(MillionsData.MILLIONS_DATA.START_TIME, values);
    }

    /**
     * Fetch records that have <code>end_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchRangeOfEndTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(MillionsData.MILLIONS_DATA.END_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>end_time IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.MillionsData> fetchByEndTime(LocalDateTime... values) {
        return fetch(MillionsData.MILLIONS_DATA.END_TIME, values);
    }
}
