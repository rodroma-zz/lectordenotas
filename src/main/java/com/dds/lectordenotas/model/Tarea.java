package com.dds.lectordenotas.model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Tarea {
    private Estudiante estudiante;
    private String nota;

    public Tarea(Estudiante estudiante, String nota) {
        this.estudiante = estudiante;
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
