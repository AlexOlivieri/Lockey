package com.example.alex.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ListMobileActivity extends ListActivity {

    static final String[] MOBILE_OS =
            new String[] { "Android", "iOS", "WindowsMobile", "Blackberry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new MobileArrayAdapter(this, MOBILE_OS));
    }

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id){

        String selectedValuue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValuue, Toast.LENGTH_SHORT).show();
    }
}
