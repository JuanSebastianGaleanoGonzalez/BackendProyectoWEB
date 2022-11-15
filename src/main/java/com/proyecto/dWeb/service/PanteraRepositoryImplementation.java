package com.proyecto.dWeb.service;

import com.proyecto.dWeb.dao.PanteraRepository;
import com.proyecto.dWeb.model.Pantera;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PanteraRepositoryImplementation implements PanteraRepository {

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
    public void addPantera(Long id, String name, String email, String tribe){
        Pantera pantera = new Pantera();
        pantera.setName(name);
        pantera.setId(id);
        pantera.setEmail(email);
        pantera.setTribe(tribe);
        entityManager.persist(pantera);
    }

    @Override
    public void updatePantera(Long id, String name, String email, String tribe) {
        Pantera pantera = entityManager.find(Pantera.class, id);
        entityManager.remove(pantera);
        pantera.setName(name);
        pantera.setEmail(email);
        pantera.setTribe(tribe);
        entityManager.persist(pantera);
    }


    @Override
    public Pantera traerPantera(long id){
        String query = "FROM Pantera";
        List<Pantera> panter = entityManager.createQuery(query).getResultList();
        Pantera pantera = new Pantera();
        for (Pantera a:panter){
            if(a.getId() == id){
                pantera = a;
            }
        }
        return pantera;
    }
}
