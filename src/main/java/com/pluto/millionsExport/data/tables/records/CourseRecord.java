/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.Course;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CourseRecord extends TableRecordImpl<CourseRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -101930646;

    /**
     * Setter for <code>learn.course.c_id</code>.
     */
    public void setCId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.course.c_id</code>.
     */
    public Integer getCId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>learn.course.cname</code>.
     */
    public void setCname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.course.cname</code>.
     */
    public String getCname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>learn.course.t_id</code>.
     */
    public void setTId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.course.t_id</code>.
     */
    public Integer getTId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Course.COURSE.C_ID;
    }

    @Override
    public Field<String> field2() {
        return Course.COURSE.CNAME;
    }

    @Override
    public Field<Integer> field3() {
        return Course.COURSE.T_ID;
    }

    @Override
    public Integer component1() {
        return getCId();
    }

    @Override
    public String component2() {
        return getCname();
    }

    @Override
    public Integer component3() {
        return getTId();
    }

    @Override
    public Integer value1() {
        return getCId();
    }

    @Override
    public String value2() {
        return getCname();
    }

    @Override
    public Integer value3() {
        return getTId();
    }

    @Override
    public CourseRecord value1(Integer value) {
        setCId(value);
        return this;
    }

    @Override
    public CourseRecord value2(String value) {
        setCname(value);
        return this;
    }

    @Override
    public CourseRecord value3(Integer value) {
        setTId(value);
        return this;
    }

    @Override
    public CourseRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CourseRecord
     */
    public CourseRecord() {
        super(Course.COURSE);
    }

    /**
     * Create a detached, initialised CourseRecord
     */
    public CourseRecord(Integer cId, String cname, Integer tId) {
        super(Course.COURSE);

        set(0, cId);
        set(1, cname);
        set(2, tId);
    }
}
