/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sercandorman.model;

import com.sercandorman.entity.AdresDefteri;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SercanDorman
 */
@Named
@Stateless
public class AdresDefteriFacade extends AbstractFacade<AdresDefteri> {

    @PersistenceContext(unitName = "com.sercandorman_myDirectory_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdresDefteriFacade() {
        super(AdresDefteri.class);
    }
}
