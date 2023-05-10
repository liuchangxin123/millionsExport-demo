/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.Student;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentRecord extends TableRecordImpl<StudentRecord> implements Record4<Integer, String, Integer, String> {

    private static final long serialVersionUID = -1224580387;

    /**
     * Setter for <code>learn.student.s_id</code>.
     */
    public void setSId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.student.s_id</code>.
     */
    public Integer getSId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>learn.student.sname</code>.
     */
    public void setSname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.student.sname</code>.
     */
    public String getSname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>learn.student.sage</code>.
     */
    public void setSage(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.student.sage</code>.
     */
    public Integer getSage() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>learn.student.sgender</code>.
     */
    public void setSgender(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.student.sgender</code>.
     */
    public String getSgender() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Student.STUDENT.S_ID;
    }

    @Override
    public Field<String> field2() {
        return Student.STUDENT.SNAME;
    }

    @Override
    public Field<Integer> field3() {
        return Student.STUDENT.SAGE;
    }

    @Override
    public Field<String> field4() {
        return Student.STUDENT.SGENDER;
    }

    @Override
    public Integer component1() {
        return getSId();
    }

    @Override
    public String component2() {
        return getSname();
    }

    @Override
    public Integer component3() {
        return getSage();
    }

    @Override
    public String component4() {
        return getSgender();
    }

    @Override
    public Integer value1() {
        return getSId();
    }

    @Override
    public String value2() {
        return getSname();
    }

    @Override
    public Integer value3() {
        return getSage();
    }

    @Override
    public String value4() {
        return getSgender();
    }

    @Override
    public StudentRecord value1(Integer value) {
        setSId(value);
        return this;
    }

    @Override
    public StudentRecord value2(String value) {
        setSname(value);
        return this;
    }

    @Override
    public StudentRecord value3(Integer value) {
        setSage(value);
        return this;
    }

    @Override
    public StudentRecord value4(String value) {
        setSgender(value);
        return this;
    }

    @Override
    public StudentRecord values(Integer value1, String value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Integer sId, String sname, Integer sage, String sgender) {
        super(Student.STUDENT);

        set(0, sId);
        set(1, sname);
        set(2, sage);
        set(3, sgender);
    }
}