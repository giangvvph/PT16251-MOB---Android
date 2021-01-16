package com.spx.vidu02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("VD", "Hàm onCreate");

//        TextView tv = findViewById(R.id.tv_title);
//        tv.setTextColor(Color.YELLOW);
//        ImageView imageView = findViewById(R.id.img_avatar);
//
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText( getBaseContext(), "Xin chao", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("VD", "Hàm onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("VD", "Hàm onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("VD", "Hàm onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("VD", "Hàm onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("VD", "Hàm onDestroy");
    }
}