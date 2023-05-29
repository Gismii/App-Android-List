package com.gismi.applist.model;

public class Curso {
    private String nomeDoCursoDesejado;

    public Curso(String nomeDoCursoDesejado) {
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }

    public Curso() {

    }

    public String getNomeDoCursoDesejado() {
        return nomeDoCursoDesejado;
    }

    public void setNomeDoCursoDesejado(String nomeDoCursoDesejado) {
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }
}
