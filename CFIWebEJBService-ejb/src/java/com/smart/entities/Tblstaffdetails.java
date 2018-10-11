/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "tblstaffdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblstaffdetails.findAll", query = "SELECT t FROM Tblstaffdetails t")
    , @NamedQuery(name = "Tblstaffdetails.findByInstructorID", query = "SELECT t FROM Tblstaffdetails t WHERE t.instructorID = :instructorID")
    , @NamedQuery(name = "Tblstaffdetails.findByShortName", query = "SELECT t FROM Tblstaffdetails t WHERE t.shortName = :shortName")
    , @NamedQuery(name = "Tblstaffdetails.findByUniqueName", query = "SELECT t FROM Tblstaffdetails t WHERE t.uniqueName = :uniqueName")
    , @NamedQuery(name = "Tblstaffdetails.findByHpi", query = "SELECT t FROM Tblstaffdetails t WHERE t.hpi = :hpi")
    , @NamedQuery(name = "Tblstaffdetails.findByHomeCampus", query = "SELECT t FROM Tblstaffdetails t WHERE t.homeCampus = :homeCampus")
    , @NamedQuery(name = "Tblstaffdetails.findByAdmin", query = "SELECT t FROM Tblstaffdetails t WHERE t.admin = :admin")
    , @NamedQuery(name = "Tblstaffdetails.findByEmail", query = "SELECT t FROM Tblstaffdetails t WHERE t.email = :email")
    , @NamedQuery(name = "Tblstaffdetails.findBySFBAddress", query = "SELECT t FROM Tblstaffdetails t WHERE t.sFBAddress = :sFBAddress")})
public class Tblstaffdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "InstructorID")
    private String instructorID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Short_Name")
    private String shortName;
    @Size(max = 255)
    @Column(name = "unique_name")
    private String uniqueName;
    @Column(name = "HPI")
    private Boolean hpi;
    @Size(max = 50)
    @Column(name = "Home_Campus")
    private String homeCampus;
    @Column(name = "Admin")
    private Boolean admin;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 100)
    @Column(name = "SFB_Address")
    private String sFBAddress;

    public Tblstaffdetails() {
    }

    public Tblstaffdetails(String instructorID) {
        this.instructorID = instructorID;
    }

    public Tblstaffdetails(String instructorID, String shortName) {
        this.instructorID = instructorID;
        this.shortName = shortName;
    }

    public String getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public Boolean getHpi() {
        return hpi;
    }

    public void setHpi(Boolean hpi) {
        this.hpi = hpi;
    }

    public String getHomeCampus() {
        return homeCampus;
    }

    public void setHomeCampus(String homeCampus) {
        this.homeCampus = homeCampus;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSFBAddress() {
        return sFBAddress;
    }

    public void setSFBAddress(String sFBAddress) {
        this.sFBAddress = sFBAddress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instructorID != null ? instructorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblstaffdetails)) {
            return false;
        }
        Tblstaffdetails other = (Tblstaffdetails) object;
        if ((this.instructorID == null && other.instructorID != null) || (this.instructorID != null && !this.instructorID.equals(other.instructorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smart.entities.Tblstaffdetails[ instructorID=" + instructorID + " ]";
    }
    
}
