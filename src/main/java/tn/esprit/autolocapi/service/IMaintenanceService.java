package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    public Maintenance ajouterMaintenance(Maintenance maintenance);
    public Maintenance modifierMaintenance(Maintenance maintenance);
    public Maintenance findMaintenanceById(Long id);
    public List<Maintenance> getALLMaintenances();
    public void supprimerMaintenanceById(Long id);
}
