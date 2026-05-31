package com.example.umbb_mobguide;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class DepartmentsActivity extends AppCompatActivity {

    ArrayList<Department> allDepartments;
    ArrayList<Department> filteredDepartments;
    DepartmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);

        int facultyIndex = getIntent().getIntExtra("faculty_index", 0);
        ArrayList<Faculty> faculties = Dataprovider.getFaculties();
        Faculty faculty = faculties.get(facultyIndex);

        allDepartments = faculty.getDepartments();
        filteredDepartments = new ArrayList<>(allDepartments);
        adapter = new DepartmentAdapter(this, filteredDepartments);

        ListView listView = findViewById(R.id.listViewDepartments);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Department selected = filteredDepartments.get(position);
            int realIndex = allDepartments.indexOf(selected);
            Intent intent = new Intent(DepartmentsActivity.this, DepartmentDetailActivity.class);
            intent.putExtra("faculty_index", facultyIndex);
            intent.putExtra("dept_index", realIndex);
            startActivity(intent);
        });

        EditText searchBox = findViewById(R.id.searchDepartment);
        searchBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filteredDepartments.clear();
                String query = s.toString().toLowerCase().trim();
                if (query.isEmpty()) {
                    filteredDepartments.addAll(allDepartments);
                } else {
                    for (Department d : allDepartments) {
                        if (d.getName().toLowerCase().contains(query)) {
                            filteredDepartments.add(d);
                        }
                    }
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}