/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sercandorman.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SercanDorman
 */
@Entity
@Table(name = "table_adresdefteri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdresDefteri.findAll", query = "SELECT e FROM AdresDefteri e")
    , @NamedQuery(name = "AdresDefteri.findByAdSoyad", query = "SELECT e FROM AdresDefteri e WHERE e.adSoyad = :adSoyad")
    , @NamedQuery(name = "AdresDefteri.findByTelefon", query = "SELECT e FROM AdresDefteri e WHERE e.telefon = :telefon")
    , @NamedQuery(name = "AdresDefteri.findByEmail", query = "SELECT e FROM AdresDefteri e WHERE e.email = :email")
    , @NamedQuery(name = "AdresDefteri.findByAdres", query = "SELECT e FROM AdresDefteri e WHERE e.adres = :adres")
    , @NamedQuery(name = "AdresDefteri.findByKayitId", query = "SELECT e FROM AdresDefteri e WHERE e.kayitId = :kayitId")})
public class AdresDefteri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "AD_SOYAD")
    private String adSoyad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 10, max = 11)
    @Column(name = "TELEFON")
    private String telefon;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ADRES")
    private String adres;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "KAYIT_ID")
    private Short kayitId;

    public AdresDefteri() {
    }

    public AdresDefteri(Short kayitId) {

        this.kayitId = kayitId;
    }

    public AdresDefteri(String adSoyad, String telefon, String email, String adres) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.email = email;
        this.adres = adres;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Short getKayitId() {
        return kayitId;
    }

    public void setKayitId(Short kayitId) {
        this.kayitId = kayitId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kayitId != null ? kayitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdresDefteri)) {
            return false;
        }
        AdresDefteri other = (AdresDefteri) object;
        if ((this.kayitId == null && other.kayitId != null) || (this.kayitId != null && !this.kayitId.equals(other.kayitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sercandorman.entity.AdresDefteri[ kayitId=" + kayitId + " ]";
    }

}
