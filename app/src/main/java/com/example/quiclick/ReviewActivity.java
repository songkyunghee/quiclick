package com.example.quiclick;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

public class ReviewActivity extends AppCompatActivity { //review 액티비티
    final static String TAG = "AndroidNodeJS";
    final static String defaultUrl = "http://13.209.244.98:3000";
    EditText edit_review;
    Button add_review;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        name = getIntent().getStringExtra("name");

        new ReviewGetData(ReviewActivity.this).execute(); //리뷰 목록 불러오는 쓰레드 실행


        edit_review= (EditText)findViewById(R.id.edit_review);
        add_review=(Button)findViewById(R.id.add_review_button);

        add_review.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                JSONObject postDataParam = new JSONObject();

                try {
                    postDataParam.put("name",name);
                    postDataParam.put("des", edit_review.getText().toString());


                } catch (JSONException e) {
                    Log.e(TAG, "JSONEXception");
                }
               new ReviewData(ReviewActivity.this).execute(postDataParam);
                new ReviewGetData(ReviewActivity.this).execute();

            }
        });

}

}
