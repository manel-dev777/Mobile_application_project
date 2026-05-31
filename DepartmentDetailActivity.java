package com.example.umbb_mobguide;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class DepartmentDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_detail);

        int facultyIndex = getIntent().getIntExtra("faculty_index", 0);
        int deptIndex = getIntent().getIntExtra("dept_index", 0);

        ArrayList<Faculty> faculties = Dataprovider.getFaculties();
        Faculty faculty = faculties.get(facultyIndex);
        Department dept = faculty.getDepartments().get(deptIndex);

        LinearLayout layoutHero = findViewById(R.id.layoutDeptHero);
        TextView tvIcon = findViewById(R.id.tvDeptIcon);
        TextView tvTitle = findViewById(R.id.tvDeptTitle);
        TextView tvDesc = findViewById(R.id.tvDeptDesc);
        TextView tvSpecialties = findViewById(R.id.tvDeptSpecialties);
        Button btnCall = findViewById(R.id.btnCall);
        Button btnEmail = findViewById(R.id.btnEmail);
        Button btnMap = findViewById(R.id.btnMap);

        layoutHero.setBackgroundColor(Color.parseColor(dept.getColor()));
        tvIcon.setText(dept.getIcon());
        tvTitle.setText(dept.getName());
        tvDesc.setText(dept.getDescription());
        tvSpecialties.setText(dept.getSpecialties());

        btnCall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + dept.getPhone()));
            startActivity(intent);
        });

        btnEmail.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:" + dept.getEmail()));
            startActivity(intent);
        });

        btnMap.setOnClickListener(v -> {
            double lat = faculty.getLatitude();
            double lng = faculty.getLongitude();
            String label = Uri.encode(faculty.getName());
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:" + lat + "," + lng + "?q=" + lat + "," + lng + "(" + label + ")"));
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        });
    }
}