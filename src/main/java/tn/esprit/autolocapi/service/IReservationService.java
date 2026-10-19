package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domaine.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation ajouterReservation(Reservation reservation);
    public Reservation modifierReservation(Reservation reservation);
    public Reservation findReservationById(Long id);
    public List<Reservation> getALLReservations();
    public void supprimerReservationById(Long id);
}
