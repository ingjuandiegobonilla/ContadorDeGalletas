package com.example.cookiescounter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


public class dos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        Vista Vista1 = new Vista(this); //Declaramos un nuevo objeto llamad "Vista1" de nuestra clase "Vista" declarada mas abajo
        Vista1.performClick();
        setContentView(Vista1);  // Declaramos que la vista de esta actividad es Vista1

    }
}
 class Vista extends View{
    float x = 50;  //Coordenadas X para dibujar
    float y = 50;  //COordenadas y para dibujar
    String accion = "accion"; //Usada para saber si el dedo esta sobre la pantalla o en movimiento
     Path path = new Path(); // elemento de la clase Path que nos permite definir un trazo a partir de curvas o lineas.

     public Vista(Context context){   //Metodo constructor autogenerado
         super(context);
         // TODO Auto-generated constructor strub
     }

    public void onDraw(Canvas papel){   //Metodo onDraw que se encargara de dibujar
        Paint pincel = new Paint();  //se crea pincel con la clase Paint
        pincel.setStyle(Paint.Style.STROKE); //se selecciona un pincel stilo Stroke
        pincel.setStrokeWidth(6); //se selecciona un grosor de 6
        pincel.setColor(Color.BLUE); //se selecciona un color azul

        int ancho = papel.getWidth(); //Se guarda ancho del papel

        if (accion.equals("down")){ path.moveTo(x,y);} //Condicion para saber si esta abajo el dedo
        if (accion.equals("move")){ path.lineTo(x,y);} //Condicion para saber si esta en movimiento el dedo

        papel.drawRect(10,60,ancho-10,19, pincel); //Creamos un rectangulo
        papel.drawPath(path, pincel); //dibujaremos las condiciones
    }
 //Se usa onTouchEvent para obtener la posición del dedo y su accion
    public boolean onTouchEvent(MotionEvent e){
         x = e.getX();
         y = e.getY();
         if(e.getAction() == MotionEvent.ACTION_DOWN){ accion = "down"; }
        if(e.getAction() == MotionEvent.ACTION_MOVE){ accion = "move"; }
        invalidate();
        return true;
    }

 }