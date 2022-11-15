package com.proyecto.dWeb.dao;

import com.proyecto.dWeb.model.Pantera;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PanteraRepository {
    List<Pantera> getPanteras();

    void deletePantera(Long id);

    void addPantera(Long id, String name, String email, String tribe);

    void updatePantera(Long id, String name, String email, String tribe);

    Pantera traerPantera(long id);
}
