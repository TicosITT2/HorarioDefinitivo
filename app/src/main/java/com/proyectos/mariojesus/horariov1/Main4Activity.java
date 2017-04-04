package com.proyectos.mariojesus.horariov1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        // volver
        volver = (Button)findViewById(R.id.button28);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volverrrr = new Intent(Main4Activity.this,MainActivity.class);
                startActivity(volverrrr);
            }
        });
    }
}
