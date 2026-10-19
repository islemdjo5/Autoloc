package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Client;

import java.util.List;

public interface IClientService {
    public Client ajouterClient(Client client);
    public Client modifierClient(Client client);
    public Client findClientById(Long id);
    public List<Client> getALLClients();
    public void supprimerClientById(Long id);
}
