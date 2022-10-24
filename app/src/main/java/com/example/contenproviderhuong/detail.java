package com.example.contenproviderhuong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class detail extends AppCompatActivity {
    TextView txtTen,txtSDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTen= (TextView) findViewById(R.id.textviewTen);
        txtSDT=(TextView) findViewById(R.id.textviewSDT);

        Intent intentD=getIntent();
        String Ten=intentD.getStringExtra("ten");
        txtTen.setText(Ten);
        String So=intentD.getStringExtra("so");
        txtSDT.setText(So);
    }
}