package com.example.alex.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Alex on 1/20/2016.
 */
public class MobileArrayAdapter extends ArrayAdapter<String>{

    private final Context context;
    private final String[] values;

    public MobileArrayAdapter(Context context, String[] values) {
        super(context, R.layout.list_mobile, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_mobile, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);

        String operativeSystem = values[position];

        if(operativeSystem.equals("WindowsMobile")){
            imageView.setImageResource(R.drawable.windowsmobile_logo);
        }else if(operativeSystem.equals("iOS")){
            imageView.setImageResource(R.drawable.ios_logo);
        }else if(operativeSystem.equals("Blackberry")){
            imageView.setImageResource(R.drawable.blackberry_logo);
        } else if(operativeSystem.equals("Android")){
            imageView.setImageResource(R.drawable.android_logo);
        }

        return rowView;
    }
}
