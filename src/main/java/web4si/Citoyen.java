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
public class Citoyen {
    int idCitoyen;
    String nomCitoyen;
    String prenomCitoyen;
    String adresseCitoyen;

    public Citoyen(int idCitoyen, String nomCitoyen, String prenomCitoyen, String adresseCitoyen) {
        this.idCitoyen = idCitoyen;
        this.nomCitoyen = nomCitoyen;
        this.prenomCitoyen = prenomCitoyen;
        this.adresseCitoyen = adresseCitoyen;
    }

    public int getIdCitoyen() {
        return idCitoyen;
    }

    public void setIdCitoyen(int idCitoyen) {
        this.idCitoyen = idCitoyen;
    }

    public String getNomCitoyen() {
        return nomCitoyen;
    }

    public void setNomCitoyen(String nomCitoyen) {
        this.nomCitoyen = nomCitoyen;
    }

    public String getPrenomCitoyen() {
        return prenomCitoyen;
    }

    public void setPrenomCitoyen(String prenomCitoyen) {
        this.prenomCitoyen = prenomCitoyen;
    }

    public String getAdresseCitoyen() {
        return adresseCitoyen;
    }

    public void setAdresseCitoyen(String adresseCitoyen) {
        this.adresseCitoyen = adresseCitoyen;
    }
    

}
