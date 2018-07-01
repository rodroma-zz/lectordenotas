package com.dds.lectordenotas.model.repositories;

import com.dds.lectordenotas.model.Estudiante;
import com.dds.lectordenotas.model.Tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TareaRepository {
    final private List<Tarea> tareas = new ArrayList<>();

    public void agregar(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public List<Tarea> todas() {
        return tareas;
    }
}
