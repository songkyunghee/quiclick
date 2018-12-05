package com.example.quiclick;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by 송경희 on 2018-11-27.
 */

public class StoreInfoData extends GetRequest{
        private  MyAdapter myAdapter;
       public  ArrayList<Store> output;
    //TextView storename;
    public StoreInfoData(Activity activity) {
        super(activity);
    }

    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://13.209.244.98:3000/stores/storelist");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onPostExecute(String jsonString) {
        if (jsonString == null)
            return;
       // TextView storename=(TextView)activity.findViewById(R.id.storename);
        Intent intent=new Intent(activity,StoreInfoActivity.class);
        activity.startActivity(intent);
        //storeInfoActivity.settext(postDataParam);




    }



}
