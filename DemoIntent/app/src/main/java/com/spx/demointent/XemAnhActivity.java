package com.spx.demointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class XemAnhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_anh);

        ImageView imageView = findViewById(R.id.img_a);

        imageView.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));
    }
}