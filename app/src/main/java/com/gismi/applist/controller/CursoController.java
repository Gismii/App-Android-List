package com.gismi.applist.controller;

import com.gismi.applist.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoController {
    private  List listCursos;

    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("Html"));
        listCursos.add(new Curso("CSS"));
        listCursos.add(new Curso("Ruby"));
        listCursos.add(new Curso("C#"));
        listCursos.add(new Curso("PHP"));
        listCursos.add(new Curso("JavaScript"));

        return listCursos;

    }

}
