package com.sainoxsa.final_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import fragments.RegistroFragment;

public class MainActivity extends AppCompatActivity {
Button lugares,info,actividad, hospedaje,bio;
ImageButton inicio, compartir;
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaracion de variables
        lugares = (Button)findViewById(R.id.lugares);
        inicio=(ImageButton)findViewById(R.id.inicio);
        compartir=(ImageButton)findViewById(R.id.compartir);
        info=(Button)findViewById(R.id.informacion);
        actividad=(Button)findViewById(R.id.actividades);
        hospedaje=(Button)findViewById(R.id.hospedaje);
        bio=(Button)findViewById(R.id.flora);
       // bottomNavigationView=(BottomNavigationView)findViewById(R.id.boton);


       /* bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.register){
                    showSelectedFragments(new RegistroFragment());

                }

                if(item.getItemId() == R.id.compartir){

                }
                return true;
            }
        });*/



        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,BiodiversidadActivity.class);
                startActivity(intent);
            }
        });

        hospedaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HospedajeActivity.class);
                startActivity(intent);
            }
        });

        actividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PermitirActivity.class);
                startActivity(intent);
            }
        });


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                        startActivity(intent);
            }
        });

        lugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,GalleryActivity.class);
                startActivity(intent);
            }
        });

        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/paint");
                intent.putExtra(Intent.EXTRA_TEXT,"Disfruta de nuestra pagina http//:www.antisana.com");
                startActivity(Intent.createChooser(intent,"Compartir"));

            }
        });




    }
   /* private void showSelectedFragments(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();

    }*/
}
