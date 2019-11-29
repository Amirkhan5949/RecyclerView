package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;
import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imageView = findViewById(R.id.image);
        Picasso.get().load(getIntent().getStringExtra("image")).into(imageView);
        imageView.setOnTouchListener(new ImageMatrixTouchHandler(this));
    }
}
