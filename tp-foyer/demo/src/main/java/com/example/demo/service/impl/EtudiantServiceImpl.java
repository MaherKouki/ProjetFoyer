package com.example.demo.service.impl;

import com.example.demo.Repository.EtudiantRepository;
import com.example.demo.entity.Etudiant;
import com.example.demo.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {

    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant save(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant findById(Long idEtudiant) {
        return etudiantRepository.getById(idEtudiant);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public void delete(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
