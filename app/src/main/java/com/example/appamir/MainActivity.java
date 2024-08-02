package com.example.appamir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutMeButton = findViewById(R.id.button_about_me);
        Button hobbiesButton = findViewById(R.id.button_hobbies);
        Button skillsButton = findViewById(R.id.button_skills);
        Button timetableButton = findViewById(R.id.button_timetable);
        Button uitmWebsiteButton = findViewById(R.id.button_uitm_website);
        Button istudentPortalButton = findViewById(R.id.button_istudent_portal);

        aboutMeButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AboutMeActivity.class)));

        hobbiesButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, HobbiesActivity.class)));

        skillsButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SkillsActivity.class)));

        timetableButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TimetableActivity.class)));

        uitmWebsiteButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, UiTMWebsiteActivity.class)));

        istudentPortalButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, IStudentPortalActivity.class)));
    }
}
