package com.spx.maytinh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.acitivty_maytinh_relative);

        Intent intent = new Intent(getBaseContext(), WidgetActivity.class);
        startActivity(intent);

    }
    public void XemBaiViet(View view){
        Intent intent = new Intent(getBaseContext(), MayTinhActivity.class);
        intent.putExtra("name","Nguyen Van A");
        startActivity(intent);
    }
}