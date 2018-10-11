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
public class TblcrnsessionsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CRN")
    private String crn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Day_of_Week")
    private String dayofWeek;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Time")
    private String time;

    public TblcrnsessionsPK() {
    }

    public TblcrnsessionsPK(String crn, String dayofWeek, String time) {
        this.crn = crn;
        this.dayofWeek = dayofWeek;
        this.time = time;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getDayofWeek() {
        return dayofWeek;
    }

    public void setDayofWeek(String dayofWeek) {
        this.dayofWeek = dayofWeek;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crn != null ? crn.hashCode() : 0);
        hash += (dayofWeek != null ? dayofWeek.hashCode() : 0);
        hash += (time != null ? time.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblcrnsessionsPK)) {
            return false;
        }
        TblcrnsessionsPK other = (TblcrnsessionsPK) object;
        if ((this.crn == null && other.crn != null) || (this.crn != null && !this.crn.equals(other.crn))) {
            return false;
        }
        if ((this.dayofWeek == null && other.dayofWeek != null) || (this.dayofWeek != null && !this.dayofWeek.equals(other.dayofWeek))) {
            return false;
        }
        if ((this.time == null && other.time != null) || (this.time != null && !this.time.equals(other.time))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smart.entities.TblcrnsessionsPK[ crn=" + crn + ", dayofWeek=" + dayofWeek + ", time=" + time + " ]";
    }
    
}
