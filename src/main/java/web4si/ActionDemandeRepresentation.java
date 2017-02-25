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
@RequestMapping(value="/actions", produces=MediaType.APPLICATION_JSON_VALUE)
@ExposesResourceFor(ActionDemande.class)

public class ActionDemandeRepresentation 
{
    @Autowired
    ActionDemandeRessource fr;
    
    
    @GetMapping
    public ResponseEntity<?>getAllActionDemandes(){
        Iterable<ActionDemande> allActionDemandes = fr.findAll();
        return new ResponseEntity<>(actionDemandeToRessource(allActionDemandes),
                HttpStatus.OK);
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<?> saveActionDemande(@RequestBody ActionDemande formation)
    {
        ActionDemande sauvegarde = fr.save(formation);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(linkTo(ActionDemandeRepresentation.class)
        .slash(sauvegarde.getIDActionDemande())
        .toUri());
        
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/{actionDemandeId}")
    public ResponseEntity<?> updateActionDemande(@RequestBody ActionDemande actionDemande,
            @PathVariable("actionDemandeId") Long id) 
    {
        actionDemande.setIDActionDemande(id);
        ActionDemande d = fr.save(actionDemande);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
      @RequestMapping(method=RequestMethod.GET, value="/{actionDemandeId}")
    public ResponseEntity<?> getOneActionDemande(@PathVariable("actionDemandeId") Long id) {
        return Optional.ofNullable(fr.findOne(id))
                .map(f -> new ResponseEntity<>(actionDemandeToRessource(f, true),
                        HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));            
    }
    
    
    

    
    
    // HATEOS
    
    private Resource<ActionDemande> actionDemandeToRessource(ActionDemande actionDemande,
            Boolean isCollection) {
        
        Link selfLink = linkTo(ActionDemandeRepresentation.class)
                .slash(actionDemande.getIDActionDemande())
                .withSelfRel();
        
        if (isCollection)
        {
            Link collectionLink = linkTo(methodOn(ActionDemandeRepresentation.class)
                .getAllActionDemandes())
                .withRel("collection");
            
            return new Resource<>(actionDemande, selfLink, collectionLink);
        }
        else return new Resource<>(actionDemande, selfLink);        
    }
    
    private Resources<Resource<ActionDemande>> actionDemandeToRessource(
            Iterable<ActionDemande> actionDemandes)
    {
        Link selfLink = linkTo(methodOn(ActionDemandeRepresentation.class)
            .getAllActionDemandes())
            .withSelfRel();
        
        List<Resource<ActionDemande>> listActionDemandes = new ArrayList();
        actionDemandes.forEach(actionDemande -> listActionDemandes
                .add(actionDemandeToRessource(actionDemande, false)));
        
        return new Resources<>(listActionDemandes, selfLink);
    }
}
