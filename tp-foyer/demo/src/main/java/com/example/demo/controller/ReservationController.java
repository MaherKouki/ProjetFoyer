package com.example.demo.controller;


import com.example.demo.entity.Foyer;
import com.example.demo.entity.Reservation;
import com.example.demo.service.ReservationService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {

    ReservationService reservationService;

    @PostMapping("/save")
    public Reservation save (@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }

    @GetMapping("/get-all-reservation")
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }

    @DeleteMapping("/delete-reservation/{idReservation}")
    public void delete(@PathParam("idReservation")String idReservation){
        reservationService.delete(idReservation);
    }

    @GetMapping("get-reservation/{idReservation}")
    public Reservation findById(@PathParam("idReservation") String idReservation){
        return reservationService.findById(idReservation);
    }


    //http://localhost:8082/reservation/AddEtudToReserv/A/2
    @PostMapping("/AddEtudToReserv/{reservationId}/{etudiantId}")
    public void addEtudiantToReservation(@PathVariable String reservationId, @PathVariable Long etudiantId) {
        reservationService.addEtudiantToReservation(reservationId, etudiantId);
    }


}
