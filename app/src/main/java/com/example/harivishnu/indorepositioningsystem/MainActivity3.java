package com.example.harivishnu.indorepositioningsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onclick(View v)
    {
        startActivity(new Intent(MainActivity3.this,MainActivity2.class));
    }
}
