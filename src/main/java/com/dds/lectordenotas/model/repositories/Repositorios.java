package com.dds.lectordenotas.model.repositories;

import com.dds.lectordenotas.model.Estudiante;

public class Repositorios {

    public static final TareaRepository tareas = new TareaRepository();
    public static final AsignacionRepository asignaciones = new AsignacionRepository();
    public static final Estudiante estudiante = new Estudiante("Rodrigo", "Martin", 1602550, "rodroma");
}
