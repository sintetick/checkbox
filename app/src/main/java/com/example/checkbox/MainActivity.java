package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxFemale;
    private CheckBox checkBoxMale;
    private TextView textViewGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxFemale = findViewById(R.id.checkBoxFeminin);
        checkBoxMale = findViewById(R.id.checkBoxMasculin);
        textViewGender = findViewById(R.id.textViewGender);

        // Prestabilim genul masculin
        checkBoxMale.setChecked(true);
        textViewGender.setTextColor(ContextCompat.getColor(this, R.color.black));

        checkBoxFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBoxFemale.isChecked()) {
                    checkBoxMale.setChecked(false);
                    checkBoxFemale.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.Feminin));
                    checkBoxMale.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.black));
                } else {
                    checkBoxFemale.setTextColor(ContextCompat.getColor(MainActivity.this, android.R.color.black));
                }
            }
        });

        checkBoxMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBoxMale.isChecked()) {
                    checkBoxFemale.setChecked(false);
                    checkBoxMale.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.Masculin));
                    checkBoxFemale.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.black));
                } else {
                    checkBoxMale.setTextColor(ContextCompat.getColor(MainActivity.this, android.R.color.black));
                }
            }
        });
    }
}
