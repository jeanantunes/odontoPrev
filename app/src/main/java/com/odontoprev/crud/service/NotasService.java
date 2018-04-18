package com.odontoprev.crud.service;

import com.odontoprev.crud.domain.Notas;

import java.util.List;

/**
 * Created by JotaIT Services
 */
public interface NotasService {

    List<Notas> findAll();

    Notas findOne(Long id);

    Notas saveNotas(Notas notas);

    void deleteNotas(Long id);

}
