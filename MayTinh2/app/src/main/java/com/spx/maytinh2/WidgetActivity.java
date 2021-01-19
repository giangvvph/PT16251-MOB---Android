package com.spx.maytinh2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WidgetActivity extends AppCompatActivity {
    public String[] ds_mon = {"Toán", "Lý", "Hóa", "Tin","Văn","Sử","Địa"};
    public ArrayAdapter <String> arrayAdapterMonHoc;
    ListView listViewMonHoc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        arrayAdapterMonHoc = new ArrayAdapter<String>(this, R.layout.list_view_item, R.id.tv_row, ds_mon );

        listViewMonHoc = findViewById(R.id.lv_monhoc);
        listViewMonHoc.setAdapter(arrayAdapterMonHoc);

    }
}