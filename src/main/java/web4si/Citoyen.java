/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

/**
 *
 * @author aazri
 */
public class Citoyen 
{
    
    // Attributs
    
    
    private int idCitoyen;
    private String nomCitoyen;
    private String prenomCitoyen;
    private String adresseCitoyen;
    
    
    // Propriétés
    
    
    public int getIdCitoyen() {
        return this.idCitoyen;
    }

    public void setIdCitoyen(int idCitoyen) {
        this.idCitoyen = idCitoyen;
    }

    public String getNomCitoyen() {
        return this.nomCitoyen;
    }

    public void setNomCitoyen(String nomCitoyen) {
        this.nomCitoyen = nomCitoyen;
    }

    public String getPrenomCitoyen() {
        return this.prenomCitoyen;
    }

    public void setPrenomCitoyen(String prenomCitoyen) {
        this.prenomCitoyen = prenomCitoyen;
    }

    public String getAdresseCitoyen() {
        return this.adresseCitoyen;
    }

    public void setAdresseCitoyen(String adresseCitoyen) {
        this.adresseCitoyen = adresseCitoyen;
    }
    
    
    // Constructeurs
    
    public Citoyen() {} // JPA !!
    

    public Citoyen(int idCitoyen, String nomCitoyen, String prenomCitoyen, String adresseCitoyen) {
        this.idCitoyen = idCitoyen;
        this.nomCitoyen = nomCitoyen;
        this.prenomCitoyen = prenomCitoyen;
        this.adresseCitoyen = adresseCitoyen;
    }    
}