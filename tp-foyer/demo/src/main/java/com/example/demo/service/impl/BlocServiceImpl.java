package com.example.demo.service.impl;

import com.example.demo.Repository.BlocRepository;
import com.example.demo.Repository.FoyerRepository;
import com.example.demo.entity.Bloc;
import com.example.demo.entity.Foyer;
import com.example.demo.service.BlocService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements BlocService{


    BlocRepository blocRepository;
    FoyerRepository foyerRepository;


    @Override
    public Bloc save(Bloc bloc) {
        return blocRepository.save(bloc);

    }


    /*@Override
    public Bloc save(Bloc bloc , Foyer foyer) {
        Foyer savedFoyer = foyerRepository.save(foyer);
        bloc.setFoyer(savedFoyer);
        return blocRepository.save(bloc);
    }*/


    @Override
    public Bloc findById(Long idBloc) {
        return blocRepository.getById(idBloc);
    }

    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();

    }

    @Override
    public void delete(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public void assignfoyerTobloc(Long blocid, Long foyerid) {
        Bloc bloc = blocRepository.findById(blocid).get();
        Foyer foyer=foyerRepository.findById(foyerid).get();
        bloc.setFoyer(foyer);
        blocRepository.save(bloc);
    }

    @Override
    public Bloc desaffecterFoyerFromBloc(Long blocId) {
        Bloc bloc = blocRepository.findById(blocId).get();
        bloc.setFoyer(null);
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> findAllByFoyerIsNull() {
        return blocRepository.findAllByFoyerIsNull();
    }
}


