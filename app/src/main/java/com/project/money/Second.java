package com.project.money;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.project.money.Menu;

/**
 * Created by raaghulr on 30-12-2015.
 */
public class Second extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



    }

    public void myfunc(View v)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "you clicked the fab button!!!",Toast.LENGTH_SHORT);
        toast.show();
    }








}



