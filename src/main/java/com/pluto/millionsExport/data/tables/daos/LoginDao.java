/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.daos;


import com.pluto.millionsExport.data.tables.Login;
import com.pluto.millionsExport.data.tables.records.LoginRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoginDao extends DAOImpl<LoginRecord, com.pluto.millionsExport.data.tables.pojos.Login, Integer> {

    /**
     * Create a new LoginDao without any configuration
     */
    public LoginDao() {
        super(Login.LOGIN, com.pluto.millionsExport.data.tables.pojos.Login.class);
    }

    /**
     * Create a new LoginDao with an attached configuration
     */
    public LoginDao(Configuration configuration) {
        super(Login.LOGIN, com.pluto.millionsExport.data.tables.pojos.Login.class, configuration);
    }

    @Override
    public Integer getId(com.pluto.millionsExport.data.tables.pojos.Login object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Login.LOGIN.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchById(Integer... values) {
        return fetch(Login.LOGIN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.pluto.millionsExport.data.tables.pojos.Login fetchOneById(Integer value) {
        return fetchOne(Login.LOGIN.ID, value);
    }

    /**
     * Fetch records that have <code>phone BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchRangeOfPhone(String lowerInclusive, String upperInclusive) {
        return fetchRange(Login.LOGIN.PHONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchByPhone(String... values) {
        return fetch(Login.LOGIN.PHONE, values);
    }

    /**
     * Fetch records that have <code>username BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchRangeOfUsername(String lowerInclusive, String upperInclusive) {
        return fetchRange(Login.LOGIN.USERNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchByUsername(String... values) {
        return fetch(Login.LOGIN.USERNAME, values);
    }

    /**
     * Fetch records that have <code>login_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchRangeOfLoginType(String lowerInclusive, String upperInclusive) {
        return fetchRange(Login.LOGIN.LOGIN_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>login_type IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchByLoginType(String... values) {
        return fetch(Login.LOGIN.LOGIN_TYPE, values);
    }

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchRangeOfPassword(String lowerInclusive, String upperInclusive) {
        return fetchRange(Login.LOGIN.PASSWORD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.pluto.millionsExport.data.tables.pojos.Login> fetchByPassword(String... values) {
        return fetch(Login.LOGIN.PASSWORD, values);
    }
}
