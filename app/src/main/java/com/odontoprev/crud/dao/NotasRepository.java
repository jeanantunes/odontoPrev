package com.odontoprev.crud.dao;

import com.odontoprev.crud.domain.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JotaIT Services
 */
@Repository
public interface NotasRepository extends JpaRepository<Notas, Long> {
}
