package com.example.quiclick;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 송경희 on 2018-12-05.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Store> storeList;
    private LayoutInflater layoutInflater;

    public MyAdapter(Context context, int layout, ArrayList<Store> storeList){
        this.context=context;
        this.layout=layout;
        this.storeList=storeList;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return storeList.size();
    }

    @Override
    public Object getItem(int position) {
        return storeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos=position;
        if(convertView==null) {
            convertView=layoutInflater.inflate(layout, parent,false);

        }
        TextView item_text1=(TextView)convertView.findViewById(R.id.item_text1);
        TextView item_text2=(TextView)convertView.findViewById(R.id.item_text2);
        item_text1.setPaintFlags(item_text1.getPaintFlags() | Paint.FAKE_BOLD_TEXT_FLAG);

        item_text1.setText(storeList.get(pos).getName());
        item_text2.setText(storeList.get(pos).getDes());

        return convertView;
    }
}
