package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Armas;
import com.dt2.gtavi.repository.ArmasRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/armas")
public class ArmasController {
    private final ArmasRepository repository;
    public ArmasController(ArmasRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Armas> mostrar(){
        return repository.findAll();
    }

    @PostMapping
    public Armas criar(@RequestBody Armas uiui){
        try{
            return repository.save(uiui);
        }catch (Exception e){
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Armas abu){
        Armas armas = repository.getReferenceById(id);
        armas.setNome(abu.getNome());
        armas.setCategoria(abu.getCategoria());
        armas.setFabricante(abu.getFabricante());
        armas.setImagem(abu.getImagem());
        armas.setDescricao(abu.getDescricao());
        repository.save(abu);
    }
}
