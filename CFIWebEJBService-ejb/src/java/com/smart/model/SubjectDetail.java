/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.model;

/**
 *
 * @author Administrator
 */
public class SubjectDetail {

    private String CRN;
    private String SubjectCode;
    private String CompetencyName;
    private String StartDate;
    private String EndDate;
    private String DayOfWeek;
    private String Time;
    private String Lecturer;
    private String Campus;
    private String Room;

    public String getRoom() {
        return Room;
    }

    public void setRoom(String Room) {
        this.Room = Room;
    }

    public String getCRN() {
        return CRN;
    }

    public void setCRN(String CRN) {
        this.CRN = CRN;
    }

        public String getSubjectCode() {
        return SubjectCode;
    }

    public void setSubjectCode(String SubjectCode) {
        this.SubjectCode = SubjectCode;
    }
    
    public String getCompetencyName() {
        return CompetencyName;
    }

    public void setCompetencyName(String CompetencyName) {
        this.CompetencyName = CompetencyName;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getDayOfWeek() {
        return DayOfWeek;
    }

    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public void setLecturer(String Lecturer) {
        this.Lecturer = Lecturer;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }
}
