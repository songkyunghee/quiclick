package com.example.quiclick;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by 송경희 on 2018-11-15.
 */

abstract public class GetRequest extends AsyncTask<JSONObject, Void, String> {
    final static String TAG = "AndroidNodeJS";
    Activity activity;
    URL url;
    public GetRequest(Activity activity) {
        this.activity = activity;
    }





}


