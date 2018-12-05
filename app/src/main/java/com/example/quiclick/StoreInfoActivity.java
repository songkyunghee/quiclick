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
   TextView storename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storeinfo);


        review_button = (Button) findViewById(R.id.review_button);
        reservation_button = (Button) findViewById(R.id.reservation_button);
         storename=(TextView)findViewById(R.id.storename);

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

    public void settext (String result) {

            storename.setText(result);

//
    }
}
//    public boolean onCreateOptionsMenu(Menu menu) { //액션바에 플러스 누르면 메뉴 추가 액티비티
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.reviewmenu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }