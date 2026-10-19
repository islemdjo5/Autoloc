package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Agence;

import java.util.List;

public interface IAgenceService {
    public Agence ajouterAgence(Agence agence);
    public Agence modifierAgence(Agence agence);
    public Agence findAgenceById(Long id);
    public List<Agence> getALLAgences();
    public void supprimerAgenceById(Long id);
}
