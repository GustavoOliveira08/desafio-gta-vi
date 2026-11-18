package com.dt2.gtavi.entities;

import jakarta.persistence.*;

@Entity
public class Armas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String categoria;
    private String fabricante;
    @Column(columnDefinition = "TEXT")
    private String imagem;
    private String descricao;

    public Armas(){}

    public Armas(int id, String nome, String categoria, String fabricante, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Armas(String nome, String categoria, String fabricante, String descricao, String imagem) {
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFabricante() {
        return fabricante;
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

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
