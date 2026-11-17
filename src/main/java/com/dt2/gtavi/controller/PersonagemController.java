package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Personagem;
import com.dt2.gtavi.repository.PersonagemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personagens")
public class PersonagemController {

    private final PersonagemRepository repository;

    public PersonagemController(PersonagemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Personagem> mostrar() {
        return repository.findAll();
    }

    @PostMapping
    public Personagem criar(@RequestBody Personagem rodrigo) {
        try {
            return repository.save(rodrigo);
        } catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void buscarId(@PathVariable int id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Personagem p){
        Personagem personagem = repository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setImagem(p.getImagem());
        personagem.setDescricao(p.getDescricao());
        repository.save(personagem);
    }
}