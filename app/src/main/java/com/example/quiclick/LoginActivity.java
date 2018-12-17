package com.example.quiclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity { //로그인 액티비티
    final static String TAG = "AndroidNodeJS";
    final static String defaultUrl = "http://13.209.244.98:3000";
    Button sign_up_button;
    Button sign_in_button;
    String username;



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
                //String success= null;
                JSONObject postDataParam = new JSONObject();
                username=ID_form.getText().toString();

               // startActivity(intent);
                try {
                    postDataParam.put("username", ID_form.getText().toString());
                    postDataParam.put("password", password_form.getText().toString());
//                    Intent intent=new Intent(LoginActivity.this,ReservationActivity.class);
//                    intent.putExtra("username",username);
                   // Toast.makeText(getApplicationContext(), "Login Success!",Toast.LENGTH_SHORT ).show();
                    //success = postDataParam.getString("success");
//                    if(success=="true") {
//                        Intent intent= new Intent(LoginActivity.this, StoreActivity.class);
//                        startActivity(intent);
//                    }
                } catch (JSONException e) {
                    Log.e(TAG, "JSONEXception");
                }
                new LoginData(LoginActivity.this).execute(postDataParam);






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

//void loginComponent() {
//    Intent intent= new Intent(LoginActivity.this, StoreActivity.class);
//    startActivity(intent);
//}




    }

