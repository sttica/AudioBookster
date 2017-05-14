package com.example.android.audiobookster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Contents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);

        // Find the View that shows the Description tab
        TextView Listen = (TextView) findViewById(R.id.Listen);

        // Set a click listener on that View
        Listen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Description tab is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DescriptionActivity}
                Intent ListenIntent = new Intent(Contents.this, Listen.class);

                // Start the new activity
                startActivity(ListenIntent);
            }
        });

        // Find the View that shows the Description tab
        TextView Description = (TextView) findViewById(R.id.Description);

        // Set a click listener on that View
        Description.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Description tab is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DescriptionActivity}
                Intent DescriptionIntent = new Intent(Contents.this, Description.class);

                // Start the new activity
                startActivity(DescriptionIntent);
            }
        });

    }
}
