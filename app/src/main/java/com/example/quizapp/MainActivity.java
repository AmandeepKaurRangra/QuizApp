package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText username, password ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signIn = (Button) findViewById(R.id.b_signIn);
        Button signUp=(Button) findViewById(R.id.signup);
       signIn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this,third.class);
              startActivity(intent);

           }
      });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,second.class);
                startActivity(intent);

            }
        });
    }
}
