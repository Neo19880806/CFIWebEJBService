/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "tblcrnsessions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcrnsessions.findAll", query = "SELECT t FROM Tblcrnsessions t")
    , @NamedQuery(name = "Tblcrnsessions.findByCrn", query = "SELECT t FROM Tblcrnsessions t WHERE t.tblcrnsessionsPK.crn = :crn")
    , @NamedQuery(name = "Tblcrnsessions.findByDayofWeek", query = "SELECT t FROM Tblcrnsessions t WHERE t.tblcrnsessionsPK.dayofWeek = :dayofWeek")
    , @NamedQuery(name = "Tblcrnsessions.findByTime", query = "SELECT t FROM Tblcrnsessions t WHERE t.tblcrnsessionsPK.time = :time")})
public class Tblcrnsessions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TblcrnsessionsPK tblcrnsessionsPK;

    public Tblcrnsessions() {
    }

    public Tblcrnsessions(TblcrnsessionsPK tblcrnsessionsPK) {
        this.tblcrnsessionsPK = tblcrnsessionsPK;
    }

    public Tblcrnsessions(String crn, String dayofWeek, String time) {
        this.tblcrnsessionsPK = new TblcrnsessionsPK(crn, dayofWeek, time);
    }

    public TblcrnsessionsPK getTblcrnsessionsPK() {
        return tblcrnsessionsPK;
    }

    public void setTblcrnsessionsPK(TblcrnsessionsPK tblcrnsessionsPK) {
        this.tblcrnsessionsPK = tblcrnsessionsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tblcrnsessionsPK != null ? tblcrnsessionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcrnsessions)) {
            return false;
        }
        Tblcrnsessions other = (Tblcrnsessions) object;
        if ((this.tblcrnsessionsPK == null && other.tblcrnsessionsPK != null) || (this.tblcrnsessionsPK != null && !this.tblcrnsessionsPK.equals(other.tblcrnsessionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smart.entities.Tblcrnsessions[ tblcrnsessionsPK=" + tblcrnsessionsPK + " ]";
    }
    
}
