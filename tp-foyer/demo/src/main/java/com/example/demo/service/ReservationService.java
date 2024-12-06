package com.example.demo.service;

import com.example.demo.entity.Foyer;
import com.example.demo.entity.Reservation;

import java.util.List;


public interface ReservationService {

    Reservation save(Reservation reservation);

    Reservation findById(String idReservation);

    List<Reservation> findAll();

    void delete(String idReservation);

    void addEtudiantToReservation(String reservationId, Long etudiantId);
}
