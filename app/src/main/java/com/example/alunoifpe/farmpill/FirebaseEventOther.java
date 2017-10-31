package com.example.alunoifpe.farmpill;

import com.example.alunoifpe.farmpill.model.FirebaseModel;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by gabrielneves on 31/10/17.
 */

public class FirebaseEventOther {

    public static void getFirebase() {

        FirebaseModel.getReferenceFirebase()
                .child("Farmacia")
                .addValueEventListener(new InvokeGetFirebaseOther());

    }

}
