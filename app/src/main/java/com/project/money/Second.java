package com.project.money;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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
        //Intent i= new Intent(Second.this,Third.class);
        Intent i= new Intent(Second.this,Listitem.class);
        startActivity(i);

    }


    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void click(MenuItem i) {

        Toast.makeText(this, "you clicked the menu", Toast.LENGTH_SHORT).show();

    }

    public void about(MenuItem item)
    {
        Intent i= new Intent(Second.this,Aboutus.class);
        startActivity(i);
    }







}



