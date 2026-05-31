package com.example.umbb_mobguide;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class DepartmentAdapter extends ArrayAdapter<Department> {

    private Context context;
    private ArrayList<Department> departments;

    public DepartmentAdapter(Context context, ArrayList<Department> departments) {
        super(context, 0, departments);
        this.context = context;
        this.departments = departments;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_department, parent, false);
        }

        Department dept = departments.get(position);

        TextView tvIcon = convertView.findViewById(R.id.tvDeptIcon);
        TextView tvName = convertView.findViewById(R.id.tvDeptName);

        tvName.setText(dept.getName());
        tvIcon.setText(dept.getIcon());

        // Set circle background color at 20% opacity of dept color
        int color = Color.parseColor(dept.getColor());
        int transparentColor = Color.argb(50, Color.red(color), Color.green(color), Color.blue(color));
        tvIcon.setBackgroundTintList(ColorStateList.valueOf(transparentColor));

        return convertView;
    }
}