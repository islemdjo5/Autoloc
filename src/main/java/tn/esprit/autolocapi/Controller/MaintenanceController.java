package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Maintenance;
import tn.esprit.autolocapi.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenances")
public class MaintenanceController {
    private final IMaintenanceService iMaintenanceService;

    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return iMaintenanceService.ajouterMaintenance(maintenance);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return iMaintenanceService.modifierMaintenance(maintenance);
    }

    @GetMapping("/getALLMaintenances")
    public List<Maintenance> getALLMaintenances() {
        return iMaintenanceService.getALLMaintenances();
    }

    @GetMapping("/getMaintenanceById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return iMaintenanceService.findMaintenanceById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimerMaintenanceById(@PathVariable Long id) {
        iMaintenanceService.supprimerMaintenanceById(id);
    }
}
