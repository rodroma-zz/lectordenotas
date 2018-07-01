package com.dds.lectordenotas.model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public abstract class Calificacion {
    protected final String nota;
    protected final boolean aprobado;

    protected Calificacion(String nota, boolean aprobado) {
        this.nota = nota;
        this.aprobado = aprobado;
    }

    public String getNota() {
        return nota;
    }

    public boolean isAprobado() {
        return aprobado;
    }
}
