package com.proyecto.dWeb.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "panteras")
@ToString
@EqualsAndHashCode
public class Pantera {
    @Getter @Setter @Id @Column(name = "id_pantera")
    private long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;
}
