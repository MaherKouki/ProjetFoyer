package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    private String idReservation;
    private Date anneUniversitaire;
    private boolean estValide;



    //@ManyToOne
    //@JoinColumn(name = "idChambre")
    //private Chambre chambre;


    @JsonIgnore
    @ManyToMany
    //@JoinTable(name = "reservation_etudiant")
    private List<Etudiant> etudiant = new ArrayList<>();


}
