package com.appex.circularprogressnotifier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import com.appex.circularprogressnotify.CircularProgress;

public class MainActivity extends AppCompatActivity {

    @Override
    @SuppressWarnings("deprecation")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CircularProgress circularProgress = (CircularProgress) findViewById(R.id.circular_progress);
        circularProgress.init(getApplicationContext(), getResources().getColor(R.color.primary_light),
                getResources().getColor(R.color.primary),
                getResources().getColor(R.color.primary_dark));
        circularProgress.setProgress(25);
    }
}
