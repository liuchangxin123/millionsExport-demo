/*
 * This file is generated by jOOQ.
 */
package com.pluto.millionsExport.data.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.JSON;


/**
 * 患者结构化病历病程表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatientMedicalRecord implements Serializable {

    private static final long serialVersionUID = -1589330284;

    private String        id;
    private String        createBy;
    private LocalDateTime createTime;
    private String        updateBy;
    private LocalDateTime updateTime;
    private Integer       revision;
    private Byte          deleted;
    private String        patientId;
    private String        medicalType;
    private LocalDateTime diagnosisTime;
    private String        medicalDescription;
    private String        pwoId;
    private JSON          attachment;
    private String        medicalRawId;
    private JSON          parseResult;
    private String        parseTemplateId;
    private String        patientMedicalType;
    private String        parseTemplateName;
    private String        teamId;
    private JSON          desensitizeAttachment;
    private Byte          isTest;
    private Double        originalVersion;
    private Double        currentVersion;

    public PatientMedicalRecord() {}

    public PatientMedicalRecord(PatientMedicalRecord value) {
        this.id = value.id;
        this.createBy = value.createBy;
        this.createTime = value.createTime;
        this.updateBy = value.updateBy;
        this.updateTime = value.updateTime;
        this.revision = value.revision;
        this.deleted = value.deleted;
        this.patientId = value.patientId;
        this.medicalType = value.medicalType;
        this.diagnosisTime = value.diagnosisTime;
        this.medicalDescription = value.medicalDescription;
        this.pwoId = value.pwoId;
        this.attachment = value.attachment;
        this.medicalRawId = value.medicalRawId;
        this.parseResult = value.parseResult;
        this.parseTemplateId = value.parseTemplateId;
        this.patientMedicalType = value.patientMedicalType;
        this.parseTemplateName = value.parseTemplateName;
        this.teamId = value.teamId;
        this.desensitizeAttachment = value.desensitizeAttachment;
        this.isTest = value.isTest;
        this.originalVersion = value.originalVersion;
        this.currentVersion = value.currentVersion;
    }

    public PatientMedicalRecord(
        String        id,
        String        createBy,
        LocalDateTime createTime,
        String        updateBy,
        LocalDateTime updateTime,
        Integer       revision,
        Byte          deleted,
        String        patientId,
        String        medicalType,
        LocalDateTime diagnosisTime,
        String        medicalDescription,
        String        pwoId,
        JSON          attachment,
        String        medicalRawId,
        JSON          parseResult,
        String        parseTemplateId,
        String        patientMedicalType,
        String        parseTemplateName,
        String        teamId,
        JSON          desensitizeAttachment,
        Byte          isTest,
        Double        originalVersion,
        Double        currentVersion
    ) {
        this.id = id;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.revision = revision;
        this.deleted = deleted;
        this.patientId = patientId;
        this.medicalType = medicalType;
        this.diagnosisTime = diagnosisTime;
        this.medicalDescription = medicalDescription;
        this.pwoId = pwoId;
        this.attachment = attachment;
        this.medicalRawId = medicalRawId;
        this.parseResult = parseResult;
        this.parseTemplateId = parseTemplateId;
        this.patientMedicalType = patientMedicalType;
        this.parseTemplateName = parseTemplateName;
        this.teamId = teamId;
        this.desensitizeAttachment = desensitizeAttachment;
        this.isTest = isTest;
        this.originalVersion = originalVersion;
        this.currentVersion = currentVersion;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRevision() {
        return this.revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public Byte getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getPatientId() {
        return this.patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicalType() {
        return this.medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }

    public LocalDateTime getDiagnosisTime() {
        return this.diagnosisTime;
    }

    public void setDiagnosisTime(LocalDateTime diagnosisTime) {
        this.diagnosisTime = diagnosisTime;
    }

    public String getMedicalDescription() {
        return this.medicalDescription;
    }

    public void setMedicalDescription(String medicalDescription) {
        this.medicalDescription = medicalDescription;
    }

    public String getPwoId() {
        return this.pwoId;
    }

    public void setPwoId(String pwoId) {
        this.pwoId = pwoId;
    }

    public JSON getAttachment() {
        return this.attachment;
    }

    public void setAttachment(JSON attachment) {
        this.attachment = attachment;
    }

    public String getMedicalRawId() {
        return this.medicalRawId;
    }

    public void setMedicalRawId(String medicalRawId) {
        this.medicalRawId = medicalRawId;
    }

    public JSON getParseResult() {
        return this.parseResult;
    }

    public void setParseResult(JSON parseResult) {
        this.parseResult = parseResult;
    }

    public String getParseTemplateId() {
        return this.parseTemplateId;
    }

    public void setParseTemplateId(String parseTemplateId) {
        this.parseTemplateId = parseTemplateId;
    }

    public String getPatientMedicalType() {
        return this.patientMedicalType;
    }

    public void setPatientMedicalType(String patientMedicalType) {
        this.patientMedicalType = patientMedicalType;
    }

    public String getParseTemplateName() {
        return this.parseTemplateName;
    }

    public void setParseTemplateName(String parseTemplateName) {
        this.parseTemplateName = parseTemplateName;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public JSON getDesensitizeAttachment() {
        return this.desensitizeAttachment;
    }

    public void setDesensitizeAttachment(JSON desensitizeAttachment) {
        this.desensitizeAttachment = desensitizeAttachment;
    }

    public Byte getIsTest() {
        return this.isTest;
    }

    public void setIsTest(Byte isTest) {
        this.isTest = isTest;
    }

    public Double getOriginalVersion() {
        return this.originalVersion;
    }

    public void setOriginalVersion(Double originalVersion) {
        this.originalVersion = originalVersion;
    }

    public Double getCurrentVersion() {
        return this.currentVersion;
    }

    public void setCurrentVersion(Double currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PatientMedicalRecord (");

        sb.append(id);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(revision);
        sb.append(", ").append(deleted);
        sb.append(", ").append(patientId);
        sb.append(", ").append(medicalType);
        sb.append(", ").append(diagnosisTime);
        sb.append(", ").append(medicalDescription);
        sb.append(", ").append(pwoId);
        sb.append(", ").append(attachment);
        sb.append(", ").append(medicalRawId);
        sb.append(", ").append(parseResult);
        sb.append(", ").append(parseTemplateId);
        sb.append(", ").append(patientMedicalType);
        sb.append(", ").append(parseTemplateName);
        sb.append(", ").append(teamId);
        sb.append(", ").append(desensitizeAttachment);
        sb.append(", ").append(isTest);
        sb.append(", ").append(originalVersion);
        sb.append(", ").append(currentVersion);

        sb.append(")");
        return sb.toString();
    }
}
