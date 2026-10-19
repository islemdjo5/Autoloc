package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Equipement;

import java.util.List;

public interface IEquipementService {
    public Equipement ajouterEquipement(Equipement equipement);
    public Equipement modifierEquipement(Equipement equipement);
    public Equipement findEquipementById(Long id);
    public List<Equipement> getALLEquipements();
    public void supprimerEquipementById(Long id);
}
