package com.project.money;

/**
 * Created by raagh_000 on 1/4/2016.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter<String>
{
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] check;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid,String[] check) {
        super(context, R.layout.list, itemname);

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.check=check;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        //TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        //extratxt.setText("Description "+itemname[position]);
        return rowView;

    };
}