package com.example.quiclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button sign_up_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        joinComponent();


    }

void joinComponent() {
    sign_up_button=(Button)findViewById(R.id.sign_up_button);
    sign_up_button.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent=new Intent(LoginActivity.this,JoinActivity.class);
            startActivity(intent);
        }
    });
}




    }

