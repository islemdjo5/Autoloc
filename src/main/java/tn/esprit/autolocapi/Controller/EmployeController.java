package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Employe;
import tn.esprit.autolocapi.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employes")
public class EmployeController {
    private final IEmployeService iEmployeService;

    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return iEmployeService.ajouterEmploye(employe);
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return iEmployeService.modifierEmploye(employe);
    }

    @GetMapping("/getALLEmployes")
    public List<Employe> getALLEmployes() {
        return iEmployeService.getALLEmployes();
    }

    @GetMapping("/getEmployeById/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return iEmployeService.findEmployeById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimerEmployeById(@PathVariable Long id) {
        iEmployeService.supprimerEmployeById(id);
    }
}
