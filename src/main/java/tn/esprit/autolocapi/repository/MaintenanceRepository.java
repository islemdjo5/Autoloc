package tn.esprit.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domaine.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
