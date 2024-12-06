package com.example.demo.controller;


import com.example.demo.entity.Reservation;
import com.example.demo.entity.Universite;
import com.example.demo.service.UniversityService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/university")
@AllArgsConstructor
public class UniversityController {

    UniversityService universityService;

    @PostMapping("/save")
    public Universite save (@RequestBody Universite university){
        return universityService.save(university);
    }

    @GetMapping("/get-all-university")
    public List<Universite> findAll() {
        return universityService.findAll();
    }

    @DeleteMapping("/delete-university/{idUniversite}")
    public void delete(@PathParam("idUniversite")Long idUniversite){
        universityService.delete(idUniversite);
    }

    @GetMapping("get-University/{idUniversite}")
    public Universite findById(@PathParam("idUniversite") Long idUniversite){
        return universityService.findById(idUniversite);
    }

}
