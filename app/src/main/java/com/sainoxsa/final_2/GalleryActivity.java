package com.sainoxsa.final_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GalleryActivity extends AppCompatActivity {
Button volcan, mica, paramo,secas; //Declaracion de Variables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        //Declaracion de variables y de los botones de acceso
        volcan= (Button)findViewById(R.id.volcan);
        mica= (Button)findViewById(R.id.mica);
        paramo= (Button)findViewById(R.id.paramo);
        secas =(Button)findViewById(R.id.secas);


        /*accion para dirigir a los botones de acceso a las diferentes activity*/
        secas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, Secas.class);
                startActivity(intent);
            }
        });

        /*accion para dirigir a los botones de acceso a las diferentes activity*/
        volcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(GalleryActivity.this,VolcanActivity.class);
                startActivity(intent);
            }


        });
        /*accion para dirigir a los botones de acceso a las diferentes activity*/
        mica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, LagunaActivity.class);
                startActivity(intent);
            }
        });
        /*accion para dirigir a los botones de acceso a las diferentes activity*/
        paramo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, ParamoActivity.class);
                startActivity(intent);
            }
        });
    }


}
