package com.example.myapplication7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button sign_up_button;
    Button sign_in_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sign_up_button = (Button)findViewById(R.id.sign_up_button);
        sign_in_button = (Button)findViewById(R.id.sign_in_button);

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.sign_up_button:     // 회원가입 버튼
                        Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                    case R.id.sign_in_button:    // 로그인 버튼

            /*
                Intent intent2 = new Intent(main.this, login.class);
                startActivity(intent2);
                finish();
                break;
                */
                }



            }
        });




    }
}
