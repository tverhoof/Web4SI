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

public class Personne 
{
        
    // Attributs
 
    
    private int idPersonne;
    private String nomPersonne;
    private String employeur;
    private Role role;
    
    
    // Propriétés

    
    public int getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNomPersonne() {
        return this.nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getEmployeur() {
        return this.employeur;
    }

    public void setEmployeur(String employeur) {
        this.employeur = employeur;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
    // Constructeur
    
    
    public Personne() {}  // JPA
}
