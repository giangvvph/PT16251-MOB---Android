package com.spx.mycontactactivity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPersonAdapter extends BaseAdapter {
    final  ArrayList<Person> list_person;

    public ListPersonAdapter(ArrayList<Person> list_person) {
        this.list_person = list_person;
    }


    @Override
    public int getCount() {
//        return 0;
        return list_person.size();
    }

    @Override
    public Object getItem(int position) {
//        return null;
        return  list_person.get(position);
    }

    @Override
    public long getItemId(int position) {
//        return 0;
        Person ps = list_person.get(position);
        return  ps.ID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        return null;
        View row;
        if(convertView == null){
            row = View.inflate(parent.getContext(),R.layout.list_view_item,null);
        }else{
            row = convertView;
        }
        // gắn dữ liệu vào view
        Person objPersion = list_person.get(position);
        TextView _id = (TextView) row.findViewById(R.id.tv_id);
        _id.setText("" + objPersion.ID);

        TextView _name = (TextView) row.findViewById(R.id.tv_name);
        _name.setText(objPersion.Name);

        TextView _phone = (TextView) row.findViewById(R.id.tv_phone);
        _phone.setText(objPersion.Phone);

        return row;
    }
}
