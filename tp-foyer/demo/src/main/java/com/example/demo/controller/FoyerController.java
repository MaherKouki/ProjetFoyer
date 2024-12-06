package com.example.demo.controller;


import com.example.demo.entity.Etudiant;
import com.example.demo.entity.Foyer;
import com.example.demo.service.FoyerService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {

    FoyerService foyerService;

    @PostMapping("/save")
    public Foyer save (@RequestBody Foyer foyer){
        return foyerService.save(foyer);
    }

    @GetMapping("/get-all-foyer")
    public List<Foyer> findAll() {
        return foyerService.findAll();
    }

    @DeleteMapping("/delete-foyer/{idFoyer}")
    public void delete(@PathParam("idFoyer")Long idFoyer){
        foyerService.delete(idFoyer);
    }

    @GetMapping("get-foyer/{idFoyer}")
    public Foyer findById(@PathParam("idFoyer") Long idFoyer){
        return foyerService.findById(idFoyer);
    }


}
