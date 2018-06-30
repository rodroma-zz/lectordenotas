package com.dds.lectordenotas.model;

import org.uqbar.commons.model.annotations.Observable;

import java.util.Objects;

@Observable
public class Estudiante {
    private String nombre;
    private String apellido;
    private int legajo;
    private String github;

    public Estudiante(String nombre, String apellido, int legajo, String github) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.github = github;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return legajo == that.legajo &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(github, that.github);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, apellido, legajo, github);
    }
}
