/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.hateoas.Resource;

/**
 *
 * @author Tom Verhoof
 */

public interface DemandeRessource extends JpaRepository<Demande, Long>
{
    @Query("SELECT idDemande, descriptionDemande, etat FROM Demande WHERE etat = ?1")
    ArrayList<Demande> findByEtat(String etat);
}
