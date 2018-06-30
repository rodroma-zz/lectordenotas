package com.dds.lectordenotas.model;

import com.dds.lectordenotas.model.repositories.Repositorios;
import org.uqbar.commons.model.Repo;

import static com.dds.lectordenotas.model.repositories.Repositorios.tareas;

public class Fixture {

    public static void init() {
        tareas.agregar(new Tarea(Repositorios.estudiante, new CalificacionConceptual(CalificacionConceptual.Valor.BIEN)));
        tareas.agregar(new Tarea(Repositorios.estudiante, new CalificacionConceptual(CalificacionConceptual.Valor.REGULAR)));
        tareas.agregar(new Tarea(new Estudiante("Cosme", "Fulanito", 1337433, "cosme"), new CalificacionConceptual(CalificacionConceptual.Valor.MAL)));
    }
}
