package com.sainoxsa.final_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.PasswordAuthentication;

public class LoginActivity extends AppCompatActivity {
    EditText user, pass;
Button inicio,registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user=(EditText)findViewById(R.id.user);
        pass=(EditText)findViewById(R.id.pass);


        registro= (Button)findViewById(R.id.registro);
        inicio=(Button)findViewById(R.id.inicio);


        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,AdminActivity.class);
                startActivity(intent);
            }
        });
    }

}
