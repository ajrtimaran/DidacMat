package com.example.didacmat;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Suma extends AppCompatActivity {

    ImageView numero1;
    ImageView numero2;
    Button boton1, boton2, boton3;

    TextView reloj, puntos;


    private CountDownTimer timer;
    private int tiempo, segundos;

    private int suma;
    private int puntuacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_suma);
        numero1 = findViewById(R.id.imageViewN1);
        numero2 = findViewById(R.id.imageViewN2);
        boton1 = findViewById(R.id.buttonr1);
        boton2 = findViewById(R.id.buttonr2);
        boton3 = findViewById(R.id.buttonr3);

        reloj = findViewById(R.id.textViewTiempo);
        puntos = findViewById(R.id.textViewPuntos);

        segundos = 20;
        iniciarJuego();
        nuevaSuma();
    }

    public void iniciarJuego(){
        tiempo = segundos;
        puntuacion = 0;
        reloj.setText(Integer.toString(tiempo));
        timer = new CountDownTimer(segundos*1000,1000 ) {
            @Override
            public void onTick(long millisUntilFinished) {
                tiempo -= 1;
                reloj.setText(Integer.toString(tiempo));
            }

            @Override
            public void onFinish() {
                 finalizarJuego();
            }
        };

        timer.start();
    }

    public void finalizarJuego(){
        numero1.setVisibility(View.INVISIBLE);
        numero2.setVisibility(View.INVISIBLE);
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
        Button b = (Button) v;
        int respuesta = Integer.parseInt(b.getText().toString());

        if (respuesta == suma){
            puntuacion += 1;


        }
        puntos.setText(Integer.toString(puntuacion));
        nuevaSuma();
    }

    public void nuevaSuma(){
        int n1;
        int n2;
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        cargarNumero(n1, numero1);
        cargarNumero(n2, numero2);

        suma = n1+n2;

        int v1 = Math.abs(suma - ((int) (Math.random() * n1) + 1));
        int v2 = Math.abs(suma + ((int) (Math.random() * n1) + 1));
        int v3 = Math.abs(v1 - ((int) (Math.random() * n2) + 1));




        int posicion = (int) (Math.random()*3);



        if (posicion == 0) v1 = suma;
        else{
            if (posicion == 1) v2 = suma;
            else v3 = suma;
        }
        boton1.setText(Integer.toString(v1));
        boton2.setText(Integer.toString(v2));
        boton3.setText(Integer.toString(v3));
    }
}
