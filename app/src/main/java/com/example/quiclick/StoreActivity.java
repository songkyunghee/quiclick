package com.example.quiclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class StoreActivity extends AppCompatActivity {
    final static String TAG = "AndroidNodeJS";
    static String name;
   StoreInfoActivity storeInfoActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //store list 출력 액티비티
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        new StoreData(StoreActivity.this).execute();
       // final TextView storename=(TextView)findViewById(R.id.storename);
       // new StoreData(StoreActivity.this).execute();
       ListView txtList = (ListView) findViewById(R.id.listView);
       // txtList.setAdapter();
        txtList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter = adapterView.getAdapter();
                JSONObject postDataParam = new JSONObject();
                 name=((Store) adapter.getItem(i)).name;
                String des1=((Store) adapter.getItem(i)).des1;
                String des2=((Store) adapter.getItem(i)).des2;
                String des3=((Store) adapter.getItem(i)).des3;
                String call=((Store) adapter.getItem(i)).call;
                String add=((Store) adapter.getItem(i)).add;
                String pic=((Store)adapter.getItem(i)).pic;
               // int count=((Store)adapter.getItem(i)).count;

                Intent intent=new Intent(StoreActivity.this,StoreInfoActivity.class);
                //Intent intent2=new Intent(StoreActivity.this,ReviewActivity.class);
               // Intent intent3=new Intent(StoreActivity.this,ReviewGetData.class);
                intent.putExtra("name",name);
                intent.putExtra("des1",des1);
                intent.putExtra("des2",des2);
                intent.putExtra("des3",des3);
                intent.putExtra("call",call);
                intent.putExtra("add",add);
                intent.putExtra("pic",pic);
        //        intent.putExtra("count",count);

                //intent3.putExtra("name",name);
                startActivity(intent);

               // startActivity(intent3);


//                try {
//                   // postDataParam.put("id", ((Store) adapter.getItem(i)).id);
//                    postDataParam.put("name", ((Store) adapter.getItem(i)).name);
//                    postDataParam.put("des", ((Store) adapter.getItem(i)).des);
//
//
//
//                } catch (JSONException e) {
//                    Log.e(TAG, "JSONEXception");
//                }
//


            }
        });

    }
}
