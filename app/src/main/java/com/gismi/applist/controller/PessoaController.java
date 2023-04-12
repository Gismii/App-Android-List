package com.gismi.applist.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import com.gismi.applist.model.Pessoa;

public class PessoaController {



    @NonNull
    @Override
    public String toString() {

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Salvo"+pessoa.toString());

    }
}
