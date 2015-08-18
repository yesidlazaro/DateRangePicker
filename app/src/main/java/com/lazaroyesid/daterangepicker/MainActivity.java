package com.lazaroyesid.daterangepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.lazaroyesid.daterangepicker.fragments.DateRangePickerFragment;

public class MainActivity extends AppCompatActivity implements DateRangePickerFragment.OnDateRangeSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DateRangePickerFragment dateRangePickerFragment= DateRangePickerFragment.newInstance(MainActivity.this,false);
        dateRangePickerFragment.show(getSupportFragmentManager(),"datePicker");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDateRangeSelected(int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear) {
        Log.d("range : ","from: "+startDay+"-"+startMonth+"-"+startYear+" to : "+endDay+"-"+endMonth+"-"+endYear );
    }
}
