package com.proyecto.dWeb.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "adjuncs")
@ToString
@EqualsAndHashCode
@Getter @Setter
public class Armas {
    @Id @Column(name = "id")
    private long id;

    @Column(name = "armamento")
    private String nombre;

     @Column(name = "characteristic")
    private String calibre;

     @Column(name = "id_pantera")
     private Long id_pantera;

     //@ForeignKey()
     /*@ManyToOne
     @JoinColumn (name ="id_pantera")
     private Pantera pantera;*/



     //;

    public Armas() {
    }

    public Armas(long id, String nombre, String calibre) {
        this.id = id;
        this.nombre = nombre;
        this.calibre = calibre;
    }
}
