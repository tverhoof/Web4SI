/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web4si;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tom Verhoof
 */

@RestController
@RequestMapping(value="/demandes", produces=MediaType.APPLICATION_JSON_VALUE)
@ExposesResourceFor(Demande.class)
public class DemandeRepresentation 
{
    @Autowired
    DemandeRessource fr;    
    
    @GetMapping
    public ResponseEntity<?>getAllDemandes(){
        Iterable<Demande> allDemandes = fr.findAll();
        return new ResponseEntity<>(demandeToRessource(allDemandes),
                HttpStatus.OK);
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/{demandeId}")
    public ResponseEntity<?> getOneDemande(@PathVariable("demandeId") Long id) {
        return Optional.ofNullable(fr.findOne(id))
                .map(f -> new ResponseEntity<>(demandeToRessource(f, true),
                        HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));            
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/etat/{demandeEtat}")
    public ResponseEntity<?> getDemandesAvecEtat(@PathVariable("demandeEtat") String etat) 
    {        
        return new ResponseEntity<>(fr.findByEtat(etat), HttpStatus.OK);
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<?> saveDemande(@RequestBody Demande formation)
    {
        Demande sauvegarde = fr.save(formation);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(linkTo(DemandeRepresentation.class)
        .slash(sauvegarde.getIdDemande())
        .toUri());
        
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/{demandeId}")
    public ResponseEntity<?> updateDemande(@RequestBody Demande demande,
            @PathVariable("demandeId") Long id) 
    {
        demande.setIdDemande(id);
        Demande d = fr.save(demande);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/{demandeId}")
    public ResponseEntity<?> deleteOneDemande(@PathVariable("demandeId") Long id) {
        return Optional.ofNullable(fr.findOne(id))
                .map(f -> new ResponseEntity<>(demandeToRessource(f, true),
                        HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));            
    }
    
    // HATEOS
    
    private Resource<Demande> demandeToRessource(Demande demande,
            Boolean isCollection) {
        
        Link selfLink = linkTo(DemandeRepresentation.class)
                .slash(demande.getIdDemande())
                .withSelfRel();
        
        if (isCollection)
        {
            Link collectionLink = linkTo(methodOn(DemandeRepresentation.class)
                .getAllDemandes())
                .withRel("collection");
            
            return new Resource<>(demande, selfLink, collectionLink);
        }
        else return new Resource<>(demande, selfLink);        
    }
    
    private Resources<Resource<Demande>> demandeToRessource(
            Iterable<Demande> demandes)
    {
        Link selfLink = linkTo(methodOn(DemandeRepresentation.class)
            .getAllDemandes())
            .withSelfRel();
        
        List<Resource<Demande>> listDemandes = new ArrayList();
        demandes.forEach(demande -> listDemandes
                .add(demandeToRessource(demande, false)));
        
        return new Resources<>(listDemandes, selfLink);
    }
}