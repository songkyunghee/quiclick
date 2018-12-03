package com.example.quiclick;

import android.app.Activity;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 송경희 on 2018-11-15.
 */

public class DeleteData extends PostRequest{
    public DeleteData(Activity activity) {
        super(activity);
    }
    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://13.209.244.98/adduser");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
