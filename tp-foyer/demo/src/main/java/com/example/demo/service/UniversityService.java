package com.example.demo.service;

import com.example.demo.entity.Foyer;
import com.example.demo.entity.Universite;

import java.util.List;

public interface UniversityService {

    Universite save(Universite universite);

    Universite findById(Long idUniversite);

    List<Universite> findAll();

    void delete(Long idUniversite);
}
