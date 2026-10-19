package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domaine.Reservation;
import tn.esprit.autolocapi.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {
    private final IReservationService iReservationService;

    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return iReservationService.ajouterReservation(reservation);
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return iReservationService.modifierReservation(reservation);
    }

    @GetMapping("/getALLReservations")
    public List<Reservation> getALLReservations() {
        return iReservationService.getALLReservations();
    }

    @GetMapping("/getReservationById/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return iReservationService.findReservationById(id);
    }

    @DeleteMapping("/{id}")
    public void supprimerReservationById(@PathVariable Long id) {
        iReservationService.supprimerReservationById(id);
    }
}
