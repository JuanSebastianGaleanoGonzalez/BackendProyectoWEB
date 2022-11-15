package com.proyecto.dWeb.control;


import com.proyecto.dWeb.dao.AdminRepository;
import com.proyecto.dWeb.model.Administrador;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping(value ="admin/")
public class AdminController {
    @Autowired
    public AdminRepository adminRepository;

    @GetMapping
    public List<Administrador> getAdmins() {
        return adminRepository.getAdmins();
    }
}
