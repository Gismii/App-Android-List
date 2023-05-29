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
import com.gismi.applist.controller.CursoController;
import com.gismi.applist.controller.PessoaController;
import com.gismi.applist.model.Curso;
import com.gismi.applist.model.Pessoa;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    CursoController cursoController;
    PessoaController controller;
    Pessoa pessoa;

    Curso curso;
    List<Curso> listaDeCursos;
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


        controller = new PessoaController(MainActivity.this);
        controller.toString();

        curso = new Curso();
        cursoController = new CursoController();
        listaDeCursos = cursoController.getListaDeCursos();

        pessoa = new Pessoa();
        controller.buscar(pessoa);


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

                controller.limpar();

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




                controller.salvar(pessoa);


            }

        });

    }
}