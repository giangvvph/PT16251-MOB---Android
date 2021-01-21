package com.spx.demointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TinhToanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_toan);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        double a = bundle.getDouble("so_a");
        double b = bundle.getDouble("so_b");

        double tong = a + b;
        TextView textView = findViewById(R.id.tv_kq);
        textView.setText("" + tong);

    }
}