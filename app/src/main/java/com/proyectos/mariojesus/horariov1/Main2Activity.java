package com.proyectos.mariojesus.horariov1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button volver;
    Button materia1;
    //String


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


// materia 1
        materia1 = (Button)findViewById(R.id.button9);
        materia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mate1 = new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(mate1);
            }
        });

// volver
        volver = (Button)findViewById(R.id.button15);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent volverrrr = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(volverrrr);
            }
        });
    }
}
