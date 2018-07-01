package com.dds.lectordenotas.model;

import org.uqbar.commons.model.annotations.Observable;

import java.util.ArrayList;
import java.util.List;

@Observable
public class Asignacion {
    // Wtf porque no anda final aca.
    private Tarea tarea;
    private Estudiante estudiante;
    private List<Calificacion> calificaciones;

    public Asignacion(Tarea tarea, Estudiante estudiante) {
        this.tarea = tarea;
        this.estudiante = estudiante;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(Calificacion calificacion) {
        this.calificaciones.add(calificacion);
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return tarea.toString();
    }
}
