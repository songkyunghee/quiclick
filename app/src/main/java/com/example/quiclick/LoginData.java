package com.example.quiclick;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;



/**
 * Created by 송경희 on 2018-11-15.
 */

public class LoginData extends PostRequest{

    public LoginData(Activity activity) {
        super(activity);
    }
    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://13.209.244.98:3000/newus/authenticate");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    protected void onPostExecute(String result) {
        try {
            JSONObject resultJSON = new JSONObject(result.toString());

            String successVaule=resultJSON.get("success").toString();
            if(successVaule.equals("true")) {
                Toast.makeText(activity, "Login Success!",Toast.LENGTH_SHORT ).show();
                    Intent intent= new Intent(activity, StoreActivity.class);
                    activity.startActivity(intent);

            }
            else{
                Toast.makeText(activity, "Login Fail",Toast.LENGTH_SHORT ).show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
