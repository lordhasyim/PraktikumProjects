package com.hasyim.praktikumprojects;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BmiActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        // penghitung berat badan ideal
        // Rumus : (Tinggi Badan - 100)*90%

        final EditText tinggi = (EditText) findViewById(R.id.editText1);
        final TextView viewHasil = (TextView) findViewById(R.id.viewHasil);
        Button hitung = (Button) findViewById(R.id.btnHitung);

        hitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int h=Integer.parseInt(tinggi.getText().toString());
                double hasil = ((h-100)*0.90);
                viewHasil.setText(String.valueOf(hasil)+" Kg");
            }
        });
    }
}
