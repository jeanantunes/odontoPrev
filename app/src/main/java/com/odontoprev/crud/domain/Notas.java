package com.odontoprev.crud.domain;

import javax.persistence.*;

/**
 * Created by JotaIT Services
 */
@Entity
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    @Column(length = 10000)
    private String conteudo;

    public Notas() {
    }

    public Notas(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String titulo) {
        this.titulo = titulo;
    }

    public String getContent() {
        return conteudo;
    }

    public void setContent(String conteudo) {
        this.conteudo = conteudo;
    }
}
