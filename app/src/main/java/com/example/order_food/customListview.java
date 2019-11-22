package com.example.order_food;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class customListview extends ArrayAdapter<String> {
    private ArrayList<String> foodName;
    private ArrayList<String> foodPrice;
    private ArrayList<String> minusOne;
    private ArrayList<String> value;
    private ArrayList<String> plusOne;



    private Activity activity;
    public customListview(Activity activity,ArrayList<String> foodName,ArrayList<String> foodPrice,ArrayList<String> minusOne,ArrayList<String> value,ArrayList<String> plusOne) {
        super(activity,R.layout.listview_layout,foodName);
        this.activity=activity;


        this.foodName=foodName;
        this.foodPrice=foodPrice;
        this.minusOne=minusOne;
        this.value=value;
        this.plusOne=plusOne;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        viewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_layout, null, true);
            viewHolder = new viewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (viewHolder) r.getTag();
        }

        viewHolder.txt1.setText(foodName.get(position));
        viewHolder.txt2.setText(foodPrice.get(position));
        viewHolder.bMinus.setText(minusOne.get(position));
        viewHolder.bPlus.setText(plusOne.get(position));

        return r;


    }
    class viewHolder
    {
        TextView txt1;
        TextView txt2;
        Button bMinus;
        TextView txt3;
        Button bPlus;


        viewHolder(View v){
            txt1=(TextView) v.findViewById(R.id.foodName);
            txt2=(TextView) v.findViewById(R.id.foodPrice);
            bMinus=(Button) v.findViewById(R.id.minusOne);
            txt3=(TextView) v.findViewById(R.id.value);
            bPlus=(Button) v.findViewById(R.id.plusOne);



        }

    }
}

