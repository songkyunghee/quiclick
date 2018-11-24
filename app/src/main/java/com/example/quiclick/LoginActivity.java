package com.example.quiclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    final static String TAG = "AndroidNodeJS";
    final static String defaultUrl = "http://54.180.102.223";
    Button sign_up_button;
    Button sign_in_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        joinComponent();

        sign_in_button = (Button)findViewById(R.id.sign_in_button);
        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ID_form = (EditText) findViewById(R.id.ID_form);
                EditText password_form = (EditText) findViewById(R.id.password_form);
                JSONObject postDataParam = new JSONObject();
                try {
                    postDataParam.put("id", ID_form.getText().toString());
                    postDataParam.put("password", password_form.getText().toString());
                    Toast.makeText(getApplicationContext(), "Login Success!",Toast.LENGTH_SHORT ).show();

                } catch (JSONException e) {
                    Log.e(TAG, "JSONEXception");
                }
                new GetData(LoginActivity.this).execute(postDataParam);
                Intent intent=new Intent(LoginActivity.this,StoreActivity.class);
                startActivity(intent);
            }
        });
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
