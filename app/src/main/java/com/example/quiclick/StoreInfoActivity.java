package com.example.quiclick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class StoreInfoActivity extends AppCompatActivity {
    Button review_button;
    Button reservation_button;
    TextView text_name;
    TextView text_des;
    TextView text_call;
    TextView text_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storeinfo);


        review_button = (Button) findViewById(R.id.review_button);
        reservation_button = (Button) findViewById(R.id.reservation_button);
        text_name=(TextView)findViewById(R.id.text_name);
        text_des=(TextView)findViewById(R.id.text_des);
        text_call=(TextView)findViewById(R.id.text_call);
        text_add=(TextView)findViewById(R.id.text_add);
        String name = getIntent().getStringExtra("name");
        String des=getIntent().getStringExtra("des");
        String call=getIntent().getStringExtra("call");
        String add=getIntent().getStringExtra("add");
        text_name.setText(name);
        text_des.setText(des);
        text_call.setText(call);
        text_add.setText(add);
        review_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StoreInfoActivity.this,ReviewActivity.class);
                startActivity(intent);
            }
        });
        reservation_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StoreInfoActivity.this,ReservationActivity.class);
                startActivity(intent);
            }
        });


//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_reviewmenu:
//                startActivity(new Intent(getApplicationContext(), ReviewActivity.class));
//                return true;
//            default:
//                return false;
//        }
//    }


    }


}
//    public boolean onCreateOptionsMenu(Menu menu) { //액션바에 플러스 누르면 메뉴 추가 액티비티
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.reviewmenu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }