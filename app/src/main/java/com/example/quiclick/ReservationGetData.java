package com.example.quiclick;

import android.app.Activity;
import android.util.Log;
import android.widget.ArrayAdapter;
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
 * Created by 송경희 on 2018-11-15.
 */

public class ReservationGetData extends GetRequest3 { //reservation count 가져오는 클래스

int reservation_num;
    public ReservationGetData(Activity activity) {

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
        //ArrayList<Reservation> arrayList = getArrayListFromJSONString(jsonString);
       // text_waitnum=(TextView)activity.findViewById(R.id.text_waitnum);
    // text_waitnum.setText(arrayList.toArray(1));

        try {

            JSONObject object= new JSONObject(jsonString);
            JSONArray jsonArray = object.getJSONArray("store");

            for (int i = 0; i < jsonArray.length(); i++) {


                String name = ((ReservationActivity)activity).name;


                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                if(jsonObject.getString("name").equals(name)) {
                   reservation_num=jsonObject.getInt("count");

//                    Reservation reservation = new Reservation(
//                            jsonObject.getString("name"),
//                            jsonObject.getInt("count")
//                    );


                    //output.add(reservation);
                }
            }
            ((ReservationActivity)activity).text_waitnum.setText(String.valueOf(reservation_num));



        } catch (JSONException e) {
            Log.e(TAG, "Exception in processing JSONString.", e);
            e.printStackTrace();
        }



    }


}
