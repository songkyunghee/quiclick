package com.example.quiclick;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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

/**
 * Created by 송경희 on 2018-11-27.
 */

public class StoreData extends GetRequest{

    public StoreData(Activity activity) {
        super(activity);
    }

    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://13.209.244.98:3000/store/storelist");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onPostExecute(String jsonString) {
        if (jsonString == null)
            return;
        try {
            JSONObject resultJSON = new JSONObject(jsonString);

            ArrayList<Store> arrayList = getArrayListFromJSONString(jsonString);

                ArrayAdapter adapter = new ArrayAdapter(activity,
                        android.R.layout.simple_list_item_1,
                        arrayList.toArray());
                ListView txtList = activity.findViewById(R.id.listView);
                txtList.setAdapter(adapter);
               // txtList.setDividerHeight(10);
            }

        catch (JSONException e) {
            e.printStackTrace();
        }
    }



    protected ArrayList<Store> getArrayListFromJSONString(String jsonString) {
        ArrayList<Store> output = new ArrayList();
        try {

            JSONArray jsonArray = new JSONArray(jsonString);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject = (JSONObject) jsonArray.get(i);

                Store store = new Store(
                        jsonObject.getString("name"),
                        jsonObject.getString("des")
                        );

                output.add(store);
            }
        } catch (JSONException e) {
            Log.e(TAG, "Exception in processing JSONString.", e);
            e.printStackTrace();
        }
        return output;
    }
}
