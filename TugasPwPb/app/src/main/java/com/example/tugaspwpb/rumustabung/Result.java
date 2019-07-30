package com.example.tugaspwpb.rumustabung;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tugaspwpb.R;

public class Result extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView t = findViewById(R.id.tv_result);
        final String s = String.valueOf(getIntent().getDoubleExtra("result",0));
        Button button = findViewById(R.id.btn_back_result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setData(Uri.parse(s));
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        t.setText(s);
    }
}
