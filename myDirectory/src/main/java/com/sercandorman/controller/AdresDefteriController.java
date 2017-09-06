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
import com.sun.faces.el.ELUtils;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ComponentSystemEvent;

/**
 *
 * @author SercanDorman
 */
@Named(value = "adresDefteriController")
@SessionScoped
public class AdresDefteriController implements Serializable {

    int i = 1;

    @EJB
    private AdresDefteriFacade adresDefteriFacade;
    HtmlInputText myhtml = new HtmlInputText();

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

    public void inputEkle(ComponentSystemEvent event) {
        UIComponent form = event.getComponent();
        UIInput input = new HtmlInputText();
        input.setId("input" + i);
        String id = "input" + i;
        input.setValueExpression(id, ELUtils.createValueExpression("#{item.telefon}", String.class));
        form.getChildren().add(input);
        i++;

    }
}
