package com.proyecto.dWeb.dao;

import com.proyecto.dWeb.model.Pantera;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PanteraDao {
    List<Pantera> getPanteras();

    void deletePantera(Long id);

    void addPantera(Long id, String nombre);

    void updatePantera(Long id, String nombre);
}
