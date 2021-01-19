package com.spx.mycontactactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Person> list_person;
    ListPersonAdapter listPersonAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_person = new ArrayList<Person>();

        list_person.add( new Person(1,"Nguyen A","0911111111")  );
        list_person.add( new Person(2,"Nguyen B","0912222222")  );
        list_person.add( new Person(3,"Nguyen C","0912333333")  );

        listPersonAdapter = new ListPersonAdapter(list_person);
        listView = findViewById(R.id.lv_contact);
        listView.setAdapter(listPersonAdapter);
        //==================================================
        // sự kiện bấm chuột vào item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Person ps  = (Person) list_person.get(position);  // lấy thông tin phần tử ở dòng được bấm vào

                Toast.makeText(getBaseContext(), ps.Name + " --- " + ps.Phone,Toast.LENGTH_SHORT).show();
            }
        });

        // sự kiện bấm giữ lâu sẽ xóa
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                list_person.remove(position);  // xóa phần tử ở vị trí tương ứng trong ArrayList

                listPersonAdapter.notifyDataSetChanged(); // Báo cho adapter biết có sự thay đổi dữ liệu nguồn, adapter sẽ cập nhật lại danh sách và hiển thị lại

                Toast.makeText(getBaseContext(), "1 row Deleted",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}