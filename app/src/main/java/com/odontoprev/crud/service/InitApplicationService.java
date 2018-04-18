package com.odontoprev.crud.service;

import com.odontoprev.crud.domain.Notas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * Created by JotaIT Services
 */
@Service
public class InitApplicationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitApplicationService.class);

    @Autowired
    NotasService notasService;

    /**
     * Initialize the test data
     */
    @EventListener(ApplicationReadyEvent.class)
    public void initializeTestData() {
        LOGGER.info("Inicializando teste dados");

        notasService.saveNotas(new Notas("OdontoPrev Test 1", "Conteúdo 1"));
        notasService.saveNotas(new Notas("OdontoPrev Test 2", "Conteúdo 2"));

        LOGGER.info("Inicialização completa");
    }

}
