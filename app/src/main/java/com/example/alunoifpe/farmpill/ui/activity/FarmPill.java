package com.example.alunoifpe.farmpill.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alunoifpe.farmpill.R;
import com.example.alunoifpe.farmpill.ui.other.FirebaseEventOther;

public class FarmPill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_pill);

        FirebaseEventOther.getFirebase();

    }
}
