package com.proyecto.dWeb.control;

import com.proyecto.dWeb.dao.ArmasRepository;
import com.proyecto.dWeb.model.Armas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "armas/")
public class ArmasController {

    @Autowired
    public ArmasRepository armasRepository;

    @GetMapping
    public List<Armas> getArmas(){return  armasRepository.getArmas();}

    @GetMapping(value = "{id_pantera}")
    public List<Armas> consultar(@PathVariable("id_pantera")Long id_pantera){
        List<Armas> nLista =armasRepository.consulta(id_pantera);
        return nLista;
    }
}
