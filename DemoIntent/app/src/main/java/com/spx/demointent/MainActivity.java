package com.spx.demointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void TinhTong(View view){
        EditText editText_a = findViewById(R.id.ed_a);
        EditText editText_b = findViewById(R.id.ed_b);

        double so_a = Double.parseDouble(editText_a.getText().toString());
        double so_b = Double.parseDouble(editText_b.getText().toString());

        //--- tạo intent để gửi dữ liệu sang activity tính toán.
        Intent intent = new Intent(this, TinhToanActivity.class);
        //--- đóng gói dữ liệu
        Bundle bundle = new Bundle();
        bundle.putDouble("so_a", so_a);
        bundle.putDouble("so_b",so_b);
        // gửi vào intent
        intent.putExtra("bundle", bundle);
        // khởi động activity
        startActivity(intent);
    }
}