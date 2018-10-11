/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Embeddable
public class TblsubjectcompetenciesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ITSubject")
    private String iTSubject;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CourseNumber")
    private String courseNumber;

    public TblsubjectcompetenciesPK() {
    }

    public TblsubjectcompetenciesPK(String iTSubject, String courseNumber) {
        this.iTSubject = iTSubject;
        this.courseNumber = courseNumber;
    }

    public String getITSubject() {
        return iTSubject;
    }

    public void setITSubject(String iTSubject) {
        this.iTSubject = iTSubject;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iTSubject != null ? iTSubject.hashCode() : 0);
        hash += (courseNumber != null ? courseNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblsubjectcompetenciesPK)) {
            return false;
        }
        TblsubjectcompetenciesPK other = (TblsubjectcompetenciesPK) object;
        if ((this.iTSubject == null && other.iTSubject != null) || (this.iTSubject != null && !this.iTSubject.equals(other.iTSubject))) {
            return false;
        }
        if ((this.courseNumber == null && other.courseNumber != null) || (this.courseNumber != null && !this.courseNumber.equals(other.courseNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smart.entities.TblsubjectcompetenciesPK[ iTSubject=" + iTSubject + ", courseNumber=" + courseNumber + " ]";
    }
    
}
