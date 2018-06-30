package com.dds.lectordenotas.model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Tarea {
    private Estudiante estudiante;
    private Calificacion nota;

    public Tarea(Estudiante estudiante, Calificacion nota) {
        this.estudiante = estudiante;
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Calificacion getNota() {
        return nota;
    }

    public void setNota(Calificacion nota) {
        this.nota = nota;
    }
}
