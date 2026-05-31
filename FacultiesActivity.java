package com.example.umbb_mobguide;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class FacultiesActivity extends AppCompatActivity {

    ArrayList<Faculty> allFaculties;
    ArrayList<Faculty> filteredFaculties;
    FacultyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculties);

        allFaculties = Dataprovider.getFaculties();
        filteredFaculties = new ArrayList<>(allFaculties);
        adapter = new FacultyAdapter(this, filteredFaculties);

        ListView listView = findViewById(R.id.listViewFaculties);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Faculty selected = filteredFaculties.get(position);
            int realIndex = allFaculties.indexOf(selected);
            Intent intent = new Intent(FacultiesActivity.this, FacultyDetailActivity.class);
            intent.putExtra("faculty_index", realIndex);
            startActivity(intent);
        });

        EditText searchBox = findViewById(R.id.searchFaculty);
        searchBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filteredFaculties.clear();
                String query = s.toString().toLowerCase().trim();
                if (query.isEmpty()) {
                    filteredFaculties.addAll(allFaculties);
                } else {
                    for (Faculty f : allFaculties) {
                        if (f.getName().toLowerCase().contains(query)) {
                            filteredFaculties.add(f);
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