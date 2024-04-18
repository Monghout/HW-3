package com.example.fooditem;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetails extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.fdetail);
                Bundle dataBundle = getIntent().getExtras();
                String foodName = dataBundle.getString("name");
                int img = dataBundle.getInt("image");

                TextView foodTextview = findViewById(R.id.t1);
                ImageView image = findViewById(R.id.fi2);

                foodTextview.setText(foodName);
                image.setImageResource(img);



        }
}