package com.example.yohan.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class HomePage extends AppCompatActivity {
    Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        toolbar1 = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg =" ";
        switch (item.getItemId()){
            case R.id.About:
                msg = "About";
                break;
            case R.id.Exit:
                System.exit(0);
                break;
        }

        Toast.makeText(this,msg +" checked" ,Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    public void onclickbutton(View view) {
    }
}


