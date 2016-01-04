package com.project.money;

/**
 * Created by raagh_000 on 1/4/2016.
 */


        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.Toast;

public class Listitem extends Activity {

    ListView list;
    String[] itemname ={
            "PHONE",
            "SHOPPING",
            "HEALTH",
            "ENTERTAINMENT",
            "GAMES",
            "TRAVEL",
            "RENT",
            "PHONE",
            "SHOPPING",
            "HEALTH",
            "ENTERTAINMENT",
            "GAMES",
            "TRAVEL",

    };

    Integer[] imgid={
            R.drawable.ic_action1,
            R.drawable.ic_action,
            R.drawable.ic_action2,
            R.drawable.ic_action3,
            R.drawable.ic_action4,
            R.drawable.ic_action5,
            R.drawable.home,
            R.drawable.ic_action1,
            R.drawable.ic_action,
            R.drawable.ic_action2,
            R.drawable.ic_action3,
            R.drawable.ic_action4,
            R.drawable.ic_action5,
            R.drawable.home
    };
    String[] check={

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_list);


        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid,check);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Selecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
