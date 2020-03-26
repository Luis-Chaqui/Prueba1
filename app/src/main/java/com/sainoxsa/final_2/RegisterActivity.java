package com.sainoxsa.final_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {


    private FirebaseAuth mAuth;
    EditText email,password;
    TextView register,recordar;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        email= (EditText)findViewById(R.id.user);
        password= (EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.inicio);
        register=(TextView)findViewById(R.id.registro);

/*Validacion de un correo electronico y contraseña para ingresar a un login*/

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userE = email.getText().toString();
                String passE = password.getText().toString();

                if (TextUtils.isEmpty(userE)) {
                    Toast.makeText(getApplicationContext(), "Coloca un correo", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(passE)) {
                    Toast.makeText(getApplicationContext(), "Coloca una contraseña", Toast.LENGTH_SHORT).show();
                }
                mAuth.signInWithEmailAndPassword(userE, passE).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (!task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Correo o contrasena incorrecto", Toast.LENGTH_SHORT).show();
                        } else {
                            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                                }
                            }
                         });
                     }
                });

               register.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(RegisterActivity.this, InfoActivity.class);
                       startActivity(intent);
                   }
               });




    }
}