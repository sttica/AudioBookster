package com.example.android.audiobookster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the example to show the listen view
        LinearLayout Listen1 = (LinearLayout) findViewById(R.id.Listen1);

        // Set a click listener on that View
        Listen1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link listen}
                Intent listenIntent = new Intent(MainActivity.this, Listen.class);

                // Start the new activity
                startActivity(listenIntent);
            }
        });

        // Find the example to show the listen view
        LinearLayout Listen2 = (LinearLayout) findViewById(R.id.Listen2);

        // Set a click listener on that View
        Listen2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link listen}
                Intent listenIntent = new Intent(MainActivity.this, Listen.class);

                // Start the new activity
                startActivity(listenIntent);
            }
        });

        // Find the example to show the listen view
        LinearLayout Listen6 = (LinearLayout) findViewById(R.id.Listen6);

        // Set a click listener on that View
        Listen6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link listen}
                Intent listenIntent = new Intent(MainActivity.this, Listen.class);

                // Start the new activity
                startActivity(listenIntent);
            }
        });

        // Find the example to show the listen view
        LinearLayout Listen7 = (LinearLayout) findViewById(R.id.Listen7);

        // Set a click listener on that View
        Listen7.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link listen}
                Intent listenIntent = new Intent(MainActivity.this, Listen.class);

                // Start the new activity
                startActivity(listenIntent);
            }
        });

      }

}
