/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Tom Verhoof
 */

@Entity
public class ActionDemande 
{
    
    // Attributs
 
    @Id
    @GeneratedValue
    private Long actionDemande;
    
    @Column(length=30)
    private String nomAction;
    
    
    // Propriétés
    
    
    public Long getActionDemande() {
        return this.actionDemande;
    }

    public void setActionDemande(Long actionDemande) {
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
