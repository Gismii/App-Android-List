package com.gismi.applist.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.gismi.applist.model.Pessoa;
import com.gismi.applist.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES ="prefe_listavip";

    public PessoaController(MainActivity mainActivity){
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES,0);

        listaVip = preferences.edit();
    }


    @NonNull
    @Override
    public String toString() {

        return super.toString();
    }


    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Salvo"+pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("Sobrenome", pessoa.getSobrenome());
        listaVip.putString("CursoDesejado", pessoa.getCursoDesejado());
        listaVip.putString("numeroTelefone", pessoa.getNumeroTelefone());
        listaVip.apply();

    }
    public  Pessoa buscar( Pessoa pessoa){

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome","na"));
        pessoa.setSobrenome(preferences.getString("Sobrenome","na"));
        pessoa.setCursoDesejado(preferences.getString("CursoDesejado","na"));
        pessoa.setNumeroTelefone(preferences.getString("numeroTelefone","na"));

        return pessoa;

    }

    public void limpar(){


        listaVip.clear();
        listaVip.apply();


    }


}


