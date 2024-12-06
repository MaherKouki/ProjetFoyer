package com.example.demo.service.impl;

import com.example.demo.Repository.ChambreRepository;
import com.example.demo.Repository.ReservationRepository;
import com.example.demo.entity.Chambre;
import com.example.demo.entity.Reservation;
import com.example.demo.entity.TypeChambre;
import com.example.demo.service.ChambreService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
@Slf4j
public class ChambreServiceImpl implements ChambreService {


    ChambreRepository chambreRepository;
    ReservationRepository reservationRepository;


    @Override
    public Chambre save(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre findById(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }



    @Override

    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    /*@Scheduled(cron = "0 30 8 * * MON,FRI")
    public List<Chambre> findAll() {
        List<Chambre> listC = chambreRepository.findAll();
        for (Chambre chambre : listC) {
            log.info("Chambre: " + chambre);
        }
        return listC;
    }*/

    @Override
    public void delete(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre Modify(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> findAllByTypeC(TypeChambre tc) {
        return chambreRepository.findAllByTypeC(tc);
    }

    @Override
    public Chambre findChambreByNumeroChambre(Long numC) {
        return chambreRepository.findChambreByNumeroChambre(numC);
    }

    @Override
    public Chambre chambreEtudiant(Long cin) {
        return chambreRepository.chambreEtudiant(cin);
    }



    public void affecterReservationChambre(Long idChambre, String idReservation) {
        // Trouver la chambre et la réservation
        Chambre chambre = chambreRepository.findById(idChambre).orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
        Reservation reservation = reservationRepository.findById(idReservation).orElseThrow(() -> new RuntimeException("Réservation non trouvée"));

        // Ajouter la réservation à la chambre
        chambre.getReservation().add(reservation);

        // Sauvegarder la chambre avec la nouvelle réservation
        chambreRepository.save(chambre);
    }
}
