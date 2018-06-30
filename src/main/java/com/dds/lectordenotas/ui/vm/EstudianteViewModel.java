package com.dds.lectordenotas.ui.vm;

import com.dds.lectordenotas.model.Estudiante;
import org.uqbar.commons.model.annotations.Observable;

@Observable
public class EstudianteViewModel {

    private Estudiante estudiante;

    public EstudianteViewModel() {
        // Mock data
        this.estudiante = new Estudiante("Rodrigo", "Martin", 1602550, "rodroma");
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
