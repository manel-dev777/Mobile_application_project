package com.example.umbb_mobguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class FacultyDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_detail);

        int index = getIntent().getIntExtra("faculty_index", 0);
        ArrayList<Faculty> faculties = Dataprovider.getFaculties();
        Faculty faculty = faculties.get(index);

        TextView tvTitle = findViewById(R.id.tvFacultyTitle);
        TextView tvDesc = findViewById(R.id.tvFacultyDesc);
        Button btnCall = findViewById(R.id.btnCall);
        Button btnSms = findViewById(R.id.btnSms);
        Button btnEmail = findViewById(R.id.btnEmail);
        Button btnMap = findViewById(R.id.btnMap);
        Button btnDepartments = findViewById(R.id.btnDepartments);

        tvTitle.setText(faculty.getName());
        tvDesc.setText(faculty.getDescription());

        btnCall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + faculty.getPhone()));
            startActivity(intent);
        });

        btnSms.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("smsto:" + faculty.getPhone()));
            intent.putExtra("sms_body", "Bonjour, je souhaite avoir des informations.");
            startActivity(intent);
        });

        btnEmail.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:" + faculty.getEmail()));
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

        btnDepartments.setOnClickListener(v -> {
            Intent intent = new Intent(FacultyDetailActivity.this, DepartmentsActivity.class);
            intent.putExtra("faculty_index", index);
            startActivity(intent);
        });
    }
}