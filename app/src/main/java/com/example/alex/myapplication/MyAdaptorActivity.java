package com.example.alex.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdaptorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_for_adapter_activity_list_view);

        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.text_view, arrayList);

        final ListView listView = (ListView) findViewById(R.id.my_list_view_for_adapter);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, final int position, long id) {

                Toast.makeText(getApplicationContext(), (String) listView.getItemAtPosition(position), Toast.LENGTH_LONG).show();

                view.animate().setDuration(2000).alpha(0)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                arrayList.remove(listView.getItemAtPosition(position));
                                adapter.notifyDataSetChanged();
                                view.setAlpha(1);
                            }
                        });
            }
        });
    }
}
