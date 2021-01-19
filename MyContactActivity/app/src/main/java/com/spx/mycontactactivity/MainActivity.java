package com.spx.mycontactactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

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

    }
}