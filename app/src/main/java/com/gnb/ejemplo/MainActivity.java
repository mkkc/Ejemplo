package com.gnb.ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.util.Pair;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
    }
}
