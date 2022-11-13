package com.proyecto.dWeb.service;

import com.proyecto.dWeb.dao.AdminRepository;
import com.proyecto.dWeb.model.Administrador;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class AdminDaoImplementation implements AdminRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Administrador> getAdmins(){
        String query = "FROM Administrador";
        return entityManager.createQuery(query).getResultList();
    }
}
