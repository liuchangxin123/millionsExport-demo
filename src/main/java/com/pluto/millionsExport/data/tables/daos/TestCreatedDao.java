/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.daos;


import com.pluto.millionsExport.data.tables.TestCreated;
import com.pluto.millionsExport.data.tables.records.TestCreatedRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 测试创建库
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestCreatedDao extends DAOImpl<TestCreatedRecord, com.pluto.millionsExport.data.tables.pojos.TestCreated, String> {

    /**
     * Create a new TestCreatedDao without any configuration
     */
    public TestCreatedDao() {
        super(TestCreated.TEST_CREATED, com.pluto.millionsExport.data.tables.pojos.TestCreated.class);
    }

    /**
     * Create a new TestCreatedDao with an attached configuration
     */
    public TestCreatedDao(Configuration configuration) {
        super(TestCreated.TEST_CREATED, com.pluto.millionsExport.data.tables.pojos.TestCreated.class, configuration);
    }

    @Override
    public String getId(com.pluto.millionsExport.data.tables.pojos.TestCreated object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestCreated.TEST_CREATED.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchById(String... values) {
        return fetch(TestCreated.TEST_CREATED.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.pluto.millionsExport.data.tables.pojos.TestCreated fetchOneById(String value) {
        return fetchOne(TestCreated.TEST_CREATED.ID, value);
    }

    /**
     * Fetch records that have <code>tracking_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchRangeOfTrackingId(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestCreated.TEST_CREATED.TRACKING_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tracking_id IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchByTrackingId(String... values) {
        return fetch(TestCreated.TEST_CREATED.TRACKING_ID, values);
    }

    /**
     * Fetch records that have <code>open_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchRangeOfOpenId(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestCreated.TEST_CREATED.OPEN_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>open_id IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchByOpenId(String... values) {
        return fetch(TestCreated.TEST_CREATED.OPEN_ID, values);
    }

    /**
     * Fetch records that have <code>created_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchRangeOfCreatedTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TestCreated.TEST_CREATED.CREATED_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_time IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchByCreatedTime(LocalDateTime... values) {
        return fetch(TestCreated.TEST_CREATED.CREATED_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchRangeOfUpdateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TestCreated.TEST_CREATED.UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.TestCreated> fetchByUpdateTime(LocalDateTime... values) {
        return fetch(TestCreated.TEST_CREATED.UPDATE_TIME, values);
    }
}
