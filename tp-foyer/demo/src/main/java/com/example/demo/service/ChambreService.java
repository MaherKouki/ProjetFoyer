package com.example.demo.service;

import com.example.demo.entity.Chambre;
import com.example.demo.entity.TypeChambre;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ChambreService {

    Chambre save(Chambre chambre);

    Chambre findById(Long idChambre);

    List<Chambre> findAll();

    void delete(Long idChambre);

    Chambre Modify(Chambre chambre);

    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findChambreByNumeroChambre(Long numC);

    public void affecterReservationChambre(Long idChambre, String idReservation);


    Chambre chambreEtudiant(Long cin);



}
