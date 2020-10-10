package com.akilisoft.tech.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button validerButton;
    private EditText nom,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        validerButton = findViewById(R.id.button);
        nom= findViewById(R.id.editText);
        password= findViewById(R.id.editText2);

        validerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getBaseContext(),MainActivity.class);

                String nomre = nom.getText().toString();
                String passre = password.getText().toString();
                Toast.makeText(getApplicationContext(),"Bonjour monsieur "+nomre+" password "+passre ,Toast.LENGTH_SHORT).show();

                startActivity(myintent);
            }
        });
    }
}