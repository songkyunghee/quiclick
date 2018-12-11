package com.example.quiclick;

import android.app.Activity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by 송경희 on 2018-11-15.
 */

public class ReviewGetData extends GetRequest2 {


    public ReviewGetData(Activity activity) {

        super(activity);

    }
    @Override
    protected void onPreExecute() {

        try {
            url = new URL( "http://13.209.244.98:3000/reviews/reviewlist");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onPostExecute(String jsonString) {
        if (jsonString == null)
            return;
        ArrayList<Review> arrayList = getArrayListFromJSONString(jsonString);



        ArrayAdapter adapter = new ArrayAdapter(activity,
                android.R.layout.simple_list_item_1,
                arrayList.toArray());
        ListView txtList = activity.findViewById(R.id.listView2);
        txtList.setAdapter(adapter);
        //txtList.setDividerHeight(10);
    }

    protected ArrayList<Review> getArrayListFromJSONString(String jsonString) {

        ArrayList<Review> output = new ArrayList();
        try {

            JSONObject object= new JSONObject(jsonString);
            JSONArray jsonArray = object.getJSONArray("review");

            for (int i = 0; i < jsonArray.length(); i++) {

                // String name =activity.getIntent().getStringExtra("name");
                String name = ((ReviewActivity)activity).name;

                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
      if(jsonObject.getString("name").equals(name)) {
           Review review = new Review(
                   jsonObject.getString("name"),
                   jsonObject.getString("des")
           );


           output.add(review);
      }
            }
        } catch (JSONException e) {
            Log.e(TAG, "Exception in processing JSONString.", e);
            e.printStackTrace();
        }
        return output;
    }




}
