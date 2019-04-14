package com.example.inclassassignment09_seank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference dishRef = database.getReference("Dish");
    private DatabaseReference dishesRef = database.getReference("Different Dish");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set(View view) {dishRef.setValue(new Dish("Roast beef",32,false));}

    public void add(View view) {
        dishesRef.push().setValue(new Dish("Tomato Salad",16,true));}

}