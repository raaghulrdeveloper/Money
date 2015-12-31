package com.project.money;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.project.money.R;

public class MainActivity extends AppCompatActivity {


    ImageButton img_day;
    ImageView bg;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       img_day=(ImageButton)findViewById(R.id.bt_day);


    /* adapt the image to the size of the display */
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        Bitmap bmp = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(
                getResources(),R.drawable.bg),size.x,size.y,true);

    /* fill the background ImageView with the resized image */
        ImageView iv_background = (ImageView) findViewById(R.id.img_bg);
        iv_background.setImageBitmap(bmp);
      //  bg=(ImageView)findViewById(R.id.bg);



    }

    public void clickme(View v)
    {

        Intent i=new Intent(this,Second.class);
        startActivity(i);
    }
}
