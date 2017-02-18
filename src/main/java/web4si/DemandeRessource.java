/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tom Verhoof
 */

public interface DemandeRessource extends JpaRepository<Demande, Long>
{
    
}
