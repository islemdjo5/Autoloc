package tn.esprit.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domaine.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
