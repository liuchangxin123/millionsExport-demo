/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.jooqData.tables.daos;


import com.pluto.millionsExport.jooqData.tables.Account;
import com.pluto.millionsExport.jooqData.tables.records.AccountRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountDao extends DAOImpl<AccountRecord, com.pluto.millionsExport.jooqData.tables.pojos.Account, Integer> {

    /**
     * Create a new AccountDao without any configuration
     */
    public AccountDao() {
        super(Account.ACCOUNT, com.pluto.millionsExport.jooqData.tables.pojos.Account.class);
    }

    /**
     * Create a new AccountDao with an attached configuration
     */
    public AccountDao(Configuration configuration) {
        super(Account.ACCOUNT, com.pluto.millionsExport.jooqData.tables.pojos.Account.class, configuration);
    }

    @Override
    public Integer getId(com.pluto.millionsExport.jooqData.tables.pojos.Account object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Account.ACCOUNT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchById(Integer... values) {
        return fetch(Account.ACCOUNT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.pluto.millionsExport.jooqData.tables.pojos.Account fetchOneById(Integer value) {
        return fetchOne(Account.ACCOUNT.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Account.ACCOUNT.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchByName(String... values) {
        return fetch(Account.ACCOUNT.NAME, values);
    }

    /**
     * Fetch records that have <code>age BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchRangeOfAge(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Account.ACCOUNT.AGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchByAge(Integer... values) {
        return fetch(Account.ACCOUNT.AGE, values);
    }

    /**
     * Fetch records that have <code>phone BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchRangeOfPhone(String lowerInclusive, String upperInclusive) {
        return fetchRange(Account.ACCOUNT.PHONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchByPhone(String... values) {
        return fetch(Account.ACCOUNT.PHONE, values);
    }

    /**
     * Fetch records that have <code>address BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchRangeOfAddress(String lowerInclusive, String upperInclusive) {
        return fetchRange(Account.ACCOUNT.ADDRESS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchByAddress(String... values) {
        return fetch(Account.ACCOUNT.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>disable BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchRangeOfDisable(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(Account.ACCOUNT.DISABLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.pluto.millionsExport.jooqData.tables.pojos.Account> fetchByDisable(Byte... values) {
        return fetch(Account.ACCOUNT.DISABLE, values);
    }
}