package tn.esprit.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domaine.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
