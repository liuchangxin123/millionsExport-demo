/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.records;


import com.pluto.millionsExport.data.tables.PatientMedicalRecord;

import java.time.LocalDateTime;

import org.jooq.JSON;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 患者结构化病历病程表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatientMedicalRecordRecord extends UpdatableRecordImpl<PatientMedicalRecordRecord> {

    private static final long serialVersionUID = 798479225;

    /**
     * Setter for <code>learn.patient_medical_record.id</code>. 标识
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.id</code>. 标识
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>learn.patient_medical_record.create_by</code>. 创建人
     */
    public void setCreateBy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.create_by</code>. 创建人
     */
    public String getCreateBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>learn.patient_medical_record.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>learn.patient_medical_record.update_by</code>. 更新人
     */
    public void setUpdateBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.update_by</code>. 更新人
     */
    public String getUpdateBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>learn.patient_medical_record.update_time</code>. 更新时间
     */
    public void setUpdateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.update_time</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>learn.patient_medical_record.revision</code>. 乐观锁
     */
    public void setRevision(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.revision</code>. 乐观锁
     */
    public Integer getRevision() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>learn.patient_medical_record.deleted</code>. 删除标记
     */
    public void setDeleted(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.deleted</code>. 删除标记
     */
    public Byte getDeleted() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>learn.patient_medical_record.patient_id</code>. 患者ID
     */
    public void setPatientId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.patient_id</code>. 患者ID
     */
    public String getPatientId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>learn.patient_medical_record.medical_type</code>. 病程类型 入院，确诊，出院
     */
    public void setMedicalType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.medical_type</code>. 病程类型 入院，确诊，出院
     */
    public String getMedicalType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>learn.patient_medical_record.diagnosis_time</code>. 确诊日期
     */
    public void setDiagnosisTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.diagnosis_time</code>. 确诊日期
     */
    public LocalDateTime getDiagnosisTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>learn.patient_medical_record.medical_description</code>. 病情描述
     */
    public void setMedicalDescription(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.medical_description</code>. 病情描述
     */
    public String getMedicalDescription() {
        return (String) get(10);
    }

    /**
     * Setter for <code>learn.patient_medical_record.pwo_id</code>. 解析任务ID
     */
    public void setPwoId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.pwo_id</code>. 解析任务ID
     */
    public String getPwoId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>learn.patient_medical_record.attachment</code>. 附件
     */
    public void setAttachment(JSON value) {
        set(12, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.attachment</code>. 附件
     */
    public JSON getAttachment() {
        return (JSON) get(12);
    }

    /**
     * Setter for <code>learn.patient_medical_record.medical_raw_id</code>. 病程id
     */
    public void setMedicalRawId(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.medical_raw_id</code>. 病程id
     */
    public String getMedicalRawId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>learn.patient_medical_record.parse_result</code>. 解析结果
     */
    public void setParseResult(JSON value) {
        set(14, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.parse_result</code>. 解析结果
     */
    public JSON getParseResult() {
        return (JSON) get(14);
    }

    /**
     * Setter for <code>learn.patient_medical_record.parse_template_id</code>. 解析模板id
     */
    public void setParseTemplateId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.parse_template_id</code>. 解析模板id
     */
    public String getParseTemplateId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>learn.patient_medical_record.patient_medical_type</code>. 病程类型
     */
    public void setPatientMedicalType(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.patient_medical_type</code>. 病程类型
     */
    public String getPatientMedicalType() {
        return (String) get(16);
    }

    /**
     * Setter for <code>learn.patient_medical_record.parse_template_name</code>. 解析模板名称
     */
    public void setParseTemplateName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.parse_template_name</code>. 解析模板名称
     */
    public String getParseTemplateName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>learn.patient_medical_record.team_id</code>. 团队id
     */
    public void setTeamId(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.team_id</code>. 团队id
     */
    public String getTeamId() {
        return (String) get(18);
    }

    /**
     * Setter for <code>learn.patient_medical_record.desensitize_attachment</code>. 脱敏后的附件
     */
    public void setDesensitizeAttachment(JSON value) {
        set(19, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.desensitize_attachment</code>. 脱敏后的附件
     */
    public JSON getDesensitizeAttachment() {
        return (JSON) get(19);
    }

    /**
     * Setter for <code>learn.patient_medical_record.is_test</code>. 是否是测试数据
     */
    public void setIsTest(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.is_test</code>. 是否是测试数据
     */
    public Byte getIsTest() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>learn.patient_medical_record.original_version</code>. 原始版本号
     */
    public void setOriginalVersion(Double value) {
        set(21, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.original_version</code>. 原始版本号
     */
    public Double getOriginalVersion() {
        return (Double) get(21);
    }

    /**
     * Setter for <code>learn.patient_medical_record.current_version</code>. 当前版本号
     */
    public void setCurrentVersion(Double value) {
        set(22, value);
    }

    /**
     * Getter for <code>learn.patient_medical_record.current_version</code>. 当前版本号
     */
    public Double getCurrentVersion() {
        return (Double) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PatientMedicalRecordRecord
     */
    public PatientMedicalRecordRecord() {
        super(PatientMedicalRecord.PATIENT_MEDICAL_RECORD);
    }

    /**
     * Create a detached, initialised PatientMedicalRecordRecord
     */
    public PatientMedicalRecordRecord(String id, String createBy, LocalDateTime createTime, String updateBy, LocalDateTime updateTime, Integer revision, Byte deleted, String patientId, String medicalType, LocalDateTime diagnosisTime, String medicalDescription, String pwoId, JSON attachment, String medicalRawId, JSON parseResult, String parseTemplateId, String patientMedicalType, String parseTemplateName, String teamId, JSON desensitizeAttachment, Byte isTest, Double originalVersion, Double currentVersion) {
        super(PatientMedicalRecord.PATIENT_MEDICAL_RECORD);

        set(0, id);
        set(1, createBy);
        set(2, createTime);
        set(3, updateBy);
        set(4, updateTime);
        set(5, revision);
        set(6, deleted);
        set(7, patientId);
        set(8, medicalType);
        set(9, diagnosisTime);
        set(10, medicalDescription);
        set(11, pwoId);
        set(12, attachment);
        set(13, medicalRawId);
        set(14, parseResult);
        set(15, parseTemplateId);
        set(16, patientMedicalType);
        set(17, parseTemplateName);
        set(18, teamId);
        set(19, desensitizeAttachment);
        set(20, isTest);
        set(21, originalVersion);
        set(22, currentVersion);
    }
}
