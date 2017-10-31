package com.example.alunoifpe.farmpill.ui.other;

import android.util.Log;

import com.example.alunoifpe.farmpill.model.FarmaciaModel;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class InvokeGetFirebaseOther implements ValueEventListener {

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {

        Iterable<DataSnapshot> dataSnapshots = dataSnapshot.getChildren();

        for (DataSnapshot dataSnapshot1 : dataSnapshots) {

            final FarmaciaModel local = dataSnapshot1.getValue(FarmaciaModel.class);
            Log.d("", "Descrição: "+local.getDescricao());

        }

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
}
