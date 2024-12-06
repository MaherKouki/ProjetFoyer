package com.example.demo.Repository;

import com.example.demo.entity.Bloc;
import com.example.demo.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {

    //void addEtudiantToReservation(String reservationId, Long etudiantId);
}
