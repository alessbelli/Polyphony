package com.example.aless.polyphony;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mainButtonServer;
    Button mainButtonClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Set button listener for client
        mainButtonClient = (Button) findViewById(R.id.client_button);
        mainButtonClient.setOnClickListener(this);


        // Set button listener for server
        mainButtonServer = (Button) findViewById(R.id.server_button);
        mainButtonServer.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    public void jumpHelp(MenuItem v) {
        Intent helpIntent = new Intent(this, HelpActivity.class);
        startActivity(helpIntent);
    }


    public void jumpWifiSettings(MenuItem v){

        startActivity(new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS));
    }

    @Override
    public void onClick(View v) {
        // Go to new activity
        if (v==mainButtonServer){
            Intent serverIntent=new Intent(this, ServerActivity.class);
            startActivity(serverIntent);
        }
        if (v==mainButtonClient){
            Intent clientIntent=new Intent(this, ClientActivity.class);
            startActivity(clientIntent);
        }

    }

}
