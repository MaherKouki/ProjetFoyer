package com.example.demo.service.impl;


import com.example.demo.Repository.FoyerRepository;
import com.example.demo.entity.Foyer;
import com.example.demo.service.FoyerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements FoyerService {

    FoyerRepository foyerRepository;

    @Override
    public Foyer save(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer findById(Long idFoyer) {
        return foyerRepository.getById(idFoyer);
    }

    @Override
    public List<Foyer> findAll() {
        return foyerRepository.findAll();
    }

    @Override
    public void delete(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);

    }
}
