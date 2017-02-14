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

public class EtatDemande 
{
        
    // Attributs
 
    
    private int idEtat;
    private String nomEtat;
    private String descriptionEtat;
    
    
    // Propriétés

    
    public int getIdEtat() {
        return this.idEtat;
    }

    public void setIdEtat(int idEtat) {
        this.idEtat = idEtat;
    }

    public String getNomEtat() {
        return this.nomEtat;
    }

    public void setNomEtat(String nomEtat) {
        this.nomEtat = nomEtat;
    }

    public String getDescriptionEtat() {
        return this.descriptionEtat;
    }

    public void setDescriptionEtat(String descriptionEtat) {
        this.descriptionEtat = descriptionEtat;
    }
    
    
    
    
    
    // Constructeur
    
    
    public EtatDemande() {}  // JPA
}
