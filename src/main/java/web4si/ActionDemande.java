/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
    private Long idActionDemande;
    
    @Column(length=30)
    private String nomAction;
    
    private String personne;
    
    private String etatAction;
    
    private Date dateAction;
    
    @ManyToOne
    @JoinColumn(name = "idDemande")
    private Demande demande;
    
    
    // Propriétés
    
    
    public Long getIDActionDemande() {
        return this.idActionDemande;
    }

    public void setIDActionDemande(Long actionDemande) {
        this.idActionDemande = actionDemande;
    }

    public String getNomAction() {
        return this.nomAction;
    }
    
    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }
    
    public String getPersonne() {
        return this.personne;
    }

    public void setPersonne(String personne) {
        this.personne = personne;
    }

    public String getEtatAction() {
        return this.etatAction;
    }

    public void setEtatAction(String etatAction) {
        this.etatAction = etatAction;
    }

    public Date getDateAction() {
        return this.dateAction;
    }

    public void setDateAction(Date dateAction) {
        this.dateAction = dateAction;
    }
    
    public Demande getDemande() { return this.demande; }
    
    public void setDemande(Demande dmd) { this.demande = dmd; }
    
    // Constructeur
    
    
    public ActionDemande() {}  // JPA
}
