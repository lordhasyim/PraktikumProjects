package com.hasyim.praktikumprojects;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Ahmad Hasyim BSA on 4/8/2015.
 */
public class PersamaanActivity extends ActionBarActivity {
    //double tempHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persamaan);

        final EditText VarA = (EditText) findViewById(R.id.edtA);
        final EditText VarB = (EditText) findViewById(R.id.edtB);
        final EditText VarC = (EditText) findViewById(R.id.edtC);
        Button hitung = (Button) findViewById(R.id.btnHasil);
        //final tmpHasil;
        final EditText hasilX1 = (EditText) findViewById(R.id.edtHasilX1);
        final EditText hasilX2 = (EditText) findViewById(R.id.edtHasilX2);
        final TextView tvHasil = (TextView) findViewById(R.id.tvHasil);
        final TextView tvKet = (TextView) findViewById(R.id.tvKet);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //     edtText.setText("Text");
                Double A = Double.valueOf(VarA.getText().toString());
                Double B = Double.valueOf(VarB.getText().toString());
                Double C = Double.valueOf(VarC.getText().toString());
                double tempHasil = B * B - 4 * A * C;
                double x1;
                double x2;
                if (tempHasil < 0) {
                    tvHasil.setText("Akar - akar persamaan imaginer");
                } else if (tempHasil == 0) {
                    tvHasil.setText("Akar akar persamaan nyata tetapi kembar");
                    x1 = -B / (2 * A);
                    hasilX1.setText(String.valueOf(x1));
                    tvKet.setText("x1 = x2 = " + String.valueOf(x1));
                } else {
                    tvHasil.setText("Akar akar persamaan nyata dan berbeda");
                    x1 = (-B + Math.sqrt(tempHasil)) / (2 * A);
                    x2 = (-B + Math.sqrt(tempHasil)) / (2 * A);
                    hasilX1.setText(String.valueOf(x1));
                    hasilX2.setText(String.valueOf(x2));
                    tvHasil.setText(" x1 = " + String.valueOf(x1) + "\n"+" x2 = " + String.valueOf(x2));
                }
            }


        });


    }


}
