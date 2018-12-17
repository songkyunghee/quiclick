package com.example.quiclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReservationActivity extends AppCompatActivity {
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
    //    count = getIntent().getIntExtra("count",1);
    //    text_waitnum.setText(String.valueOf(count));
    //    username = getIntent().getStringExtra("username");
        new ReservationGetData(ReservationActivity.this).execute();
    }
}
