package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText confirm;
    EditText password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Intent intent=getIntent();

        name=findViewById(R.id.username);
        email=findViewById(R.id.email);
        confirm=findViewById(R.id.confirm);
        password=findViewById(R.id.password);
        btn=findViewById(R.id.b_signIn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(second.this, MainActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}
