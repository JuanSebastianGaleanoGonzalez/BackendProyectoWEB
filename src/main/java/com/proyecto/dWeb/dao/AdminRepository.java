package com.proyecto.dWeb.dao;

import com.proyecto.dWeb.model.Administrador;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository {
    List<Administrador> getAdmins();

    /*void deleteAdmin(Long id);

    void addAdmin(Long id, String nombre, String correo, String password);

     */
}
