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
            url = new URL( "http://13.209.244.98:3000/users/register");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
