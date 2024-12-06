package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated
    private TypeChambre typeC;

    @JsonIgnore
    @ManyToOne
    //@JoinColumn(name = "idBloc")
    private Bloc bloc;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER)
    //@JsonIgnore
    private List<Reservation> reservation = new ArrayList<>();


}
