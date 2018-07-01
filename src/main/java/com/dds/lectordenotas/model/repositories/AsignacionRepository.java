package com.dds.lectordenotas.model.repositories;

import com.dds.lectordenotas.model.Asignacion;
import com.dds.lectordenotas.model.Estudiante;
import com.dds.lectordenotas.model.Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AsignacionRepository {
    private final List<Asignacion> asignaciones;

    public AsignacionRepository(Asignacion... asignaciones) {
        this.asignaciones = new ArrayList<>(Arrays.asList(asignaciones));
    }

    public List<Asignacion> todas() {
        return asignaciones;
    }

    public void agregar(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    public Optional<Asignacion> obtener(Estudiante estudiante, Tarea tarea) {
        return asignaciones
                .stream()
                .filter(asignacion -> estudiante.equals(asignacion.getEstudiante()))
                .filter(asignacion -> tarea.equals(asignacion.getTarea()))
                .findFirst();
    }

}
