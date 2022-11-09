package com.proyecto.dWeb.service;

import com.proyecto.dWeb.dao.ArmasRepository;
import com.proyecto.dWeb.model.Armas;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
@Transactional
public class ArmasDaoImplementation implements ArmasRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Armas> consulta(Long id) {
        String query = "FROM Armas";
        List<Armas> armas = entityManager.createQuery(query).getResultList();
        List<Armas> armas2 =new ArrayList<>();
        for(Armas a: armas){
            if(a.getId_pantera().equals(id)){
                armas2.add(a);
            }
        }
        return armas2;
    }


}
