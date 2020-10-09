package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity {
    private Button lessonLearntButton;
    private TextView country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.country = findViewById(R.id.country_description_text);
        this.lessonLearntButton = findViewById(R.id.lesson_learnt_button);
        Resources res = getResources();
        String country_text = res.getString(R.string.country_description);
        country.setText(country_text);

        this.lessonLearntButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLessonLearntButton();
            }
        });

    }
    private void onLessonLearntButton() {
    Log.v("Learned", "Yay the lesson was learned!");
    }


}
