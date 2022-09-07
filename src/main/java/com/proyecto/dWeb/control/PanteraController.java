package com.proyecto.dWeb.control;

import com.proyecto.dWeb.dao.PanteraDao;
import com.proyecto.dWeb.dao.PanteraDaoImplementation;
import com.proyecto.dWeb.model.Pantera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PanteraController {

    @Autowired
    private PanteraDao panteraDao;

    @RequestMapping(value = "panteras")
    public List<Pantera> getPanteras(){
        return panteraDao.getPanteras();
    }

}
