package com.example.alex.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityWithArrayAdapterExtension extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_with_array_adapter_extension);

        final ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("iPhones");
        myArrayList.add("Lg");

        MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, myArrayList);

        ListView listView = (ListView) findViewById(R.id.my_list_view_for_adapter);
        listView.setAdapter(adapter);

    }
}
