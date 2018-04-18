package com.odontoprev.crud.controller;

import com.odontoprev.crud.domain.Notas;
import com.odontoprev.crud.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JotaIT Services
 */
@Controller
public class NotasController {

    @Autowired
    NotasService notasService;

    @RequestMapping(value = "/")
    public String notasList(Model model) {
        model.addAttribute("notasList", notasService.findAll());
        return "notasList";
    }

    @RequestMapping(value = {"/notasEdit", "/notasEdit/{id}"}, method = RequestMethod.GET)
    public String notasEditForm(Model model, @PathVariable(required = false, name = "id") Long id) {
        if (null != id) {
            model.addAttribute("notas", notasService.findOne(id));
        } else {
            model.addAttribute("notas", new Notas());
        }
        return "notasEdit";
    }

    @RequestMapping(value = "/notasEdit", method = RequestMethod.POST)
    public String notasEdit(Model model, Notas notas) {
        notasService.saveNotas(notas);
        model.addAttribute("notasList", notasService.findAll());
        return "notasList";
    }

    @RequestMapping(value = "/notasDelete/{id}", method = RequestMethod.GET)
    public String notasDelete(Model model, @PathVariable(required = true, name = "id") Long id) {
        notasService.deleteNotas(id);
        model.addAttribute("notasList", notasService.findAll());
        return "notasList";
    }

}
