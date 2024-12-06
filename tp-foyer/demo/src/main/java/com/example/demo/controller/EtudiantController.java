package com.example.demo.controller;


import com.example.demo.entity.Chambre;
import com.example.demo.entity.Etudiant;
import com.example.demo.service.EtudiantService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {

    EtudiantService etudiantService;

    @PostMapping("/save")
    public Etudiant save (@RequestBody Etudiant etudiant){
        return etudiantService.save(etudiant);
    }

    @GetMapping("/get-all-etudiants")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

    @DeleteMapping("/delete-etudiant/{idEtudiant}")
    public void delete(@PathParam("idEtudiant")Long idEtudiant){
        etudiantService.delete(idEtudiant);
    }

    @GetMapping("get-etudiant/{idEtudiant}")
    public Etudiant findById(@PathParam("idEtudiant") Long idEtudiant){
        return etudiantService.findById(idEtudiant);
    }


}
