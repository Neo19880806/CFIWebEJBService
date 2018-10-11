/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.entities;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "tblsubjectcompetencies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblsubjectcompetencies.findAll", query = "SELECT t FROM Tblsubjectcompetencies t")
    , @NamedQuery(name = "Tblsubjectcompetencies.findByITSubject", query = "SELECT t FROM Tblsubjectcompetencies t WHERE t.tblsubjectcompetenciesPK.iTSubject = :iTSubject")
    , @NamedQuery(name = "Tblsubjectcompetencies.findByCourseNumber", query = "SELECT t FROM Tblsubjectcompetencies t WHERE t.tblsubjectcompetenciesPK.courseNumber = :courseNumber")
    , @NamedQuery(name = "Tblsubjectcompetencies.findByBridgingUnit", query = "SELECT t FROM Tblsubjectcompetencies t WHERE t.bridgingUnit = :bridgingUnit")})
public class Tblsubjectcompetencies implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TblsubjectcompetenciesPK tblsubjectcompetenciesPK;
    @Column(name = "BridgingUnit")
    private Boolean bridgingUnit;

    public Tblsubjectcompetencies() {
    }

    public Tblsubjectcompetencies(TblsubjectcompetenciesPK tblsubjectcompetenciesPK) {
        this.tblsubjectcompetenciesPK = tblsubjectcompetenciesPK;
    }

    public Tblsubjectcompetencies(String iTSubject, String courseNumber) {
        this.tblsubjectcompetenciesPK = new TblsubjectcompetenciesPK(iTSubject, courseNumber);
    }

    public TblsubjectcompetenciesPK getTblsubjectcompetenciesPK() {
        return tblsubjectcompetenciesPK;
    }

    public void setTblsubjectcompetenciesPK(TblsubjectcompetenciesPK tblsubjectcompetenciesPK) {
        this.tblsubjectcompetenciesPK = tblsubjectcompetenciesPK;
    }

    public Boolean getBridgingUnit() {
        return bridgingUnit;
    }

    public void setBridgingUnit(Boolean bridgingUnit) {
        this.bridgingUnit = bridgingUnit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tblsubjectcompetenciesPK != null ? tblsubjectcompetenciesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblsubjectcompetencies)) {
            return false;
        }
        Tblsubjectcompetencies other = (Tblsubjectcompetencies) object;
        if ((this.tblsubjectcompetenciesPK == null && other.tblsubjectcompetenciesPK != null) || (this.tblsubjectcompetenciesPK != null && !this.tblsubjectcompetenciesPK.equals(other.tblsubjectcompetenciesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smart.entities.Tblsubjectcompetencies[ tblsubjectcompetenciesPK=" + tblsubjectcompetenciesPK + " ]";
    }
    
}
