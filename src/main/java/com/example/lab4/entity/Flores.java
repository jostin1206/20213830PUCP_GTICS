package com.example.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "flores")
public class Flores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idflores")
    private int idFlores;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "foto")
    private String foto;

    @ManyToOne
    @JoinColumn(name = "color_idcolor")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "tipo_idtipo")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "ocasion_idocasion")
    private Ocasion ocasion;
}
