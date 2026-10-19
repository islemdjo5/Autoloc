package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Vehicule;

import java.util.List;

public interface IVehiculeService  {
    public Vehicule ajouterVehicule(Vehicule vehicule);
    public Vehicule modifierVehicule(Vehicule vehicule);
    public Vehicule findVehiculeById(Long id);
    public List<Vehicule> getALLVehicules();
    public void supprimerVehiculeById(Long id);




}
