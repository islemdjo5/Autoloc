package tn.esprit.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domaine.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
