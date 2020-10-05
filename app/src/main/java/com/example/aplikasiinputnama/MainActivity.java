package com.example.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText TextNama;
    private TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNama = findViewById(R.id.et_name);
        Hasil = findViewById(R.id.tv_label);
    }

    public void ShowName (View view) {
        Hasil.setText("Nama Anda: "+TextNama.getText());
    }
}