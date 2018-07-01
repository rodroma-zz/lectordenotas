package com.dds.lectordenotas.ui.vm;

import com.dds.lectordenotas.model.Asignacion;
import com.dds.lectordenotas.model.Calificacion;
import com.dds.lectordenotas.model.Estudiante;
import com.dds.lectordenotas.model.Tarea;
import com.dds.lectordenotas.model.repositories.Repositorios;
import org.uqbar.commons.model.annotations.Observable;

import java.util.List;



@Observable
public class TareasViewModel {
    private Estudiante estudianteLogueado;
    private List<Tarea> tareas;
    private Tarea tareaSeleccionada;
    private Asignacion asignacion;
    private List<Calificacion> calificaciones;
    private Calificacion calificacionSeleccionada;

    public TareasViewModel() {
        estudianteLogueado = Repositorios.estudiante;
        tareas = Repositorios.tareas.todas();
        tareaSeleccionada = tareas.get(0);
        // TODO: Null safety (Hay alguna manera de que Arena entienda Optional?
        refreshCalificaciones();
    }

    public void refreshCalificaciones() {
        this.asignacion = Repositorios.asignaciones.obtener(estudianteLogueado, tareaSeleccionada).orElse(null);
        this.calificaciones = asignacion.getCalificaciones();
        this.calificacionSeleccionada = calificaciones.get(0);
    }

    public Estudiante getEstudianteLogueado() {
        return estudianteLogueado;
    }

    public void setEstudianteLogueado(Estudiante estudianteLogueado) {
        this.estudianteLogueado = estudianteLogueado;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public Tarea getTareaSeleccionada() {
        return tareaSeleccionada;
    }

    public void setTareaSeleccionada(Tarea tareaSeleccionada) {
        this.tareaSeleccionada = tareaSeleccionada;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Calificacion getCalificacionSeleccionada() {
        return calificacionSeleccionada;
    }

    public void setCalificacionSeleccionada(Calificacion calificacionSeleccionada) {
        this.calificacionSeleccionada = calificacionSeleccionada;
    }
}
