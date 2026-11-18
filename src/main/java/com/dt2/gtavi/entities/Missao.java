package com.dt2.gtavi.entities;

import jakarta.persistence.*;

@Entity
public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String local;
    private String dificuldade;
    @Column(columnDefinition = "TEXT")
    private String imagem;
    private String descricao;

    public Missao(){}

    public Missao(int id, String nome, String local, String dificuldade, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Missao(String nome, String local, String dificuldade, String imagem, String descricao) {
        this.nome = nome;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public String getImagem() {
        return imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
