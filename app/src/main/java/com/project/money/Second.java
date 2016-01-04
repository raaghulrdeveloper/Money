package com.project.money;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by raaghulr on 30-12-2015.
 */
public class Second extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        Bitmap bmp = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(
                getResources(), R.drawable.bg),size.x,size.y,true);
        ImageView iv_background = (ImageView) findViewById(R.id.img_bg2);
        iv_background.setImageBitmap(bmp);



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



