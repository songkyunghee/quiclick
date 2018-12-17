package com.example.quiclick;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

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
            url = new URL( "http://13.209.244.98:3000/newus/register");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    protected void onPostExecute(String result) {
        try {
            JSONObject resultJSON = new JSONObject(result.toString());

            String successVaule=resultJSON.get("success").toString();
            if(successVaule.equals("true")) {
                Toast.makeText(activity, "회원가입 되었습니다",Toast.LENGTH_SHORT ).show();
                Intent intent=new Intent(activity,LoginActivity.class);
                activity.startActivity(intent);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
