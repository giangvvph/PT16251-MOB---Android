package com.spx.maytinh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BaiViet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_viet);
        Intent intent = getIntent();
        String hoten = intent.getExtras().getString("name","Giá trị mặc định");
        Toast.makeText(getBaseContext(),hoten,Toast.LENGTH_SHORT).show();

    }
}