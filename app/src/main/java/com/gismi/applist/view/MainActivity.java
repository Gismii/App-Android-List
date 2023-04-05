package com.gismi.applist.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gismi.applist.R;
import com.gismi.applist.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
    }
}