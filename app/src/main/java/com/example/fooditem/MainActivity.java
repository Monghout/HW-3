package com.example.fooditem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void fruitbtn(View v){

        showFoodView("Fruit", R.drawable.f);

    };

    public void Vegbtn(View v){
        showFoodView("Vegetable", R.drawable.v);
    };

    public void drinkbtn(View v){
        showFoodView("Drink", R.drawable.d);
    };
private void showFoodView(String foodName, int drawableImage){

        Bundle dataBundle = new Bundle();
        dataBundle.putString("name", foodName);
        dataBundle.putInt("image",drawableImage);

        Intent intent = new Intent(this, FoodDetails.class);
        intent.putExtras(dataBundle);
        startActivity(intent);

};
    public void openCallApp(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:012 345 678")); // Set data first
        startActivity(intent);  // Then start the activity
    }


    public void websitebtn(View view) {
        String websiteUrl = "https://www.limkokwing.net/cambodia/"; // Replace with your website URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }



}