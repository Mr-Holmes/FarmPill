package com.example.alunoifpe.farmpill.model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Gabriel on 31/10/2017.
 */

public class FirebaseModel {

     private static DatabaseReference referenceFirebase;

     public static DatabaseReference getReferenceFirebase(){
          if(referenceFirebase == null){
               referenceFirebase = FirebaseDatabase.getInstance().getReference();
          }
          return referenceFirebase;
     }

}
