package com.shrey.doc3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    public TextInputEditText inputPhone;
    public ImageView logo,signin_txt,or_txt;
    public ImageButton signin_btn,google_login,fb_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputPhone = findViewById(R.id.phone);
        logo = findViewById(R.id.logo);
        signin_txt = findViewById(R.id.signin_txt);
        or_txt = findViewById(R.id.or_txt);
        signin_btn = findViewById(R.id.signin_btn);
        google_login = findViewById(R.id.google_btn);
        fb_login = findViewById(R.id.fb_btn);

        final String ShreyNumb = "8320876311";
        final String PoojanNumb = "8849407882";
        final String GauravNumb = "7972153009";
        final String ShreyaNumb = "9595856857";
        final String SouravNumb = "6205418832";
        final String SahilNumb = "7057831400";


        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String numb = inputPhone.getText().toString().trim();

                if(numb.equals(ShreyNumb) || numb.equals(ShreyaNumb) || numb.equals(PoojanNumb) || numb.equals(GauravNumb) ||numb.equals(SouravNumb) || numb.equals(SahilNumb) || numb.equals("0")) {
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Incorrect Number!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
