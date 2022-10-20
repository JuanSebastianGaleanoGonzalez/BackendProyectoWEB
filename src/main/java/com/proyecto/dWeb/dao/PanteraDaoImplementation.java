package com.proyecto.dWeb.dao;

import com.proyecto.dWeb.model.Pantera;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Repository
@Transactional
public class PanteraDaoImplementation implements PanteraDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Pantera> getPanteras() {
        String query = "FROM Pantera";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deletePantera(Long id) {
        Pantera pantera = entityManager.find(Pantera.class, id);
        entityManager.remove(pantera);
    }
    @Override
    public void addPantera(Long id, String nombre){
        Pantera pantera = new Pantera();
        pantera.setNombre(nombre);
        pantera.setId(id);
        entityManager.persist(pantera);
    }

    @Override
    public void updatePantera(Long id, String nombre) {
        Pantera pantera = entityManager.find(Pantera.class, id);
        entityManager.remove(pantera);
        pantera.setNombre(nombre);
        entityManager.persist(pantera);
    }
}
