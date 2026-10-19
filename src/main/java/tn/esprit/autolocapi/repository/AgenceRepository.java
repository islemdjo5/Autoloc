package tn.esprit.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domaine.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
