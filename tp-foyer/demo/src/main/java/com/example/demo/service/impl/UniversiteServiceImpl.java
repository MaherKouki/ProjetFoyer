package com.example.demo.service.impl;

import com.example.demo.Repository.ChambreRepository;
import com.example.demo.Repository.UniversiteRepository;
import com.example.demo.entity.Universite;
import com.example.demo.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements UniversityService {

    UniversiteRepository universiteRepository;


    @Override
    public Universite save(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite findById(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public List<Universite> findAll() {
        return universiteRepository.findAll();
    }

    @Override
    public void delete(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
