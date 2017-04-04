package com.proyectos.mariojesus.horariov1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);





        // volver
        volver = (Button)findViewById(R.id.button22);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent volverrrr = new Intent(Main3Activity.this,MainActivity.class);
                startActivity(volverrrr);
            }
        });


    }
}
