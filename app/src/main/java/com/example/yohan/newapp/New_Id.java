package com.example.yohan.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class New_Id extends AppCompatActivity {

    EditText editText3;
    EditText editText4;
    EditText editText5;
    Toolbar toolbar2;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new__id);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        button2 = findViewById(R.id.button2);
        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = " ";
        switch (item.getItemId()) {
            case R.id.Home_Page:
                Intent i1 = new Intent(New_Id.this,HomePage.class);
                startActivity(i1);
                break;
            case R.id.About:
                msg = "About";
                break;
            case R.id.Exit:
                System.exit(0);
                break;
        }
        Toast.makeText(this, msg + "checked", Toast.LENGTH_LONG).show();


        return super.onOptionsItemSelected(item);

    }

    public void onclickbutton(View view) {
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);

        String IdNum = editText3.getText().toString();
        String year = IdNum.substring(0, 4);
        String IdNumber = IdNum.substring(4, 7);
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
        Birthday = year + "/" + month + "/" + day1;

        //    String Gender=gender;
        editText4.setText(Birthday);
        editText5.setText(gender);
    }


    public void onclickbutton2(android.view.View view) {
        Intent intent = new Intent(New_Id.this,TextRecog.class);
        startActivity(intent);
    }
}
