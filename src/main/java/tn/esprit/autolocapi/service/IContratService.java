package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Contrat;

import java.util.List;

public interface IContratService {
    public Contrat ajouterContrat(Contrat contrat);
    public Contrat modifierContrat(Contrat contrat);
    public Contrat findContratById(Long id);
    public List<Contrat> getALLContrats();
    public void supprimerContratById(Long id);
}
