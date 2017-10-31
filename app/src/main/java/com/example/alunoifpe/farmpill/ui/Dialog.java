package com.example.alunoifpe.farmpill.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.alunoifpe.farmpill.R;

/**
 * Created by Gabriel on 31/10/2017.
 */


public class Dialog {
     public void DialogMarker(final Context context,  final String descricao, final String um, final double qtdPorCaixas, final String embalagem, final float precoPorCaixa, final double demandaAnual ){

         LayoutInflater layoutInflater = LayoutInflater.from(context);
         View popupView = layoutInflater.inflate(R.layout.addinfo,null);
         final AlertDialog.Builder builder = new AlertDialog.Builder(context);
         builder.setView(popupView);

        final EditText editText1 = (EditText) popupView.findViewById(R.id.editText1);
         final EditText editText2 = (EditText) popupView.findViewById(R.id.editText2);
         final EditText editText3 = (EditText) popupView.findViewById(R.id.editText3);
         final EditText editText4 = (EditText) popupView.findViewById(R.id.editText4);
         final EditText editText5 = (EditText) popupView.findViewById(R.id.editText5);
         final EditText editText6 = (EditText) popupView.findViewById(R.id.editText6);

         editText1.setText(descricao);
         editText2.setText(um);
         editText3.setText(String.valueOf(qtdPorCaixas));
         editText4.setText(embalagem);
         editText5.setText(String.valueOf(precoPorCaixa));
         editText6.setText(String.valueOf(demandaAnual));

         builder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 loginConfirm(context, String.valueOf(editText1.getText()), String.valueOf(editText2.getText()),
                         String.valueOf(editText3.getText()), String.valueOf(editText4.getText()), String.valueOf(editText5.getText()), String.valueOf(editText6.getText()));

             }
         }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 dialogInterface.cancel();
             }
         });

         AlertDialog alertDialog = builder.create();
         alertDialog.show();

     }
}
