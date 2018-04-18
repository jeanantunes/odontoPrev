package com.odontoprev.crud.service;

import com.odontoprev.crud.dao.NotasRepository;
import com.odontoprev.crud.domain.Notas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JotaIT Services
 */
@Service
public class NotasServiceImpl implements NotasService {

    @Autowired
    private NotasRepository notasRepository;

    @Override
    public List<Notas> findAll() {
        return notasRepository.findAll();
    }

    @Override
    public Notas findOne(Long id) {
        return notasRepository.findOne(id);
    }

    @Override
    public Notas saveNotas(Notas notas) {
        return notasRepository.save(notas);
    }

    @Override
    public void deleteNotas(Long id) {
        notasRepository.delete(id);
    }
}
