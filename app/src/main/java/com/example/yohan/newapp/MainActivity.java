package com.example.yohan.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import java.time.LocalDate;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    EditText editText3;
    EditText editText4;
    EditText editText5;


    Button button;
    Toolbar toolbar;

    public void onclickbutton(android.view.View View) {
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);


        String IdNum = editText3.getText().toString();
        String year = IdNum.substring(0, 2);
        String IdNumber = IdNum.substring(2, 5);
        int day = Integer.valueOf(IdNumber);
        String gender = "";
        String month = "";
        String Birthday = "";
        String day1 = "";
        //  int year1 = year


        if (day > 0) {
            if (day > 500) {
                gender = "Female";

                day = day - 500;
            } else if (day < 500) {
                gender = "Male";

                day = day;
            }

            if (day > 335) {
                day = day - 335;
                month = "December";

            } else if (day > 305) {
                day = day - 305;
                month = "November";

            } else if (day > 274) {
                day = day - 274;
                month = "Octomber";
            } else if (day > 244) {
                day = day - 244;
                month = "September";
            } else if (day > 213) {
                day = day - 213;
                month = "August";
            } else if (day > 182) {
                day = day - 182;
                month = "July";
            } else if (day > 152) {
                day = day - 152;
                month = "June";
            } else if (day > 121) {
                day = day - 121;
                month = "May";

            } else if (day > 91) {
                day = day - 91;
                month = "April";
            } else if (day > 60) {
                day = day - 60;
                month = "March";
            } else if (day > 31) {
                day = day - 31;
                month = "Febuary";
            } else if (day >= 1) {
                day = day;
                month = "January";
            }

            day1 = Integer.valueOf(day).toString();

        }
        Birthday = 19 + "" + year + "/" + month + "/" + day1;

        //    String Gender=gender;
        editText4.setText(Birthday);
        editText5.setText(gender);
        //  LocalDate date = LocalDate.of();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = " ";
        switch (item.getItemId()) {
            case R.id.Home_Page:
                msg = "Home page";
                break;
            case R.id.About:
                msg = "About";
                break;
            case R.id.Exit:
                msg = "Exit";
                break;
        }
        Toast.makeText(this, msg + "checked", Toast.LENGTH_LONG).show();


        return super.onOptionsItemSelected(item);

    }

}

