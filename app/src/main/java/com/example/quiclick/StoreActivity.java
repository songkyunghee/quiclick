package com.example.quiclick;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


        ListView txtList = (ListView) findViewById(R.id.listView);
       // txtList.setAdapter();
        txtList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter = adapterView.getAdapter();
                JSONObject postDataParam = new JSONObject();
                try {
                    postDataParam.put("id", ((Store) adapter.getItem(i)).id);
                   // postDataParam.put("name", ((stores) adapter.getItem(i)).name);
                    //postDataParam.put("des", ((stores) adapter.getItem(i)).des);
                } catch (JSONException e) {
                    Log.e(TAG, "JSONEXception");
                }
                // new InsertData(StoreActivity.this).execute(postDataParam);
                new StoreData(StoreActivity.this).execute();
            }
        });
    }
}
