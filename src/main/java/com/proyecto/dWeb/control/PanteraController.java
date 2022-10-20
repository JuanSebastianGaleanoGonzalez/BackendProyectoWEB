package com.proyecto.dWeb.control;

import com.proyecto.dWeb.dao.PanteraDao;
import com.proyecto.dWeb.model.Pantera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "panteras/")
public class PanteraController {

    @Autowired
    private PanteraDao panteraDao;

    @GetMapping
    public List<Pantera> getPanteras(){
        return panteraDao.getPanteras();
    }

    @DeleteMapping(value = "{id}")
    public void deletePantera(@PathVariable ("id") Long id){
        panteraDao.deletePantera(id);
    }

    @PutMapping(value = "add/{id}/{nombre}")
    public void addPantera(@PathVariable("id") Long id, @PathVariable("nombre") String nombre){
        panteraDao.addPantera(id, nombre);
    }
    @PostMapping(value = "{id}/{nombre}")
    public void updatePantera(@PathVariable("id") Long id, @PathVariable ("nombre") String nombre){
        panteraDao.updatePantera(id, nombre);
    }
}
