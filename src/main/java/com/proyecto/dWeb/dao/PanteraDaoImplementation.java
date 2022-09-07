package com.proyecto.dWeb.dao;

import com.proyecto.dWeb.model.Pantera;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

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
}
