package com.example.cookiescounter;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class dos extends AppCompatActivity implements View.OnClickListener {

    int movil;  //Variable donde se guardara la imagen seleccionada
    ImageView seleccion; //Imageview donde se mostrara la imagen seleccionada

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        //Enlazar variables Java con elementos XML
        ImageView r1 = findViewById(R.id.r1);
        ImageView r2 = findViewById(R.id.r2);
        ImageView r3 = findViewById(R.id.r3);
        ImageView r4 = findViewById(R.id.r4);
        ImageView r5 = findViewById(R.id.r5);
        seleccion = findViewById(R.id.imageView);
        Button wallpaper = findViewById(R.id.wallpaper);
        //Asignar posibilidad de ser clickeado a los objetos
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);
        wallpaper.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.r1:
                seleccion.setImageResource(R.drawable.r1); //Poner recurso en imageview seleccion
                movil = R.drawable.r1; // guardar recurso en variable movil
                break;
            case R.id.r2:
                seleccion.setImageResource(R.drawable.r2);
                movil = R.drawable.r2;
                break;
            case R.id.r3:
                seleccion.setImageResource(R.drawable.r3);
                movil = R.drawable.r3;
                break;
            case R.id.r4:
                seleccion.setImageResource(R.drawable.r4);
                movil = R.drawable.r4;
                break;
            case R.id.r5:
                seleccion.setImageResource(R.drawable.r5);
                movil = R.drawable.r5;
                break;
            case R.id.wallpaper:
                Bitmap fondo = BitmapFactory.decodeStream(getResources().openRawResource(movil));  //Creación variable bitmap con la selección guardada en variable movil
                WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext()); //Se instancia el wallpaper manager
                try {
                    myWallpaperManager.setBitmap(fondo);  //se aplica el bitmap fondo al wallpaper del telefono
                } catch (IOException e) {  //Exception -catch- always con -try-
                    e.printStackTrace();
                }
                break;
            default:
                break;


        }

    }
}
