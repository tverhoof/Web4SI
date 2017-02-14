/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

/**
 *
 * @author Tom Verhoof
 */

public class ActionDemande 
{
    
    // Attributs
 
    
    private int actionDemande;
    private String nomAction;
    
    
    // Propriétés
    
    
    public int getActionDemande() {
        return this.actionDemande;
    }

    public void setActionDemande(int actionDemande) {
        this.actionDemande = actionDemande;
    }

    public String getNomAction() {
        return this.nomAction;
    }
    
    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }
    
    
    // Constructeur
    
    
    public ActionDemande() {}  // JPA
}
