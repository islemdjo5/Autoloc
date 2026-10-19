package tn.esprit.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domaine.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
