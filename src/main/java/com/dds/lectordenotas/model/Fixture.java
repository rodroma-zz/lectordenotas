package com.dds.lectordenotas.model;

import static com.dds.lectordenotas.model.repositories.Repositorios.*;

import com.dds.lectordenotas.model.repositories.AsignacionRepository;
import com.dds.lectordenotas.model.repositories.Repositorios;

public class Fixture {

    public static void init() {
        Tarea primerParcial = new Tarea("Primer parcial");
        Tarea tpArena = new Tarea("TP Arena");

        tareas.agregar(primerParcial);
        tareas.agregar(tpArena);

        Asignacion primerParcialRodri = new Asignacion(primerParcial, estudiante);
        primerParcialRodri.agregarCalificacion(new CalificacionNumerica(2));

        Asignacion primerEntregaArena = new Asignacion(tpArena, estudiante);
        primerEntregaArena.agregarCalificacion(new CalificacionConceptual(CalificacionConceptual.Valor.MAL));

        asignaciones.agregar(primerParcialRodri);
        asignaciones.agregar(primerEntregaArena);
    }
}
