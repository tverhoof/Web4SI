package web4si;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom Verhoof
 */

public class ChangementEtatDemande 
{
        
    // Attributs
 
    
    private int idChangementED;
    private Date dateExec;
    private boolean actionTerminee;
    private Demande demande;
    private ActionDemande actionDemande;
    private Personne personne;
    
    
    // Propriétés

    
    public int getIdChangementED() {
        return this.idChangementED;
    }

    public void setIdChangementED(int idChangementED) {
        this.idChangementED = idChangementED;
    }

    public Date getDateExec() {
        return this.dateExec;
    }

    public void setDateExec(Date dateExec) {
        this.dateExec = dateExec;
    }

    public boolean isActionTerminee() {
        return this.actionTerminee;
    }

    public void setActionTerminee(boolean actionTerminee) {
        this.actionTerminee = actionTerminee;
    }

    public Demande getDemande() {
        return this.demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public ActionDemande getActionDemande() {
        return this.actionDemande;
    }

    public void setActionDemande(ActionDemande actionDemande) {
        this.actionDemande = actionDemande;
    }

    public Personne getPersonne() {
        return this.personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }    
    
    
    // Constructeur
    
    
    public ChangementEtatDemande() {}  // JPA
}
