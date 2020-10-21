package com.example.didacmat;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Suma extends AppCompatActivity {

    ImageView numero1;
    ImageView numero2;
    Button boton1, boton2, boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_suma);
        numero1 = findViewById(R.id.imageViewN1);
        numero2 = findViewById(R.id.imageViewN2);
        boton1 = findViewById(R.id.buttonr1);
        boton2 = findViewById(R.id.buttonr2);
        boton3 = findViewById(R.id.buttonr3);

        nuevaSuma();
    }

    public void cargarNumero(int numero, ImageView image){
        switch (numero){
            case 0:
                image.setImageResource(R.drawable.n0);
                break;
            case 1:
                image.setImageResource(R.drawable.n1);
                break;
            case 2:
                image.setImageResource(R.drawable.n2);
                break;
            case 3:
                image.setImageResource(R.drawable.n3);
                break;
            case 4:
                image.setImageResource(R.drawable.n4);
                break;
            case 5:
                image.setImageResource(R.drawable.n5);
                break;
            case 6:
                image.setImageResource(R.drawable.n6);
                break;
            case 7:
                image.setImageResource(R.drawable.n7);
                break;
            case 8:
                image.setImageResource(R.drawable.n8);
                break;
            case 9:
                image.setImageResource(R.drawable.n9);
                break;
        }
    }

    public void evaluaRespuesta(View v){

        nuevaSuma();
    }

    public void nuevaSuma(){
        int n1;
        int n2;
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        cargarNumero(n1, numero1);
        cargarNumero(n2, numero2);

        int res = n1+n2;

        int v1 = Math.abs(res - ((int) (Math.random() * n1) + 1));
        int v2 = Math.abs(res + ((int) (Math.random() * n1) + 1));
        int v3 = Math.abs(v1 - ((int) (Math.random() * n2) + 1));




        int posicion = (int) (Math.random()*3);



        if (posicion == 0) v1 = res;
        else{
            if (posicion == 1) v2 = res;
            else v3 = res;
        }

        boton1.setText(Integer.toString(v1));
        boton2.setText(Integer.toString(v2));
        boton3.setText(Integer.toString(v3));
    }

}
