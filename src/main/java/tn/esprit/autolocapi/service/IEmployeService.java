package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Employe;

import java.util.List;

public interface IEmployeService {
    public Employe ajouterEmploye(Employe employe);
    public Employe modifierEmploye(Employe employe);
    public Employe findEmployeById(Long id);
    public List<Employe> getALLEmployes();
    public void supprimerEmployeById(Long id);
}
