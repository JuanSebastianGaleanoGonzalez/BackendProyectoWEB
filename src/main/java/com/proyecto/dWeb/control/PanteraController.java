package com.proyecto.dWeb.control;

import com.proyecto.dWeb.dao.PanteraRepository;
import com.proyecto.dWeb.model.Pantera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "panteras/")
public class PanteraController {

    @Autowired
    private PanteraRepository panteraRepository;

    @GetMapping
    public List<Pantera> getPanteras(){
        return panteraRepository.getPanteras();
    }

    @DeleteMapping(value = "delete/{id}")
    public void deletePantera(@PathVariable ("id") Long id){
        panteraRepository.deletePantera(id);
    }

    @PutMapping(value = "add/{id}/{name}/{email}/{tribe}")
    public void addPantera(@PathVariable("id") Long id, @PathVariable("name") String name, @PathVariable("email")String email, @PathVariable("tribe") String tribe){
        panteraRepository.addPantera(id, name, email, tribe);
    }
    @PostMapping(value = "/update/{id}/{name}/{email}/{tribe}")
    public void updatePantera(@PathVariable("id") Long id, @PathVariable ("name") String name, @PathVariable("email")String email, @PathVariable("tribe") String tribe){
        panteraRepository.updatePantera(id, name, email, tribe);
    }

    @GetMapping(value = "{id}")
    public Pantera traerPantera(@PathVariable("id") Long id){
        return panteraRepository.traerPantera(id);
    }
}
