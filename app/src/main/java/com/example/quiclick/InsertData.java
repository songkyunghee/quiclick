package com.example.quiclick;

import android.app.Activity;
import android.widget.EditText;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 송경희 on 2018-11-15.
 */

public class InsertData extends PostRequest{
    public InsertData(Activity activity) {
        super(activity);
    }
    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://54.180.102.223/adduser");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
