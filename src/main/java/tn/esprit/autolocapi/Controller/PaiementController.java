package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Paiement;
import tn.esprit.autolocapi.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiements")
public class PaiementController {
    private final IPaiementService iPaiementService;

    @PostMapping("/ajouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return iPaiementService.ajouterPaiement(paiement);
    }

    @PutMapping("/modifierPaiement")
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return iPaiementService.modifierPaiement(paiement);
    }

    @GetMapping("/getALLPaiements")
    public List<Paiement> getALLPaiements() {
        return iPaiementService.getALLPaiements();
    }

    @GetMapping("/getPaiementById/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return iPaiementService.findPaiementById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimerPaiementById(@PathVariable Long id) {
        iPaiementService.supprimerPaiementById(id);
    }
}
