package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Personagem;
import com.dt2.gtavi.entities.Veiculos;
import com.dt2.gtavi.repository.VeiculosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculosController {
    private final VeiculosRepository repository;

    public VeiculosController(VeiculosRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Veiculos> mostrar() {
        return repository.findAll();
    }

    @PostMapping
    public Veiculos criar(@RequestBody Veiculos car) {
        try {
            return repository.save(car);
        } catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Veiculos c){
        Veiculos car = repository.getReferenceById(id);
       car.setNome(car.getNome());
       car.setMarca(car.getMarca());
       car.setTipo(car.getTipo());
       car.setImagem(car.getImagem());
       car.setDescricao(car.getDescricao());
        repository.save(car);
    }
}
