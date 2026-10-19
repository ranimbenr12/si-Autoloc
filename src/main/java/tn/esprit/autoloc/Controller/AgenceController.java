package tn.esprit.autoloc.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Service.IAgenceService;
import tn.esprit.autoloc.domain.Agence;
import java.util.List;

@RestController
@RequestMapping("/api/agences")
public class AgenceController {

    private final IAgenceService agenceService;

    public AgenceController(IAgenceService agenceService) {
        this.agenceService = agenceService;
    }

    @PostMapping
    public Agence ajouter(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping
    public Agence modifier(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @GetMapping("/{id}")
    public Agence obtenir(@PathVariable Long id) {
        return agenceService.afficherAgenceById(id);
    }

    @GetMapping
    public List<Agence> lister() {
        return agenceService.listerAgences();
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        agenceService.supprimerAgence(id);
    }
}