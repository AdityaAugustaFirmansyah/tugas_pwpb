package com.example.tugaspwpb.rumustabung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.tugaspwpb.MainActivity;
import com.example.tugaspwpb.R;

public class RumusTabungActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtJari;
    double hasilAlas;
    double luas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus_tabung);
        edtJari = findViewById(R.id.edt_jari_jari);
        Button buttonResult = findViewById(R.id.btn_result);
        Button buttonResult1 = findViewById(R.id.btn_result1);
        buttonResult.setOnClickListener(this);
        buttonResult1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_result){
            hasilAlas = 2*3.14*Double.parseDouble(edtJari.getText().toString());
            luas = 2*3.14*Double.parseDouble(edtJari.getText().toString());
            Intent intent = new Intent(RumusTabungActivity.this,Result.class);
            intent.putExtra("result",hasilAlas);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_result1){
            luas = 2*3.14*Double.parseDouble(edtJari.getText().toString())*Double.parseDouble(edtJari.getText().toString());
            Intent intent1 = new Intent(RumusTabungActivity.this,Result.class);
            intent1.putExtra("result",luas);
            startActivity(intent1);
        }
    }
}
