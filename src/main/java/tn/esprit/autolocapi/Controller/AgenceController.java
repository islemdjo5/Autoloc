package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Agence;
import tn.esprit.autolocapi.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agences")
public class AgenceController {
    private final IAgenceService iAgenceService;

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return iAgenceService.ajouterAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return iAgenceService.modifierAgence(agence);
    }

    @GetMapping("/getALLAgences")
    public List<Agence> getALLAgences() {
        return iAgenceService.getALLAgences();
    }

    @GetMapping("/getAgenceById/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return iAgenceService.findAgenceById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimerAgenceById(@PathVariable Long id) {
        iAgenceService.supprimerAgenceById(id);
    }
}
