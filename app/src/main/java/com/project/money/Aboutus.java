package com.project.money;
import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;


/**
 * Created by raagh_000 on 1/3/2016.
 */
public class Aboutus extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);


}

    public void emailme(View v){

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"raaghulrdev@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Feed Back of Money Boss");
        i.putExtra(Intent.EXTRA_TEXT   , "");
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Aboutus.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }




}
