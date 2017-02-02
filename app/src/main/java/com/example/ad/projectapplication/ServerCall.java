package com.example.ad.projectapplication;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Ankit on 2017-02-02.
 */
public class ServerCall extends AsyncTask<String,Void,String> {
        Activity activity;
    String url;
    int flag;
    HashMap hm;
    onResponse response;
    ProgressDialog pd;

    public interface onResponse{
        void getResponse(String s,int flag);
    }


    public ServerCall(Activity activity,String url, HashMap hm,int flag)
    {
        this.activity=activity;
        response=(onResponse)activity;
        this.hm=hm;
        this.flag=flag;

    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd=new ProgressDialog(this.activity);
        pd.setCancelable(false);
        pd.setTitle("Loading...");
        pd.show();

    }

    @Override
    protected String doInBackground(String... strings) {
        //http client
        OkHttpClient client=new OkHttpClient();
        //building request
        Request builder=new Request.Builder().url(url).build();
        if(hm!=null){

        }

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
