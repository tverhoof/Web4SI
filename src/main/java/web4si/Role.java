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

public class Role 
{
        
    // Attributs
 
    
    private int idRole;
    private String nomRole;
    
    
    // Propriétés

    
    public int getIdRole() {
        return this.idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getNomRole() {
        return this.nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }
            
    
    // Constructeur
    
    
    public Role() {}  // JPA
}
