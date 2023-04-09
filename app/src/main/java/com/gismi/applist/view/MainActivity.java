package com.gismi.applist.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.gismi.applist.R;
import com.gismi.applist.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    String dadosPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Gismi");
        pessoa.setSobrenome("Guimaraes");
        pessoa.setCursoDesejado("Android");
        pessoa.setNumeroTelefone("48996409838");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobre nome: ";
        dadosPessoa += pessoa.getSobrenome();
        dadosPessoa += "Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += "Numero Telefone: ";
        dadosPessoa += pessoa.getNumeroTelefone();

        Log.i( "POOAndroid", pessoa.toString());

    }
}