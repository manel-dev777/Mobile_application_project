package com.example.umbb_mobguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class FacultyAdapter extends ArrayAdapter<Faculty> {

    private Context context;
    private ArrayList<Faculty> faculties;

    public FacultyAdapter(Context context, ArrayList<Faculty> faculties) {
        super(context, 0, faculties);
        this.context = context;
        this.faculties = faculties;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_faculty, parent, false);
        }

        Faculty faculty = faculties.get(position);
        ImageView ivLogo = convertView.findViewById(R.id.ivFacultyLogo);
        TextView tvName = convertView.findViewById(R.id.tvFacultyName);

        tvName.setText(faculty.getName());

        String name = faculty.getName();
        if (name.contains("Sciences (FS)")) ivLogo.setImageResource(R.drawable.logo_fs);
        else if (name.contains("Technology")) ivLogo.setImageResource(R.drawable.logo_ft);
        else if (name.contains("Hydrocarbons")) ivLogo.setImageResource(R.drawable.logo_fhc);
        else if (name.contains("Economic")) ivLogo.setImageResource(R.drawable.inhh);
        else if (name.contains("Law")) ivLogo.setImageResource(R.drawable.law);
        else if (name.contains("Letters")) ivLogo.setImageResource(R.drawable.lettre);
        else if (name.contains("IGEE")) ivLogo.setImageResource(R.drawable.ene);
        else if (name.contains("ISTA")) ivLogo.setImageResource(R.drawable.ista);
        else ivLogo.setImageResource(R.drawable.ic_launcher_foreground);

        return convertView;
    }
}