package com.gismi.applist.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gismi.applist.R;
import com.gismi.applist.controller.PessoaController;
import com.gismi.applist.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    public static final String NOME_PREFERENCES ="prefe_listavip";



    PessoaController controller;
    Pessoa pessoa;
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

        preferences = getSharedPreferences(NOME_PREFERENCES,0);
        SharedPreferences.Editor listaVip = preferences.edit();
        preferences = getSharedPreferences(NOME_PREFERENCES, 0);



        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome","NA"));
        pessoa.setSobrenome(preferences.getString("Sobrenome",""));
        pessoa.setCursoDesejado(preferences.getString("CursoDesejado","NA"));
        pessoa.setNumeroTelefone(preferences.getString("numeroTelefone","NA"));

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNome = findViewById(R.id.editSobreNome);
        editCursoDsesejado = findViewById(R.id.editCursoDsesejado);
        editTelefoneDeConatato = findViewById(R.id.editTelefoneDeConatato);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNome.setText(pessoa.getSobrenome());
        editCursoDsesejado.setText(pessoa.getCursoDesejado());
        editTelefoneDeConatato.setText(pessoa.getNumeroTelefone());

        buttonLimpar =findViewById(R.id.buttonLimpar);
        buttonEnviar =findViewById(R.id.buttonEnviar);
        buttonSalvar =findViewById(R.id.buttonSalvar);



        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editPrimeiroNome.setText("");
                editSobreNome.setText("");
                editTelefoneDeConatato.setText("");
                editCursoDsesejado.setText("");

            }

        });

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Volte Sempre", Toast. LENGTH_LONG).show();
                finish();

            }
        });

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobrenome(editSobreNome.getText().toString());
                pessoa.setCursoDesejado(editCursoDsesejado.getText().toString());
                pessoa.setNumeroTelefone(editTelefoneDeConatato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo"+pessoa.toString(), Toast. LENGTH_LONG).show();

                listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
                listaVip.putString("Sobrenome", pessoa.getSobrenome());
                listaVip.putString("CursoDesejado", pessoa.getCursoDesejado());
                listaVip.putString("numeroTelefone", pessoa.getNumeroTelefone());
                listaVip.apply();



                controller.salvar(pessoa);


            }

        });

    }
}