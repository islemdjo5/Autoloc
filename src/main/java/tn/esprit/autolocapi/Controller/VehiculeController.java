package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicules")
public class VehiculeController {
    private final IVehiculeService iVehiculeService;
    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return iVehiculeService.ajouterVehicule(vehicule);
    }
    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return iVehiculeService.modifierVehicule(vehicule);
    }
    @GetMapping("/getALLVehicules")
    public List<Vehicule> getALLVehicules(){
        return iVehiculeService.getALLVehicules();

    }
    @GetMapping("/getVehiculeById/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return iVehiculeService.findVehiculeById(id);
    }
    @DeleteMapping("/{id}")
    public void supprimervehiculebyid(@PathVariable Long id){
        iVehiculeService.supprimerVehiculeById(id);
    }

}
