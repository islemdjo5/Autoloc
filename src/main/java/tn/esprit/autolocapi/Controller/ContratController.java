package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Contrat;
import tn.esprit.autolocapi.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrats")
public class ContratController {
    private final IContratService iContratService;

    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return iContratService.ajouterContrat(contrat);
    }

    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return iContratService.modifierContrat(contrat);
    }

    @GetMapping("/getALLContrats")
    public List<Contrat> getALLContrats() {
        return iContratService.getALLContrats();
    }

    @GetMapping("/getContratById/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return iContratService.findContratById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimerContratById(@PathVariable Long id) {
        iContratService.supprimerContratById(id);
    }
}
