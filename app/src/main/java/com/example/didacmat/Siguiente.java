package com.example.didacmat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Siguiente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente);
    }
public void Adicion(View v) {
    Intent intent = new Intent(this, Suma. class);
    startActivity(intent);
}
public void Sustraccion(View v){
        Intent intent = new Intent(this, Resta. class);
        startActivity(intent);
}
public void Multiplicacion(View v){
        Intent intent = new Intent(this, Duplico. class);
        startActivity(intent);
}
public void Division(View v){
        Intent intent = new Intent(this, Fraccionar. class);
        startActivity(intent);
}
}
