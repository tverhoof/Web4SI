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

public class DemandeApprobation 
{
        
    // Attributs
 
    
    private int idDemAppro;
    private boolean traitee;
    private boolean approuvee;
    private Personne personne;
    
    
    // Propriétés

    
    public int getIdDemAppro() {
        return this.idDemAppro;
    }

    public void setIdDemAppro(int idDemAppro) {
        this.idDemAppro = idDemAppro;
    }

    public boolean isTraitee() {
        return this.traitee;
    }

    public void setTraitee(boolean traitee) {
        this.traitee = traitee;
    }

    public boolean isApprouvee() {
        return this.approuvee;
    }

    public void setApprouvee(boolean approuvee) {
        this.approuvee = approuvee;
    }

    public Personne getPersonne() {
        return this.personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    
       
    // Constructeur
    
    
    public DemandeApprobation() {}  // JPA
}