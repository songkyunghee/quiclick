package com.example.quiclick;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 송경희 on 2018-11-15.
 */

public class ReviewData extends PostRequest2{ // review insert class
    public ReviewData(Activity activity) {
        super(activity);
    }
    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://13.209.244.98:3000/reviews/addreview");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(activity, "리뷰가 추가되었습니다",
                Toast.LENGTH_LONG).show();
    }


}
