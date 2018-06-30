package com.dds.lectordenotas.model;

import com.dds.lectordenotas.model.repositories.Repositorios;
import org.uqbar.commons.model.Repo;

import static com.dds.lectordenotas.model.repositories.Repositorios.tareas;

public class Fixture {

    public static void init() {
        tareas.agregar(new Tarea(Repositorios.estudiante, "B"));
        tareas.agregar(new Tarea(Repositorios.estudiante, "R"));
        tareas.agregar(new Tarea(new Estudiante("Cosme", "Fulanito", 1337433, "cosme"), "M"));
    }
}
