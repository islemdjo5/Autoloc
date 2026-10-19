package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Paiement;

import java.util.List;

public interface IPaiementService {
    public Paiement ajouterPaiement(Paiement paiement);
    public Paiement modifierPaiement(Paiement paiement);
    public Paiement findPaiementById(Long id);
    public List<Paiement> getALLPaiements();
    public void supprimerPaiementById(Long id);
}
