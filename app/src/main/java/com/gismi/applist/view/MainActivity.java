package com.gismi.applist.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        /*pessoa.setPrimeiroNome("Gismi");
        pessoa.setSobrenome("Guimaraes");
        pessoa.setCursoDesejado("Android");
        pessoa.setNumeroTelefone("48996409838");*/

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

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNome.setText(pessoa.getSobrenome());
        editCursoDsesejado.setText(pessoa.getCursoDesejado());
        editTelefoneDeConatato.setText(pessoa.getNumeroTelefone());

//        Criando os metodos de ação com os buttons do aplicativos

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


            }
        });


        //Para debug, serve como etiqueta dos objetos instanciados.
        Log.i( "POOAndroid", pessoa.toString());

    }
}