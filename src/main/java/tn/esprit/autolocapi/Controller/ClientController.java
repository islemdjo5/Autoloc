package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Client;
import tn.esprit.autolocapi.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientController {
    private final IClientService iClientService;

    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return iClientService.ajouterClient(client);
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client) {
        return iClientService.modifierClient(client);
    }

    @GetMapping("/getALLClients")
    public List<Client> getALLClients() {
        return iClientService.getALLClients();
    }

    @GetMapping("/getClientById/{id}")
    public Client getClientById(@PathVariable Long id) {
        return iClientService.findClientById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimerClientById(@PathVariable Long id) {
        iClientService.supprimerClientById(id);
    }
}
