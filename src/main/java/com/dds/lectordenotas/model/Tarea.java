package com.dds.lectordenotas.model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Tarea {
    private final String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
