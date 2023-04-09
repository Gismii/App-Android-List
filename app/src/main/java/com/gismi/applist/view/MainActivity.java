package com.gismi.applist.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.gismi.applist.R;
import com.gismi.applist.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    String dadosPessoa;

    EditText editPrimeiroNome;
    EditText editSobreNome;
    EditText editCursoDsesejado;
    EditText editTelefoneDeConatato;
    Button buttonLimpar;
    Button buttonEnviar;
    Button buttonSalvar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Gismi");
        pessoa.setSobrenome("Guimaraes");
        pessoa.setCursoDesejado("Android");
        pessoa.setNumeroTelefone("48996409838");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNome = findViewById(R.id.editSobreNome);
        editCursoDsesejado = findViewById(R.id.editCursoDsesejado);
        editTelefoneDeConatato = findViewById(R.id.editTelefoneDeConatato);

        buttonLimpar =findViewById(R.id.buttonLimpar);
        buttonEnviar =findViewById(R.id.buttonEnviar);
        buttonSalvar =findViewById(R.id.buttonSalvar);

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