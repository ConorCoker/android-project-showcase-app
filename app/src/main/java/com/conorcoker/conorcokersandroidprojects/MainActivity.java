package com.conorcoker.conorcokersandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project[] projects = {
                new Project("Getting Started App", "Our Very first project, the default 'Hello World' app!", R.drawable.let_s_get_started_let_s_get_started_written_notepad_pencil_yellow_background_business_concept_131346760),
                new Project("Quotes R Us", "Making a simple change to the layout, with my own personal motivational quote for software developers", R.drawable.istock_1009861190_quotation_marks_e1587599701388),
                new Project("BMI Calculator", "A real life working BMI calculator teaching me Variables, Methods and Conditional Logic", R.drawable.siora_photography_cixohzdpnio_unsplash),
                new Project("Inches to Metres App", "A basic converter to convert inches to meters (my own personal calculator app made on my own)", R.drawable.eleven_inches_10232430),
                new Project("The Hungry Tiger", "A menu app for a fictional restaurant, learning about Activities, Classes & Objects, Arrays, Intents and ListViews", R.drawable.spaghettimeatballs_1024x768)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);


    }
}