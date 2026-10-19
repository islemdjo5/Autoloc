package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Equipement;
import tn.esprit.autolocapi.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipements")
public class EquipementController {
    private final IEquipementService iEquipementService;

    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return iEquipementService.ajouterEquipement(equipement);
    }

    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return iEquipementService.modifierEquipement(equipement);
    }

    @GetMapping("/getALLEquipements")
    public List<Equipement> getALLEquipements() {
        return iEquipementService.getALLEquipements();
    }

    @GetMapping("/getEquipementById/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return iEquipementService.findEquipementById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimerEquipementById(@PathVariable Long id) {
        iEquipementService.supprimerEquipementById(id);
    }
}
