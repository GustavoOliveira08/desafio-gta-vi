package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Missao;
import com.dt2.gtavi.entities.Personagem;
import com.dt2.gtavi.repository.MissaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missoes")
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

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void buscarId(@PathVariable int id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Missao gay){
        Missao missao = repository.getReferenceById(id);
        missao.setNome(gay.getNome());
        missao.setLocal(gay.getLocal());
        missao.setDificuldade(gay.getDificuldade());
        missao.setImagem(gay.getImagem());
        missao.setDescricao(gay.getDescricao());
        repository.save(missao);
    }
}
