/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sercandorman.controller;

import com.sercandorman.model.AdresDefteriFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import com.sercandorman.entity.*;
import javax.faces.application.Application;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.component.html.HtmlForm;

/**
 *
 * @author SercanDorman
 */
@Named(value = "adresDefteriController")
@SessionScoped
public class AdresDefteriController implements Serializable {

    @EJB
    private AdresDefteriFacade adresDefteriFacade;

    private AdresDefteri adresDefteri = new AdresDefteri();

    public AdresDefteri getAdresDefteri() {
        return adresDefteri;
    }

    public void setAdresDefteri(AdresDefteri adresDefteri) {
        this.adresDefteri = adresDefteri;
    }

    public AdresDefteriController() {
    }

    public List<AdresDefteri> findAll() {
        return this.adresDefteriFacade.findAll();
    }

    public String ekle() {
        this.adresDefteriFacade.create(this.adresDefteri);
        this.adresDefteri = new AdresDefteri();
        return "goruntule?faces-redirect=true";
    }

    public void sil(AdresDefteri ad) {
        this.adresDefteriFacade.remove(ad);
    }

    public String duzenle(AdresDefteri ad) {
        this.adresDefteri = ad;
        return "duzenle.xhtml?faces-redirect=true";
    }

    public String duzenle() {
        this.adresDefteriFacade.edit(this.adresDefteri);
        this.adresDefteri = new AdresDefteri();
        return "goruntule?faces-redirect=true";
    }
    Application application = FacesContext.getCurrentInstance().getApplication();

}
