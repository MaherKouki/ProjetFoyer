package com.example.demo.service.impl;

import com.example.demo.Repository.EtudiantRepository;
import com.example.demo.Repository.ReservationRepository;
import com.example.demo.entity.Etudiant;
import com.example.demo.entity.Reservation;
import com.example.demo.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    ReservationRepository reservationRepository;
    EtudiantRepository etudiantRepository;

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation findById(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public void delete(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    public void addEtudiantToReservation(String reservationId, Long etudiantId) {

        Reservation reservation = reservationRepository.findById(reservationId).get();
        Etudiant etudiant = etudiantRepository.findById(etudiantId).get();

        reservation.getEtudiant().add(etudiant);

        etudiant.getReservation().add(reservation);

        reservationRepository.save(reservation);
        etudiantRepository.save(etudiant);
    }
}
