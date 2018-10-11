/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "tblsiscrns_sr004_2018_s2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblsiscrnsSr0042018S2.findAll", query = "SELECT t FROM TblsiscrnsSr0042018S2 t")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByCrn", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.crn = :crn")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByCampus", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.campus = :campus")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByDepartment", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.department = :department")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByCourseCode", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.courseCode = :courseCode")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByCourseTitle", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.courseTitle = :courseTitle")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByMeetingStartDate", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.meetingStartDate = :meetingStartDate")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByMeetingFinishDate", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.meetingFinishDate = :meetingFinishDate")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByDurationUnits", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.durationUnits = :durationUnits")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByDuration", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.duration = :duration")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByRoom", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.room = :room")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByLecturerID", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.lecturerID = :lecturerID")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByInstructionalMethod", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.instructionalMethod = :instructionalMethod")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByDisplayonInternet", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.displayonInternet = :displayonInternet")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByCrossListIdentifier", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.crossListIdentifier = :crossListIdentifier")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByRegistrationMax", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.registrationMax = :registrationMax")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByRegistrationActual", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.registrationActual = :registrationActual")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByFreezeDate", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.freezeDate = :freezeDate")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByImportDate", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.importDate = :importDate")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByRegistrationCounselling", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.registrationCounselling = :registrationCounselling")
    , @NamedQuery(name = "TblsiscrnsSr0042018S2.findByFull", query = "SELECT t FROM TblsiscrnsSr0042018S2 t WHERE t.full = :full")})
public class TblsiscrnsSr0042018S2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CRN")
    private String crn;
    @Size(max = 20)
    @Column(name = "Campus")
    private String campus;
    @Size(max = 150)
    @Column(name = "Department")
    private String department;
    @Size(max = 255)
    @Column(name = "Course Code")
    private String courseCode;
    @Size(max = 255)
    @Column(name = "Course Title")
    private String courseTitle;
    @Size(max = 20)
    @Column(name = "Meeting Start Date")
    private String meetingStartDate;
    @Size(max = 20)
    @Column(name = "Meeting Finish Date")
    private String meetingFinishDate;
    @Size(max = 255)
    @Column(name = "Duration Units")
    private String durationUnits;
    @Size(max = 255)
    @Column(name = "Duration")
    private String duration;
    @Size(max = 20)
    @Column(name = "Room")
    private String room;
    @Size(max = 255)
    @Column(name = "Lecturer ID")
    private String lecturerID;
    @Size(max = 255)
    @Column(name = "Instructional Method")
    private String instructionalMethod;
    @Size(max = 255)
    @Column(name = "Display on Internet")
    private String displayonInternet;
    @Size(max = 255)
    @Column(name = "Cross List Identifier")
    private String crossListIdentifier;
    @Size(max = 255)
    @Column(name = "Registration Max")
    private String registrationMax;
    @Size(max = 255)
    @Column(name = "Registration Actual")
    private String registrationActual;
    @Size(max = 255)
    @Column(name = "Freeze Date")
    private String freezeDate;
    @Column(name = "ImportDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date importDate;
    @Column(name = "RegistrationCounselling")
    private Integer registrationCounselling;
    @Column(name = "Full")
    private Boolean full;

    public TblsiscrnsSr0042018S2() {
    }

    public TblsiscrnsSr0042018S2(String crn) {
        this.crn = crn;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getMeetingStartDate() {
        return meetingStartDate;
    }

    public void setMeetingStartDate(String meetingStartDate) {
        this.meetingStartDate = meetingStartDate;
    }

    public String getMeetingFinishDate() {
        return meetingFinishDate;
    }

    public void setMeetingFinishDate(String meetingFinishDate) {
        this.meetingFinishDate = meetingFinishDate;
    }

    public String getDurationUnits() {
        return durationUnits;
    }

    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(String lecturerID) {
        this.lecturerID = lecturerID;
    }

    public String getInstructionalMethod() {
        return instructionalMethod;
    }

    public void setInstructionalMethod(String instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
    }

    public String getDisplayonInternet() {
        return displayonInternet;
    }

    public void setDisplayonInternet(String displayonInternet) {
        this.displayonInternet = displayonInternet;
    }

    public String getCrossListIdentifier() {
        return crossListIdentifier;
    }

    public void setCrossListIdentifier(String crossListIdentifier) {
        this.crossListIdentifier = crossListIdentifier;
    }

    public String getRegistrationMax() {
        return registrationMax;
    }

    public void setRegistrationMax(String registrationMax) {
        this.registrationMax = registrationMax;
    }

    public String getRegistrationActual() {
        return registrationActual;
    }

    public void setRegistrationActual(String registrationActual) {
        this.registrationActual = registrationActual;
    }

    public String getFreezeDate() {
        return freezeDate;
    }

    public void setFreezeDate(String freezeDate) {
        this.freezeDate = freezeDate;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public Integer getRegistrationCounselling() {
        return registrationCounselling;
    }

    public void setRegistrationCounselling(Integer registrationCounselling) {
        this.registrationCounselling = registrationCounselling;
    }

    public Boolean getFull() {
        return full;
    }

    public void setFull(Boolean full) {
        this.full = full;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crn != null ? crn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblsiscrnsSr0042018S2)) {
            return false;
        }
        TblsiscrnsSr0042018S2 other = (TblsiscrnsSr0042018S2) object;
        if ((this.crn == null && other.crn != null) || (this.crn != null && !this.crn.equals(other.crn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smart.entities.TblsiscrnsSr0042018S2[ crn=" + crn + " ]";
    }
    
}
