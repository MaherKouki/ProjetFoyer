package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private Long nomBloc;
    private Long capaciteBloc;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Foyer foyer;



    @JsonIgnore
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambre = new ArrayList<>();
}
