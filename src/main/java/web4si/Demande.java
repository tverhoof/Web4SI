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

public class Demande 
{
        
    // Attributs
 
    
    private int idDemande;
    private String descriptionDemande;
    private Citoyen citoyen;
    private Demande demande;
    
    
    // Propriétés
    
    
    public int getIdDemande() {
        return this.idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public String getDescriptionDemande() {
        return this.descriptionDemande;
    }

    public void setDescriptionDemande(String descriptionDemande) {
        this.descriptionDemande = descriptionDemande;
    }

    public Citoyen getCitoyen() {
        return this.citoyen;
    }

    public void setCitoyen(Citoyen citoyen) {
        this.citoyen = citoyen;
    }

    public Demande getDemande() {
        return this.demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }
    
    
    // Constructeur
    
    
    public Demande() {}  // JPA

    
}
