package com.planetbooks.controllers.views;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "planet_books_inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String examen;
    private String nivel;
    private String tipoDeMaterial;
    private String editorial;
    private int anio;
    private String formato;
    private String titulo;
    private String descripcion;
    private String precio;
}
