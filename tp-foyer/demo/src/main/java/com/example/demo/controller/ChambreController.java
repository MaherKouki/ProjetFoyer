package com.example.demo.controller;


import com.example.demo.entity.Chambre;
import com.example.demo.entity.TypeChambre;
import com.example.demo.service.ChambreService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {

    ChambreService chambreService;

    @PostMapping("/save")
    public Chambre save (@RequestBody Chambre chambre){
        return chambreService.save(chambre);
    }

    @GetMapping("/get-all-chambre")
    public List<Chambre> findAll() {
        return chambreService.findAll();
    }

    @DeleteMapping("/delete-chambre/{idChambre}")
    public void delete(@PathVariable("idChambre")Long idChambre){
        chambreService.delete(idChambre);
    }

    @GetMapping("get-chambre/{idChambre}")
    public Chambre findById(@PathParam("idChambre")Long idChambre){
        return chambreService.findById(idChambre);
    }

    @PutMapping("/modify")
    public Chambre Modify (@RequestBody Chambre chambre){
        return chambreService.Modify(chambre);
    }


    //http://localhost:8082/chambre/type/DOUBLE
    @GetMapping("/type/{type}")
    public List<Chambre> getChambresByType(@PathVariable TypeChambre type) {
        return chambreService.findAllByTypeC(type);
    }

    //http://localhost:8082/chambre/numeroC/5
    @GetMapping("/numeroC/{num}")
    public Chambre getChambreByNumero(@PathVariable Long num) {
        return chambreService.findChambreByNumeroChambre(num);
    }


    //http://localhost:8082/chambre/addResToChambr/A/4
    @PostMapping("/addResToChambr/{idReservation}/{idChambre}")
    public void affecterReservationAChambre(@PathVariable Long idChambre, @PathVariable String idReservation) {
            chambreService.affecterReservationChambre(idChambre, idReservation);
    }


    //http://localhost:8082/chambre/chambreByCIN/1
    @GetMapping("/chambreByCIN/{cin}")
    public Chambre chambreEtudiant(@PathVariable Long cin) {
        return chambreService.chambreEtudiant(cin);
    }

}
