package com.example.contenproviderhuong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CONTACTS_ASK_PERMISSIONS= 1001;
    private static final int REQUEST_SMS_ASK_PERMISSIONS=1002;

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        addEvents();
    }

    private void addEvents() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyManHinhDanhBa();
            }
        });
    }

    private void XuLyManHinhDanhBa() {
        Intent intent=new Intent(MainActivity.this,Danhba.class);
        intent.setClassName("com.example.contentprovider_linh","com.example.contentprovider_linh.DanhBa");
        startActivity(intent);
    }

    private void AnhXa() {
        btn1=findViewById(R.id.button1);
    }
}