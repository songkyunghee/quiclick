package com.example.quiclick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class JoinActivity extends AppCompatActivity {
    final static String TAG = "AndroidNodeJS";
    final static String defaultUrl = "http://13.209.244.98:3000";
 Button cancel_button;
    Button sign_ok_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        canselComponent();



        sign_ok_button = (Button)findViewById(R.id.ok_button);
        sign_ok_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText edit_name = (EditText) findViewById(R.id.join_name);
                EditText edit_password = (EditText) findViewById(R.id.join_password);
                EditText edit_id = (EditText) findViewById(R.id.join_id);
                JSONObject postDataParam = new JSONObject();
                try {
                    postDataParam.put("name", edit_name.getText().toString());
                    postDataParam.put("username", edit_id.getText().toString());
                    postDataParam.put("password", edit_password.getText().toString());

                } catch (JSONException e) {
                    Log.e(TAG, "JSONEXception");
                }
                new InsertData(JoinActivity.this).execute(postDataParam);

            }
        });

    }
    void canselComponent() {
        cancel_button=(Button)findViewById(R.id.cancel_button);
        cancel_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(JoinActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
