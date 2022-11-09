package com.proyecto.dWeb.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.proyecto.dWeb.model.Armas;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "panters")
@ToString
@EqualsAndHashCode
@Getter @Setter
public class Pantera {


    @Id @Column(name = "id_pantera")
    private long id;

     @Column(name = "name")
    private String name;

     @Column(name = "email")
    private String email;

    @Column(name = "tribe")
    private String tribe;

    /*@OneToMany
    private List<Armas> armas =new ArrayList<>();*/

    public Pantera() {
    }


}
