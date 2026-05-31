package com.example.umbb_mobguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFaculties = findViewById(R.id.btnFaculties);
        btnFaculties.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FacultiesActivity.class);
            startActivity(intent);
        });

        TextView tvWebsite = findViewById(R.id.tvWebsite);
        tvWebsite.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.univ-boumerdes.dz"));
            startActivity(intent);
        });
    }
}