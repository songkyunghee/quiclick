package com.example.quiclick;

import android.app.Activity;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 송경희 on 2018-11-15.
 */

public class ReservationData extends PostRequest3{ //reservation count 클래스
    public ReservationData(Activity activity) {
        super(activity);
    }
    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://13.209.244.98:3000/stores/count");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(activity, result,
                Toast.LENGTH_LONG).show();
    }


}
