/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.Login;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoginRecord extends UpdatableRecordImpl<LoginRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = -1327760025;

    /**
     * Setter for <code>learn.login.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.login.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>learn.login.phone</code>. 手机号
     */
    public void setPhone(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.login.phone</code>. 手机号
     */
    public String getPhone() {
        return (String) get(1);
    }

    /**
     * Setter for <code>learn.login.username</code>. 用户名
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.login.username</code>. 用户名
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>learn.login.login_type</code>. 登录方式USER_NAME：用户名；PHONE:手机号
     */
    public void setLoginType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.login.login_type</code>. 登录方式USER_NAME：用户名；PHONE:手机号
     */
    public String getLoginType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>learn.login.password</code>. 登录密码
     */
    public void setPassword(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn.login.password</code>. 登录密码
     */
    public String getPassword() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Login.LOGIN.ID;
    }

    @Override
    public Field<String> field2() {
        return Login.LOGIN.PHONE;
    }

    @Override
    public Field<String> field3() {
        return Login.LOGIN.USERNAME;
    }

    @Override
    public Field<String> field4() {
        return Login.LOGIN.LOGIN_TYPE;
    }

    @Override
    public Field<String> field5() {
        return Login.LOGIN.PASSWORD;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPhone();
    }

    @Override
    public String component3() {
        return getUsername();
    }

    @Override
    public String component4() {
        return getLoginType();
    }

    @Override
    public String component5() {
        return getPassword();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPhone();
    }

    @Override
    public String value3() {
        return getUsername();
    }

    @Override
    public String value4() {
        return getLoginType();
    }

    @Override
    public String value5() {
        return getPassword();
    }

    @Override
    public LoginRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public LoginRecord value2(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public LoginRecord value3(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public LoginRecord value4(String value) {
        setLoginType(value);
        return this;
    }

    @Override
    public LoginRecord value5(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public LoginRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LoginRecord
     */
    public LoginRecord() {
        super(Login.LOGIN);
    }

    /**
     * Create a detached, initialised LoginRecord
     */
    public LoginRecord(Integer id, String phone, String username, String loginType, String password) {
        super(Login.LOGIN);

        set(0, id);
        set(1, phone);
        set(2, username);
        set(3, loginType);
        set(4, password);
    }
}