package com.example.cookiescounter;

// Se importan librerias usadas en el proyecto
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
//--------------------------------------------------------------------------------------------------
public class MainActivity extends AppCompatActivity implements View.OnClickListener {  //Se implementa View.onClickListener para que la ventana pueda ser clickeable


    private  int conteo = 0;  // Se crea variable donde se va a guardar el conteo
    private TextView Tcontar; // Se crea variable para enlazar el textView donde se mostrara el conteo
    private static final String TAG = MainActivity.class.getSimpleName(); //se crea Constante para dar información en el log
    private static final String CONTAR = "conteo"; //Se crea Constante para guardar estado de variables antes de onDestroy y poder recuperar en onCreate

    @Override  //se sobre escribe metodo vacio onCreate
    protected void onCreate(Bundle savedInstanceState) {  //Se declara metodo protected void onCreate con parametro Bundle SavedInstanceState para recuperar información guardada antes del onDestroy
        super.onCreate(savedInstanceState); //siempre va, ni idea que es.
        Log.d(TAG, "onCreate");   //Se crea un log de onCreate

        if (savedInstanceState != null) {    //IF para preguntar si se guardo estado antes del onDestroy
            // Restore value of members from saved state
            conteo = savedInstanceState.getInt(CONTAR);  //Guardar en variable el estado guardado antes del onDestroy
        }

        setContentView(R.layout.activity_main);   //Se declara el layout a mostrar enel onCreate
        Tcontar = findViewById(R.id.Tcontar);      //Se enlaza la variable en .java con el objeto en .xml
        Tcontar.setText(String.valueOf(conteo));   //Se asigna el texto al objeto TContar de la variable conteo

        Button Bcontar = findViewById(R.id.Bcontar);  //Se enlaza el boton Bcontar del .xml y se crea la variable Bcontar en el .java
        Bcontar.setOnClickListener(this);     //se indica que este boton es clickeable con el onClickListener de esta actividad (this)

        Button Rcontar = findViewById(R.id.Rcontar); //Se enlaza el boton Rcontar del .xml y se crea la variable Rcontar en el .java
        Rcontar.setOnClickListener(this); //se indica que este boton es clickeable con el onClickListener de esta actividad (this)
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");  //Mensaje "onStart" en el Log usando la constante TAG
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume"); //Mensaje "onResume" en el Log usando la constante TAG
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause"); //Mensaje "onPause" en el Log usando la constante TAG
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop"); //Mensaje "onStop" en el Log usando la constante TAG
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy"); //Mensaje "onDestroy" en el Log usando la constante TAG
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {  //Metodo para guardar estado de variables antes de onDestroy y para recuperar en onCreate
        Log.d(TAG, "onSaveInstanceState:");   //Mensaje "onSaveInstanceState" en el Log usando la constante TAG
        savedInstanceState.putInt(CONTAR, conteo);  //se guarda el valor de la variable conteo en la constante CONTAR
        super.onSaveInstanceState(savedInstanceState); //Ni idea para que es pero siempre debe estar
    }

    @Override
    public void onClick(View v) {   //Se sobreescribe el metodo vacio onClick

        switch(v.getId()) {    //switch para identificar que boton se presiono y ejecutar su debida función

            case R.id.Bcontar:   //en el caso de que se presiona el boton Contar
                conteo++;        //se suma 1 a la variable conteo
                Tcontar.setText(String.valueOf((conteo))); //se muestra la varibale conteo en el textView Tcontar
                Toast.makeText(this, "Galleta contada", Toast.LENGTH_SHORT).show(); //Se genera un mensaje Toast para mostrar al usuario que si se ejecuto la función
                break;

            case R.id.Rcontar: //en el caso de que se presiona el boton Resetear
                conteo = 0; //se pone la variable conteo en 0
                Tcontar.setText(String.valueOf((conteo))); //se muestra la varibale conteo en el textView Tcontar
                Toast.makeText(this, "Reset completado", Toast.LENGTH_SHORT).show(); //Se genera un mensaje Toast para mostrar al usuario que si se ejecuto la función
                break;


        }
    }

}
