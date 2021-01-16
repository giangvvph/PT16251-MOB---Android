package com.spx.maytinh2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MayTinhActivity extends AppCompatActivity {
    public double so_a;
    public double so_b;
    public String phepToan="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_may_tinh);
    }

    public void NumberClick(View view){
        Button btn = (Button)view;
        if(this.phepToan.length() ==0){
            // nhập vào số a
            so_a = Double.parseDouble(btn.getText().toString());
        }else{
            so_b = Double.parseDouble(btn.getText().toString());
        }
    }

    public void ChonPhepToan(View view){
        Button btn = (Button)view;  // Chuyển kiểu view thành nút bấm
        this.phepToan = btn.getText().toString(); // lấy ký tự trên nút bấm gán vào biến
        Log.d("aaa", this.phepToan);
    }

    public void KetQua(View view){
        if(this.phepToan.length()>0){
            Double KQ ;
            switch (this.phepToan){
                case "+":
                    KQ = so_a + so_b;
                    Toast.makeText(getBaseContext(), String.valueOf(KQ), Toast.LENGTH_SHORT).show();
                    break;
                ///....
                case "-":
                    KQ = so_a - so_b;
                    Toast.makeText(getBaseContext(), String.valueOf(KQ), Toast.LENGTH_SHORT).show();
                    break;
                case "x":
                    KQ = so_a * so_b;
                    Toast.makeText(getBaseContext(), String.valueOf(KQ), Toast.LENGTH_SHORT).show();
                    break;
                case ":":
                    KQ = so_a / so_b;
                    Toast.makeText(getBaseContext(), String.valueOf(KQ), Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    public void Reset(View view){
        this.phepToan = "";
    }
}