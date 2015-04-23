package com.hasyim.praktikumprojects;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Ahmad Hasyim BSA on 4/14/2015.
 */
public class InputActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_app);

        // Deklarasi/Buat Tombol
        Button tombol;
        //final EditText input;
        final EditText input;
        final TextView output;

        // konek kan dengan layout
        tombol = (Button) findViewById(R.id.btnPrint);
        //input = (EditText) findViewById(R.id.edtInput);
        input = (EditText) findViewById(R.id.edtInput);
        output = (TextView) findViewById(R.id.tvHasil);

        //Semua objek yang akan digunakan harus diinisialisasi
        // atau di dalam konsep object oriented diinstansiasi
        /**
         * setOnClickListener.
         * Method ini akan selalu mendengarkan klik pada objek Button btn.
         * Dan akan menampilkan sesuatu jika Button btn di-klik.

         * Selanjutnya kita akan menentukan apa yang akan dilakukan ketika objek Button btn di-klik.
         * Misalnya ketika Button btn ini di-klik,
         * maka aplikasi akan menampilkan teks yang sudah dimasukkan pada objek EditText
         * Perintah tersebut artinya adalah bahwa ketika Button btn di-klik maka objek tampil,
         * dimana tampil ini adalah sebuah TextView, akan diset atau diatur sebuah teks yang berbunyi
         * 'Nama anda +teks yang diinput pada EditText, selesai.
         *  output adalah sebuah objek EditText
         * */

        /**
         *
         * tombol.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        output.setText(input.getText().toString());
        }
        });*/

        tombol.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                output.setText(input.getText().toString());
            }
        });

    }
}
