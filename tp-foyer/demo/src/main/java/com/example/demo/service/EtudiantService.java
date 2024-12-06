package com.example.demo.service;

import com.example.demo.entity.Chambre;
import com.example.demo.entity.Etudiant;

import java.util.List;

public interface EtudiantService {

    Etudiant save(Etudiant etudiant);

    Etudiant findById(Long idEtudiant);

    List<Etudiant> findAll();

    void delete(Long idEtudiant);
}
