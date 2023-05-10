/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.Account;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record6<Integer, String, Integer, String, String, Byte> {

    private static final long serialVersionUID = 763911772;

    /**
     * Setter for <code>learn.account.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.account.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>learn.account.name</code>. 姓名
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.account.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>learn.account.age</code>. 年龄
     */
    public void setAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.account.age</code>. 年龄
     */
    public Integer getAge() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>learn.account.phone</code>. 手机号
     */
    public void setPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.account.phone</code>. 手机号
     */
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>learn.account.address</code>. 地址
     */
    public void setAddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn.account.address</code>. 地址
     */
    public String getAddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>learn.account.disable</code>. 是否禁用0否1是
     */
    public void setDisable(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn.account.disable</code>. 是否禁用0否1是
     */
    public Byte getDisable() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Integer, String, String, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, Integer, String, String, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Account.ACCOUNT.ID;
    }

    @Override
    public Field<String> field2() {
        return Account.ACCOUNT.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Account.ACCOUNT.AGE;
    }

    @Override
    public Field<String> field4() {
        return Account.ACCOUNT.PHONE;
    }

    @Override
    public Field<String> field5() {
        return Account.ACCOUNT.ADDRESS;
    }

    @Override
    public Field<Byte> field6() {
        return Account.ACCOUNT.DISABLE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getAge();
    }

    @Override
    public String component4() {
        return getPhone();
    }

    @Override
    public String component5() {
        return getAddress();
    }

    @Override
    public Byte component6() {
        return getDisable();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getAge();
    }

    @Override
    public String value4() {
        return getPhone();
    }

    @Override
    public String value5() {
        return getAddress();
    }

    @Override
    public Byte value6() {
        return getDisable();
    }

    @Override
    public AccountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AccountRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AccountRecord value3(Integer value) {
        setAge(value);
        return this;
    }

    @Override
    public AccountRecord value4(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public AccountRecord value5(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public AccountRecord value6(Byte value) {
        setDisable(value);
        return this;
    }

    @Override
    public AccountRecord values(Integer value1, String value2, Integer value3, String value4, String value5, Byte value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Integer id, String name, Integer age, String phone, String address, Byte disable) {
        super(Account.ACCOUNT);

        set(0, id);
        set(1, name);
        set(2, age);
        set(3, phone);
        set(4, address);
        set(5, disable);
    }
}
