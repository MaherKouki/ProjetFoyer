package com.example.demo.service;

import com.example.demo.entity.Etudiant;
import com.example.demo.entity.Foyer;

import java.util.List;

public interface FoyerService {

    Foyer save(Foyer foyer);

    Foyer findById(Long idFoyer);

    List<Foyer> findAll();

    void delete(Long idFoyer);

}
