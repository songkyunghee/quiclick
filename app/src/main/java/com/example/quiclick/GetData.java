package com.example.quiclick;

import android.app.Activity;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 송경희 on 2018-11-15.
 */

public class GetData extends GetRequest{
    public GetData(Activity activity) {
        super(activity);
    }
    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://13.209.206.111:3000/users/authenticate");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
