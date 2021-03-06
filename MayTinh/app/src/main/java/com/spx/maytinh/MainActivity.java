package com.spx.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // khai bao cac bien
        final EditText ed_so_a = findViewById(R.id.ed_so_a);
        final EditText ed_so_b = findViewById(R.id.ed_so_b);
        final TextView tv_ketqua = findViewById(R.id.tv_ketqua);

        Button btn_cong = findViewById(R.id.btn_cong);
        Button btn_tru = findViewById(R.id.btn_tru);
        Button btn_nhan = findViewById(R.id.btn_nhan);
        Button btn_chia = findViewById(R.id.btn_chia);
        // -- set action
        btn_cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                double so_a = Double.parseDouble(  ed_so_a.getText().toString() );
//                double so_b = Double.parseDouble( ed_so_b.getText().toString()  );
//
//                double kq = so_a + so_b;
//                tv_ketqua.setText(  String.valueOf(kq)  );

                try{
                    double so_a = Double.parseDouble(  ed_so_a.getText().toString() );
                    double so_b = Double.parseDouble( ed_so_b.getText().toString()  );

                    double kq = so_a + so_b;
                    tv_ketqua.setText(  String.valueOf(kq)  );
                }catch (Exception ex) {

                    Toast.makeText(getBaseContext(),"Hay nhap so truoc khi tinh toan", Toast.LENGTH_LONG).show();
                    ed_so_a.setText(""); // xóa rỗng ô nhập text
                    ed_so_b.setText("");// xóa rỗng ô nhập text
                }


                //==== Log -----
                Log.d("Vidu", "Vi du log");
                Log.e("Vidu", "Vi du log");
                Log.v("Vidu", "Vi du log");
                Log.i("Vidu", "Vi du log");
                Log.d("Vidu", ed_so_a.getText().toString());
//                Log.i("Vidu", "Ket qua: " + kq);

            }
        });





        Button btn_info = findViewById(R.id.btn_info);
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Info.class);
                startActivity(intent);
            }
        });


    }


}