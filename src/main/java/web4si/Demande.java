/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

import java.util.ArrayList;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
    @Column(name = "idDemande")
    private Long idDemande;
    private String descriptionDemande;
    private String etat;
    private String nom;
    private String prenom;
    private String adresse;
    
    
    @OneToMany(mappedBy = "demande")
    private Set<ActionDemande> actiondemandes;
    
    
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
    
    public String getEtat() { return this.etat; }
    
    public void setEtat(String etat) { this.etat = etat; }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }    
    
    
    // Constructeur
    
    
    public Demande() {}  // JPA

    
}
