package com.example.demo.controller;


import com.example.demo.entity.Bloc;
import com.example.demo.entity.Chambre;
import com.example.demo.entity.Foyer;
import com.example.demo.service.BlocService;
import com.example.demo.service.impl.BlocServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor

@Tag(name="Gestion Bloc")
public class BlocController {

    BlocService blocService;

    @PostMapping("/save")
    public Bloc save (@RequestBody Bloc bloc){
        return blocService.save(bloc );
    }

    @GetMapping("/get-all-bloc")
    public List<Bloc> findAll() {
        return blocService.findAll();
    }

    @DeleteMapping("/delete-bloc/{idBloc}")
    public void delete(@PathVariable("idBloc")Long idBloc){
        blocService.delete(idBloc);
    }

    @GetMapping("get-bloc/{idBloc}")
    public Bloc findById(@PathVariable("idBloc")Long idBloc){
        return blocService.findById(idBloc);
    }


    //http://localhost:8082/bloc/foyerToBloc/1/2
    @PutMapping("/foyerToBloc/{bloc-id}/{foyer-id}")
    public void  assignfoyerTobloc(@PathVariable("bloc-id") Long blocid,@PathVariable("foyer-id") Long foyerid) {
        blocService.assignfoyerTobloc(blocid, foyerid);
    }


    //http://localhost:8082/bloc/desaffecte/2
    @PutMapping("/desaffecte/{id_bloc}")
    public Bloc desaffecterFoyerFromBloc( @PathVariable("id_bloc") Long blocId) {
        return blocService.desaffecterFoyerFromBloc(blocId);
    }


    //http://localhost:8082/bloc/sans-foyer
    @GetMapping("/sans-foyer")
    public List<Bloc> getBlocsWithoutFoyer() {
        return blocService.findAllByFoyerIsNull();
    }



}