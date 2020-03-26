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

public class InfoActivity extends AppCompatActivity {


    private FirebaseAuth mAuth;
    EditText email,password;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        mAuth = FirebaseAuth.getInstance();

        email = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        register = (Button) findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userE = email.getText().toString();
                String passE = password.getText().toString();

                if (TextUtils.isEmpty(userE)) {
                    Toast.makeText(getApplicationContext(), "Coloca un correo", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(passE)) {
                    Toast.makeText(getApplicationContext(), "Coloca una contraseña", Toast.LENGTH_SHORT).show();
                }

                mAuth.createUserWithEmailAndPassword(userE, passE).addOnCompleteListener(InfoActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Toast.makeText(getApplicationContext(), "Se ha creado el usuario", Toast.LENGTH_SHORT).show();

                                if (!task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(), "Tenemos un problema", Toast.LENGTH_SHORT).show();

                                }
                                Intent intent = new Intent(InfoActivity.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        }
                );


            }
        });
    }
}
