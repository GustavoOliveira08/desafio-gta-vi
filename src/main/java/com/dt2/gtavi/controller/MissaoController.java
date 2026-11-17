package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Missao;
import com.dt2.gtavi.entities.Personagem;
import com.dt2.gtavi.repository.MissaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missao")
public class MissaoController {
    private final MissaoRepository repository;
    public MissaoController(MissaoRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Missao> mostrar(){
        return repository.findAll();
    }

    @PostMapping
    public Missao criar(@RequestBody Missao gay){
        try {
            return repository.save(gay);
        } catch (Exception e) {
            return null;
        }
    }
}
