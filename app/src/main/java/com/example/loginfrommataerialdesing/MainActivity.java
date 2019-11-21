package com.example.loginfrommataerialdesing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
TextInputEditText email ,pass;
Button login,registretion;
int i=8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        login=findViewById(R.id.login);
        registretion=findViewById(R.id.Registration);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=email.getText().toString();
                String pas=pass.getText().toString();
                if (!mail.contains("@")){
                    email.setError("Email is not valid");
                    email.requestFocus();
                }
                else if (pas.length()<i){
                    pass.setError("Enter password more then 8 Digit");
                    pass.requestFocus();
                }
                else {
                    Toast.makeText(MainActivity.this,"OK",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
