package com.example.order_food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;

    ArrayList<String> foodName=new ArrayList<>();
    ArrayList<String> foodPrice=new ArrayList<>();
    ArrayList<String> minusOne=new ArrayList<>();
    ArrayList<String> value=new ArrayList<>();
    ArrayList<String> plusOne=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listView);
        customListview customview = new customListview(this,foodName,foodPrice,minusOne,value,plusOne);
        list.setAdapter(customview);
    }
    public void addLoungeSpecial(View view){
        foodName.add("Lounge Special");
        foodPrice.add("Rs420.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addChickenPizza(View view){
        foodName.add("Chicken Pizzal");
        foodPrice.add("Rs520.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addBeefPizza(View view){
        foodName.add("Beef Pizza");
        foodPrice.add("Rs620.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addVeggiePizza(View view){
        foodName.add("VeggiePizza");
        foodPrice.add("Rs720.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addBurgers(View view){
        foodName.add("Burgers");
        foodPrice.add("Rs820.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addDrinks(View view){
        foodName.add("Drinks");
        foodPrice.add("Rs20.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addSandwiches(View view){
        foodName.add("Sandwiches");
        foodPrice.add("Rs400.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addDesserts(View view){
        foodName.add("Desserts");
        foodPrice.add("Rs420.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addSides(View view){
        foodName.add("Sides");
        foodPrice.add("Rs320.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
    public void addMeals(View view){
        foodName.add("Meals");
        foodPrice.add("Rs420.00");
        minusOne.add("-");
        value.add("1");
        plusOne.add("+");
    }
}