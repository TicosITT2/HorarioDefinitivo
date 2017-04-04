package com.proyectos.mariojesus.horariov1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button primers;
    Button segundos;
    Button tercers;
    Button cuartos;
    Button quintos;
    Button sextos;
    Button septimos;
    Button Octavos;
    Button novenos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//semestre 1
        primers = (Button)findViewById(R.id.button);
        primers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent primer = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(primer);
            }
        });


//semestre 2
        segundos = (Button)findViewById(R.id.button2);
        segundos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent segundo = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(segundo);
            }
        });
//semestre 3
        tercers = (Button)findViewById(R.id.button3);
        tercers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tercero = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(tercero);
            }
        });
    }
}
