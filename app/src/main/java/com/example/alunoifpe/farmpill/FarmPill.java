package com.example.alunoifpe.farmpill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FarmPill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_pill);

        Estante estante [] [] = new Estante[4][4];
    }
}
