package com.example.quiclick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class StoreInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storeinfo);
    }
    public boolean onCreateOptionsMenu(Menu menu) { //액션바에 플러스 누르면 메뉴 추가 액티비티
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.reviewmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_reviewmenu:
                startActivity(new Intent(getApplicationContext(), ReviewPlusActivity.class));
                return true;
            default:
                return false;
        }
    }


}
