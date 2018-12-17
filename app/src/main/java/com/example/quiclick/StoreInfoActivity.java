package com.example.quiclick;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class StoreInfoActivity extends AppCompatActivity {

    Button review_button;
    Button reservation_button;
    TextView text_name;
    TextView text_des;
    TextView text_call;
    TextView text_add;
    TextView menu1;
    TextView menu2;
    TextView menu3;
    //TextView menu_1;
    ImageView store_image;
    String name;
    String pic;
    String call;
   // int count;
    Bitmap bitmap;
    URL url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storeinfo);


        review_button = (Button) findViewById(R.id.review_button);
        reservation_button = (Button) findViewById(R.id.reservation_button);
        text_name=(TextView)findViewById(R.id.text_name);
       // menu_1=(TextView)findViewById(R.id.menu_1);
        text_des=(TextView)findViewById(R.id.text_des1);
        text_call=(TextView)findViewById(R.id.text_call);
        text_add=(TextView)findViewById(R.id.text_add);
        menu1=(TextView)findViewById(R.id.menu1);
        menu2=(TextView)findViewById(R.id.menu2);
        menu3=(TextView)findViewById(R.id.menu3);
        store_image=(ImageView)findViewById(R.id.storeimg);
        name = getIntent().getStringExtra("name");
        String des1=getIntent().getStringExtra("des1");
         call=getIntent().getStringExtra("call");
        String add=getIntent().getStringExtra("add");
        String des2=getIntent().getStringExtra("des2");
        String des3=getIntent().getStringExtra("des3");
       // new StoreInfoData(StoreInfoActivity.this).execute();
        pic=getIntent().getStringExtra("pic");
      //  count=getIntent().getIntExtra("count",1);
    Thread mThread = new Thread() {
        public void run() {
            try{
                 url=new URL(pic);
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                conn.setDoInput(true);
                conn.connect();

                InputStream is = conn.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);


            }catch(IOException ex) {

            }
        }
    };
    mThread.start();
        try{
            mThread.join();
            store_image.setImageBitmap(bitmap);
        }catch (InterruptedException e) {

        }


        text_name.setText(name);
        text_des.setText(des1);
        text_call.setText(call);
        text_add.setText(add);
        menu1.setText(des1);
        menu2.setText(des2);
        menu3.setText(des3);
        //store_image.setImageBitmap(pic);
        review_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StoreInfoActivity.this,ReviewActivity.class);
                intent.putExtra("name",name);//가게 이름을 리뷰 액티비티로 보냄
                startActivity(intent);
            }
        });
        reservation_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StoreInfoActivity.this,ReservationActivity.class);
                intent.putExtra("name",name);
           //     intent.putExtra("count",count);
                startActivity(intent);
            }
        });

//        btn.setOnClickListener(new View.OnClickListener() { //전화 모양 버튼 누르면 다이얼 화면 실행
//
//            @Override
//            public void onClick(View view) {
//
//                Intent implicit_intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tell:"+call));
//
//                startActivity(implicit_intent);
//
//            }
//
//        });




    }


}
