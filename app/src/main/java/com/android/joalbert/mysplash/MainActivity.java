package com.android.joalbert.mysplash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.android.joalbert.mysplash.com.android.joalbert.splash.SplashActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(MainActivity.this, SplashActivity.class);

        startActivity(intent);
        // elimina la actividad
        finish();
    }
}
