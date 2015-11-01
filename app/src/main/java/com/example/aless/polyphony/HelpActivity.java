package com.example.aless.polyphony;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Aless on 30/10/2015.
 */
public class HelpActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_help);
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}