package com.dds.lectordenotas.ui.vm;

import com.dds.lectordenotas.model.Estudiante;
import com.dds.lectordenotas.model.Tarea;
import com.dds.lectordenotas.model.repositories.Repositorios;
import org.uqbar.commons.model.annotations.Observable;

import java.util.List;

@Observable
public class TareasViewModel {
    private Estudiante estudianteLogueado;
    private List<Tarea> tareasDelEstudiante;

    public TareasViewModel() {
        this.estudianteLogueado = Repositorios.estudiante;
        this.tareasDelEstudiante = Repositorios.tareas.delEstudiante(estudianteLogueado);
    }

    public Estudiante getEstudianteLogueado() {
        return estudianteLogueado;
    }

    public void setEstudianteLogueado(Estudiante estudianteLogueado) {
        this.estudianteLogueado = estudianteLogueado;
    }

    public List<Tarea> getTareasDelEstudiante() {
        return tareasDelEstudiante;
    }

    public void setTareasDelEstudiante(List<Tarea> tareasDelEstudiante) {
        this.tareasDelEstudiante = tareasDelEstudiante;
    }
}
