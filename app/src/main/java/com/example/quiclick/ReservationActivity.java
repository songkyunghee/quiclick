package com.example.quiclick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class ReservationActivity extends AppCompatActivity {
    final static String TAG = "AndroidNodeJS";
    final static String defaultUrl = "http://13.209.244.98:3000";
   TextView text_massage;
    TextView text_waitnum;
    Button button_reservation;
    String name;
  //  int count;
   // String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        text_massage=(TextView)findViewById(R.id.text_message);
       text_waitnum=(TextView)findViewById(R.id.text_waitnum);
        button_reservation=(Button)findViewById(R.id.button_reservation);
        name = getIntent().getStringExtra("name");

        new ReservationGetData(ReservationActivity.this).execute();

        button_reservation.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                JSONObject postDataParam = new JSONObject();

                try {
                    postDataParam.put("name",name);
                    postDataParam.put("count", Integer.parseInt(text_waitnum.getText().toString())+1);


                } catch (JSONException e) {
                    Log.e(TAG, "JSONEXception");
                }
               new ReservationData(ReservationActivity.this).execute(postDataParam);
                new ReservationGetData(ReservationActivity.this).execute();
            }
        });
    }
}
