package web4si;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom Verhoof
 */

public interface ActionDemandeRessource extends JpaRepository<ActionDemande, Long>
{
    /*
    @Query("SELECT demande, "
            + " idActionDemande, nomAction, personne, etatAction, dateAction FROM"
            + " ActionDemande "
            + " WHERE Action.demande = ?1")
    ArrayList<ActionDemande> findByDemandeID(Long id); */
}
