package com.aakib.viewbinding;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    ImageView onlineImage1;
    ImageView onlineImage2;
    ImageView onlineImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        getSupportActionBar().setTitle("Online Images from internet");
        onlineImage1 = findViewById(R.id.imageView1);
        onlineImage2 = findViewById(R.id.imageView2);
        onlineImage3 = findViewById(R.id.imageView3);

        String url = "https://p0.pikist.com/photos/206/449/squid-stir-fry-squid-training-years-cooking-recipe-korea-food-fried-squid.jpg";
        String url1 = "https://p0.pxfuel.com/preview/117/857/65/cake-cheesecake-dessert-sweet.jpg";
        Picasso.get().load(url).placeholder(R.drawable.avatar).into(onlineImage1);
        Picasso.get().load(url1).placeholder(R.drawable.avatar).into(onlineImage2);
        Picasso.get().load(url).placeholder(R.drawable.avatar).into(onlineImage3);
    }
}