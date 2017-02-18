/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Tom Verhoof
 */

@Entity
public class Demande 
{
        
    // Attributs
    
 
    @Id
    @GeneratedValue
    private Long idDemande;
    private String descriptionDemande;
    
    
    // Propriétés
    
    
    public Long getIdDemande() {
        return this.idDemande;
    }

    public void setIdDemande(Long idDemande) {
        this.idDemande = idDemande;
    }

    public String getDescriptionDemande() {
        return this.descriptionDemande;
    }

    public void setDescriptionDemande(String descriptionDemande) {
        this.descriptionDemande = descriptionDemande;
    }
    
    
    // Constructeur
    
    
    public Demande() {}  // JPA

    
}
