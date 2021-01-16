package com.spx.maytinh2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        final Button button_7 = findViewById(R.id.btn_7);
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phepToan.length() ==0){
                    // nhập vào số a
                    so_a = Double.parseDouble(button_7.getText().toString());

                }else{
                    so_b = Double.parseDouble(button_7.getText().toString());
                }
            }
        });
        //================= nút bấm cộng
        final Button btn_cong = findViewById(R.id.btn_cong);
        btn_cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phepToan = btn_cong.getText().toString();
            }
        });

        //==== Tính toán
        Button btn_kq = findViewById(R.id.btn_kq);
        btn_kq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phepToan.length()>0){
                    Double KQ ;
                    switch (phepToan){
                        case "+":
                            KQ = so_a + so_b;
                            Toast.makeText(getBaseContext(), String.valueOf(KQ), Toast.LENGTH_SHORT).show();
                            break;
                            ///....
                    }


                }
            }
        });




    }
}