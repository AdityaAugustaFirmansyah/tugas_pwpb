package com.example.tugaspwpb.rumustabung;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tugaspwpb.R;

public class Result extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView t = findViewById(R.id.tv_result);
        String s = String.valueOf(getIntent().getDoubleExtra("result",0));
        t.setText(s);
    }
}
