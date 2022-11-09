package com.proyecto.dWeb.dao;

import com.proyecto.dWeb.model.Armas;
import com.proyecto.dWeb.model.Pantera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArmasRepository  {
    //void deleteArmas(Long id);

    List<Armas> consulta(Long id);


}
