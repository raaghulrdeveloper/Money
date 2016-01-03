package com.project.money;

import android.app.Activity;
import android.view.MenuItem;
import android.widget.Toast;


/**
 * Created by raagh_000 on 1/3/2016.
 */
public class Menu extends Activity {
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void click(MenuItem i)
    {

        Toast.makeText(this, "you clicked the menu", Toast.LENGTH_SHORT).show();

    }
}
