package com.example.android.audiobookster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Listen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);

        // Find the View that shows the Description tab
        TextView Description = (TextView) findViewById(R.id.Description);

        // Set a click listener on that View
        Description.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Description tab is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DescriptionActivity}
                Intent DescriptionIntent = new Intent(Listen.this, Description.class);

                // Start the new activity
                startActivity(DescriptionIntent);
            }
        });

        // Find the View that shows the Contents tab
        TextView Contents = (TextView) findViewById(R.id.Contents);

        // Set a click listener on that View
        Contents.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Contents tab is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ContentsActivity}
                Intent ContentsIntent = new Intent(Listen.this, Contents.class);

                // Start the new activity
                startActivity(ContentsIntent);
            }
        });

    }
}
